package org.eclipse.papyrus.designer.languages.arrowhead.codegen.xtend

import org.eclipse.papyrus.designer.languages.arrowhead.codegen.preferences.CustomizeDialog
import org.eclipse.swt.widgets.Display
import org.eclipse.uml2.uml.Class
import org.eclipse.jface.window.Window

class OpenAPIInfo {
	
	static def readInfo(Class clazz, boolean client){
		val cd = new CustomizeDialog(Display.current.activeShell)
		cd.create(clazz, client)
		if (cd.open === Window.OK){
			'''
				description: «cd.description»
				title: «cd.title»
				contact: 
				    name: «cd.contactName»
				    email: «cd.contactEmail»
				version: 0.0.1
			'''
		}
	}
}
