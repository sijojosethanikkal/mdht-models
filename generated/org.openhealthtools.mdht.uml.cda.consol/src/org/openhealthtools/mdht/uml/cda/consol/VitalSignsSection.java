/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vital Signs Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     This section contains current and historically relevant vital signs, such as blood pressure, heart rate,
 *     respiratory rate, height, weight, body mass index, head circumference, crown-to-rump length, and pulse oximetry. The
 *     section may contain all vital signs for the period of time being summarized, but at a minimum should include notable
 *     vital signs such as the most recent, maximum and/or minimum, or both, baseline, or relevant trends.
 * </p>
 * <p>
 *     Vital signs are represented like other results (as defined in <b><i>Results
 *     Section</i></b>) with additional vocabulary constraints, but are aggregated into their own section in order to follow clinical
 *     conventions.
 * </p>
 * <p>
 *     The vital signs section shall contain a narrative description of the measurement results of a patient's vital signs.
 * </p>
 * The vital signs section contains coded measurement results of a patient's vital signs.
 * <p>
 *     The Vital Signs Section contains information documenting the patient vital signs. 
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getVitalSignsSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Vital signs' templateId.root='2.16.840.1.113883.10.20.22.2.4' constraints.validation.error='VitalSignsSectionTemplateId VitalSignsSectionVitalSignEntry VitalSignsSectionEntriesOptionalCode VitalSignsSectionTitle VitalSignsSectionText VitalSignsSectionVitalSignsOrganizer' code.codeSystemName='LOINC' code.code='8716-3'"
 * @generated
 */
public interface VitalSignsSection extends VitalSignsSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(consol::VitalSignsOrganizer) and entry.organizer.component.observation->exists(obs : cda::Observation | obs.oclIsKindOf(consol::VitalSign)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(consol::VitalSignsOrganizer) and entry.organizer.component.observation->exists(obs : cda::Observation | obs.oclIsKindOf(consol::VitalSign)))'"
	 * @generated
	 */
	boolean validateVitalSignsSectionVitalSignEntry(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '8716-3' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (\nvalue.code = \'8716-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\'))'"
	 * @generated
	 */
	boolean validateVitalSignsSectionEntriesOptionalCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateVitalSignsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateVitalSignsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::VitalSignsOrganizer))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::VitalSignsOrganizer))'"
	 * @generated
	 */
	boolean validateVitalSignsSectionVitalSignsOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::VitalSignsOrganizer)).oclAsType(consol::VitalSignsOrganizer)
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::VitalSignsOrganizer)).oclAsType(consol::VitalSignsOrganizer)'"
	 * @generated
	 */
	EList<VitalSignsOrganizer> getnullVitalSignsOrganizers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection init();
} // VitalSignsSection
