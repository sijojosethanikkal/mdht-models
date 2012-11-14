/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Result Organizer</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getResultOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Mu2consolResultOrganizerTemplateId Mu2consolResultOrganizerResultObservation' templateId.root='2.16.840.1.113883.10.20.22.4.1'"
 * @generated
 */
public interface ResultOrganizer extends
		org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.component->exists(component : cda::Component4 | not
	 * component.observation.oclIsUndefined() and
	 * component.observation.oclIsKindOf(mu2consol::ResultObservation))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(mu2consol::ResultObservation))'"
	 * @generated
	 */
	boolean validateMu2consolResultOrganizerResultObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not
	 * observation.oclIsUndefined() and
	 * observation.oclIsKindOf(mu2consol::ResultObservation
	 * )).oclAsType(mu2consol::ResultObservation) <!-- end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mu2consol::ResultObservation)).oclAsType(mu2consol::ResultObservation)'"
	 * @generated
	 */
	EList<ResultObservation> getMu2consolResultObservations();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResultOrganizer init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public ResultOrganizer init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // ResultOrganizer
