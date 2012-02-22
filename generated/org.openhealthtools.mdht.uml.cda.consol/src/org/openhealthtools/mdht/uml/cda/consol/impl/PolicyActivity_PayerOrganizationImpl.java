/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_PayerOrganization;

import org.openhealthtools.mdht.uml.cda.consol.operations.PolicyActivity_PayerOrganizationOperations;

import org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Activity Payer Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PolicyActivity_PayerOrganizationImpl extends OrganizationImpl implements PolicyActivity_PayerOrganization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivity_PayerOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.POLICY_ACTIVITY_PAYER_ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerOrganizationName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_PayerOrganizationOperations.validatePayerOrganizationName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity_PayerOrganization init() {
    	CDAUtil.init(this);
    	return this;
	}
} //PolicyActivity_PayerOrganizationImpl
