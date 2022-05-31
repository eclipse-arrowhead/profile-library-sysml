package org.eclipse.papyrus.arrowhead.profile.java.validation.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Port;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceDescription;

public class SysDConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		// TODO Auto-generated method stub
		Class elt = (Class) ctx.getTarget();

		if (ConstraintsUtil.verifyArrowheadApplied(elt)) {
			// 1. verify if the port is typed

			for (Port port : elt.getOwnedPorts()) {
				if (port.getType() == null) {
					return ctx.createFailureStatus("Port should have a type (" + elt.getQualifiedName() + ")");
				} else {// 2. verify if the port is correctly typed
					ServiceDescription serviceDescription = UMLUtil.getStereotypeApplication(port,
							ServiceDescription.class);
					if (serviceDescription == null) {
					

							return ctx.createFailureStatus(
									"Port should be typed by a serviceDescription (" + port.getQualifiedName() + ")");
					}
				}
			}
		}
		return ctx.createSuccessStatus();
	}

}
