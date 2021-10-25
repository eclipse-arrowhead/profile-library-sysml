package org.eclipse.papyrus.designer.languages.arrowhead.codegen.xtend

import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.Type

class OpenAPIPaths {
	
	static def generatePath(Type classifier)'''
		«IF classifier instanceof Classifier»
			«FOR op : classifier.allOperations»
				/«classifier.name»/«op.name»:
				    «OpenAPIOperation.generateOperation(op)»
			«ENDFOR»
		«ENDIF»
	'''
}
