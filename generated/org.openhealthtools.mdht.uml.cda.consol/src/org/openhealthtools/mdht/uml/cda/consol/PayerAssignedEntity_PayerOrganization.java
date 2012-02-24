/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Organization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payer Assigned Entity Payer Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPayerAssignedEntity_PayerOrganization()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.warning='PayerOrganizationName'"
 * @generated
 */
public interface PayerAssignedEntity_PayerOrganization extends Organization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())'"
	 * @generated
	 */
	boolean validatePayerOrganizationName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayerAssignedEntity_PayerOrganization init();
} // PayerAssignedEntity_PayerOrganization