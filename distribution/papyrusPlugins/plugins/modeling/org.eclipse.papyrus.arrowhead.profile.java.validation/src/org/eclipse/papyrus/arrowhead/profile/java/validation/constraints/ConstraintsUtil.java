package org.eclipse.papyrus.arrowhead.profile.java.validation.constraints;


import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.util.UMLUtil;

public class ConstraintsUtil {
	public static Boolean verifyArrowheadApplied(Element elt) {
		Boolean isArrowheadModel = false;
		Model model = elt.getModel();
		if ((model != null) && (model instanceof Package)) {

			Profile robotml = UMLUtil.getProfile(ArrowheadSysMLProfilePackage.eINSTANCE, model);

			if (((Package) model).isProfileApplied(robotml)) {
				isArrowheadModel = true;
			}



		}
		return isArrowheadModel;
	}

}
