package org.eclipse.papyrus.designer.languages.arrowhead.codegen.xtend

import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Property
import java.util.Set


class OpenAPISchemas {
	
	static def generateSchema(Set<Class> schemas)'''
		«FOR schema : schemas»
			«schema.name»:
			    type: object
			    «IF schema.allAttributes() !== null»
			    	«IF schema.allAttributes().length > 0»
			    		properties: 
			    		    «FOR att : schema.allAttributes()»
			    		    	«IF att.type !== null»
			    		    		«att.name»:
			    		    		    «IF schemas.contains(att.type)»
			    		    		    	«IF att.unique»
			    		    		    		type: object
			    		    		    	«ELSE»
			    		    		    		type: array
			    		    		    	«ENDIF»
			    		    		    	items: 
			    		    		    	    $ref: "#/components/schemas/«att.type.name»"
							«ELSE»
								«transferPrimitiveTypes(att.type.name.toLowerCase)»
							«ENDIF»
						«ENDIF»
					«ENDFOR»
				«ENDIF»
			«ENDIF»
			«ENDFOR»
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
}
