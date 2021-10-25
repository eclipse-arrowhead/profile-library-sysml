package org.eclipse.papyrus.designer.languages.arrowhead.codegen.xtend

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DataSemantics
import org.eclipse.papyrus.designer.languages.arrowhead.codegen.utils.ParameterUtils
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Operation

import static extension org.eclipse.uml2.uml.util.UMLUtil.getStereotypeApplication
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.Parameter
import java.util.HashSet
import java.util.Set
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpOperation
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.MultiplicityElement

class OpenAPIOperation {
	
	static Set<Parameter> paras = new HashSet<Parameter>();
	static Set<Parameter> requests = new HashSet<Parameter>();
	static Set<Parameter> responses = new HashSet<Parameter>();
	static int countInstance = 0;
	static boolean createSchema = true
	static boolean thisSchema = true
	
	def static generateOperation(Operation op) '''
		«paras.clear»
		«requests.clear»
		«responses.clear»
		«val hm = verifyHTTPmethod(op)»«hm»:
		    operationId: «op.name»Using«hm»
		    «IF op.ownedParameters.size !== 0»
		    	«FOR para : op.ownedParameters»
		    		«verifySchema(para.type)»
		    		«grouping(para)»
		    	«ENDFOR»
		    «ENDIF»
		    «IF paras.size > 0 && requests.size > 0»
		    	requestBody:
		    	    content:
		    	        application/json:
		    	            schema:
		    	                $ref: "#/components/schemas/«generateComplexeRequestBody()»"
		    «ELSEIF paras.size > 0 && requests.size === 0»
		    	parameters:
		    	    «FOR para : paras»
		    	    	«generateParameters(para)»
		    	    «ENDFOR»
		    «ELSEIF requests.size > 0 && paras.size === 0»
		    	requestBody:
		    	    «FOR para : requests»
		    	    	«generateRequestBody(para)»
		    	«ENDFOR»
		    «ENDIF»
		    responses: 
		        «IF responses.size === 1»
		        	«FOR para : responses»
		        		«generateResponses(para.type, hm)»
		        	«ENDFOR»
		        «ELSEIF responses.size > 1»
		        	
		        «ENDIF»
		        "400":
		              description: Invalid
		        "500":
		              description: Core service not available
		
	'''
	
	def static generateRequestBody(Parameter para) '''
		«IF OpenAPIGenerator.schemas.contains(para.type)»
			content:    
			    application/json:
			        schema:
			            $ref: "#/components/schemas/«para.type.name»"
		«ENDIF»
	'''
	def static generateResponseList(){
		
	}
	
	def static generateComplexeRequestBody(){
		// Verify if we need to create a new schema or not
		val setParas = new HashSet
		setParas.addAll(paras)
		setParas.addAll(requests)
		for (schema : OpenAPIGenerator.schemas){
			thisSchema = true
			if (schema.attributes.size == setParas.size ){
				val types = new HashSet
				for (para : setParas){
					types.add(para.type)
				}
				for (att : schema.attributes){
					if(!types.contains(att.type)){
						thisSchema = false
					}
				}
			}else{
				thisSchema = false
			}
			if (thisSchema == true){
				createSchema = false
				return schema.name
			}
		}
		// Create a new Schema
		if(createSchema == true){
			val cl = UMLFactory.eINSTANCE.createClass
			cl.name="ComplexRequstForm"+countInstance
			countInstance++
			for (para : paras){
				cl.createOwnedAttribute(para.name, para.type);
				cl.getAttribute(para.name, para.type).isUnique = para.unique
			}
			for (para : requests){
				cl.createOwnedAttribute(para.name, para.type);
				cl.getAttribute(para.name, para.type).isUnique = para.unique
			}
			OpenAPIGenerator.schemas.add(cl)
			return cl.name
		}		
	}

	
	def static verifySchema(Type cl){
		if (cl !== null){
			val ds = cl.getStereotypeApplication(DataSemantics)
			if (ds !== null){
				OpenAPIGenerator.schemas.add(cl as Class)
			}
		}
		
		return null
	}
	
	def static generateParameters(Parameter para)'''
		- name: «para.name»
		  in: query
		  required: false
		  schema: 
		      «IF para.type !== null»«transferPrimitiveTypes(para.type.name.toLowerCase)»«ENDIF»
	'''
	def static generateResponses(Type type, String hm)'''
		"200": 
		    description: OK
		    «IF OpenAPIGenerator.schemas.contains(type)» 
		    	content:    
		    	    application/json:
		    	       schema:
		    	          $ref: "#/components/schemas/«type.name»"
			  «ENDIF»
	'''
	
	def static transferPrimitiveTypes(String str){
		if (str == "elong"){
			'''
				type: integer
				format: int64
			'''
		}else if(str == "integer"){
			'''
				type: integer
				format: int32
			'''
		}else if(str == "edouble"){
			'''
				type: number
				format: double
			'''
		}else if(str == "string"){
			'''
				type: string
			'''
		}else{
			'''
				«str»
			'''
		}
	}
	
	def static grouping(Parameter para) {
		//pas de sens par ce que on a fait verifySchema qui a ajouté le para.type a shemas
		if ((para.direction == ParameterUtils.IN)&&(!OpenAPIGenerator.schemas.contains(para.type))){
			paras.add(para);
		}
		if ((para.direction == ParameterUtils.IN)&&(OpenAPIGenerator.schemas.contains(para.type))){
			requests.add(para);
		}
		if ((para.direction == ParameterUtils.INOUT)&&(OpenAPIGenerator.schemas.contains(para.type))){
			requests.add(para);
			responses.add(para);
		}
		if (para.direction == ParameterUtils.RETURN){
			responses.add(para);
		}
		if (para.direction == ParameterUtils.OUT){
			responses.add(para);
			// «IF para.defaultValue !== null»«para.defaultValue.name»«ENDIF»
		}
		return null
	}
	
	def static verifyHTTPmethod(Operation op){
		
		val httpMethod = op.getStereotypeApplication(HttpOperation)
		if (httpMethod !== null){
			return httpMethod.kind.toString.toLowerCase
		} 
		// In case that people forget to define the stereotype to an operation
		else if (op.ownedParameters.size!=0){
			// We consider that for each operation, the parameters have the same effect.
			val effect = op.ownedParameters.get(0).effect;
			// We only have "create", "read", "delete" and "update" in Papyrus Parameters.
			if (effect === ParameterUtils.CREATE){
				return "post"
			} else if (effect === ParameterUtils.READ){
				return "get"
			} else if (effect === ParameterUtils.DELETE){
				return "delete"
			} else if (effect === ParameterUtils.UPDATE){
				return "put"
			}
			else return "post"
		}
	}
}
