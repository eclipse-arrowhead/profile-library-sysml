/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DataSemantics;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.OntologyKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Semantics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DataSemanticsImpl#getSemanticModel <em>Semantic Model</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DataSemanticsImpl#getOntology <em>Ontology</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DataSemanticsImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DataSemanticsImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSemanticsImpl extends MinimalEObjectImpl.Container implements DataSemantics {
	/**
	 * The cached value of the '{@link #getSemanticModel() <em>Semantic Model</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticModel()
	 * @generated
	 * @ordered
	 */
	protected EList<String> semanticModel;

	/**
	 * The cached value of the '{@link #getOntology() <em>Ontology</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntology()
	 * @generated
	 * @ordered
	 */
	protected EList<OntologyKind> ontology;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<String> schema;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSemanticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.DATA_SEMANTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSemanticModel() {
		if (semanticModel == null) {
			semanticModel = new EDataTypeUniqueEList<String>(String.class, this, ArrowheadSysMLProfilePackage.DATA_SEMANTICS__SEMANTIC_MODEL);
		}
		return semanticModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OntologyKind> getOntology() {
		if (ontology == null) {
			ontology = new EDataTypeUniqueEList<OntologyKind>(OntologyKind.class, this, ArrowheadSysMLProfilePackage.DATA_SEMANTICS__ONTOLOGY);
		}
		return ontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSchema() {
		if (schema == null) {
			schema = new EDataTypeUniqueEList<String>(String.class, this, ArrowheadSysMLProfilePackage.DATA_SEMANTICS__SCHEMA);
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.DATA_SEMANTICS__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DATA_SEMANTICS__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__SEMANTIC_MODEL:
				return getSemanticModel();
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__ONTOLOGY:
				return getOntology();
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__SCHEMA:
				return getSchema();
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__SEMANTIC_MODEL:
				getSemanticModel().clear();
				getSemanticModel().addAll((Collection<? extends String>)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__ONTOLOGY:
				getOntology().clear();
				getOntology().addAll((Collection<? extends OntologyKind>)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__SCHEMA:
				getSchema().clear();
				getSchema().addAll((Collection<? extends String>)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__SEMANTIC_MODEL:
				getSemanticModel().clear();
				return;
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__ONTOLOGY:
				getOntology().clear();
				return;
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__SCHEMA:
				getSchema().clear();
				return;
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__SEMANTIC_MODEL:
				return semanticModel != null && !semanticModel.isEmpty();
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__ONTOLOGY:
				return ontology != null && !ontology.isEmpty();
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__SCHEMA:
				return schema != null && !schema.isEmpty();
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS__BASE_CLASS:
				return base_Class != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (SemanticModel: ");
		result.append(semanticModel);
		result.append(", Ontology: ");
		result.append(ontology);
		result.append(", Schema: ");
		result.append(schema);
		result.append(')');
		return result.toString();
	}

} //DataSemanticsImpl
