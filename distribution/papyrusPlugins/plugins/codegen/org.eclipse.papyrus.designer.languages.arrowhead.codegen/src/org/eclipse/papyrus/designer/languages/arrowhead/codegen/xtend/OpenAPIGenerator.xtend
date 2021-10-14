package org.eclipse.papyrus.designer.languages.arrowhead.codegen.xtend

import java.util.HashSet
import java.util.Set
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Port

class OpenAPIGenerator {
	
	static Set<Class> schemas = new HashSet<Class>();
	
	static def generateOpenAPIyaml(Class clazz) '''
		«schemas.clear»
		openapi: 3.0.1
		info: 
		    «OpenAPIInfo.readInfo(clazz, false)»
		paths: 
		«FOR attribute : clazz.attributes»
			«IF attribute instanceof Port»
				«IF !attribute.isConjugated»
					«val classifier = attribute.type»
					    «OpenAPIPaths.generatePath(classifier)»
				«ENDIF»
			«ENDIF»
		«ENDFOR»
		components: 
		    schemas: 
		      «OpenAPISchemas.generateSchema(schemas)»
	'''
	static def generateOpenAPIClientyaml(Class clazz) '''
		«schemas.clear»
		openapi: 3.0.1
		info: 
		    «OpenAPIInfo.readInfo(clazz, true)»
		paths: 
		«FOR attribute : clazz.attributes»
			«IF attribute instanceof Port»
				«IF attribute.isConjugated»
					«val classifier = attribute.type»
					    «OpenAPIPaths.generatePath(classifier)»
				«ENDIF»
			«ENDIF»
		«ENDFOR»
		components: 
		    schemas: 
		      «OpenAPISchemas.generateSchema(schemas)»
	'''
		
	static def getSchemas(){
		return schemas;
	}
	
}
