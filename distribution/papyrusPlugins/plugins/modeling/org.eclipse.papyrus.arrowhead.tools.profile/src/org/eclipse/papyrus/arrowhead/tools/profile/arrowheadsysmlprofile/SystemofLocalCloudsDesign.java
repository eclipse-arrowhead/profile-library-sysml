/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Systemof Local Clouds Design</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSystemofLocalCloudsDesign()
 * @model
 * @generated
 */
public interface SystemofLocalCloudsDesign extends Block, Identifiable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * let properties : Set (UML::Property) = self.base_Class.attribute 
	 * in 
	 * properties->notEmpty() 
	 * implies 
	 * properties-> forAll(p|p.type->exists(t| not(t.getAppliedStereotype ('Arrowhead::LocalCloudDesign')->isEmpty()) )) 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean SoLCDpropertyType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SystemofLocalCloudsDesign
