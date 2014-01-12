/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DrugVehicle;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SubstanceAdministrationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityDoseQuantityorrateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantityorrate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityEffectiveTimeIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityEffectiveTimePIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time PIVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityEffectiveTimeOperator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time Operator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityDoseQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityDrugVehicleTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Drug Vehicle Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityInstructionsInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityPreconditionSubstanceAdmTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Substance Adm Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityRateQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Rate Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityMedicationSupplyOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Supply Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityMedicationDispense(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Dispense</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityDrugVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Drug Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityConsumableMedicationInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable Medication Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getMedicationSupplyOrder() <em>Get Medication Supply Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getReactionObservation() <em>Get Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getInstructions() <em>Get Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getIndications() <em>Get Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getMedicationDispenses() <em>Get Medication Dispenses</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getDrugVehicles() <em>Get Drug Vehicles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationActivityOperations extends SubstanceAdministrationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityDoseQuantityorrateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantityorrate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantityorrateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.doseQuantity->size() = 1 or self.rateQuantity->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityDoseQuantityorrateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantityorrate Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantityorrateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityDoseQuantityorrateQuantity(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationActivityDoseQuantityorrateQuantity"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityTextReference(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTextReference(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined() implies self.text->forAll(reference->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityTextReference(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTextReference(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityTextReference(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEXT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityTextReference"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->forAll(reference->size() = 1) implies self.text->forAll(reference->one(value->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityReferenceValue(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityReferenceValue"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityTextReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTextReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityTextReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTextReferenceValue(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityTextReferenceValue(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityTextReferenceValue"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTimeIVLTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeIVLTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::IVL_TS))->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTimeIVLTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeIVLTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityEffectiveTimeIVLTS(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS,
					ConsolPlugin.INSTANCE.getString("MedicationActivityEffectiveTimeIVLTS"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTimeLow(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeLow(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::IVL_TS))->forAll( eff | eff.oclAsType(datatypes::IVL_TS).low->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTimeLow(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeLow(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityEffectiveTimeLow(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_EFFECTIVE_TIME_LOW,
					ConsolPlugin.INSTANCE.getString("MedicationActivityEffectiveTimeLow"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTimeHigh(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeHigh(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::IVL_TS))->forAll( eff | eff.oclAsType(datatypes::IVL_TS).high->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTimeHigh(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeHigh(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityEffectiveTimeHigh(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_EFFECTIVE_TIME_HIGH,
					ConsolPlugin.INSTANCE.getString("MedicationActivityEffectiveTimeHigh"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTimePIVLTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time PIVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimePIVLTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::PIVL_TS) or ef.oclIsTypeOf(datatypes::EIVL_TS))->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTimePIVLTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time PIVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimePIVLTS(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityEffectiveTimePIVLTS(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS,
					ConsolPlugin.INSTANCE.getString("MedicationActivityEffectiveTimePIVLTS"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTimeOperator(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time Operator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeOperator(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_OPERATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::PIVL_TS) or ef.oclIsTypeOf(datatypes::EIVL_TS))->forAll(eff | eff.operator = vocab::SetOperator::A and eff.operator->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTimeOperator(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time Operator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTimeOperator(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_OPERATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityEffectiveTimeOperator(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_OPERATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_OPERATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_OPERATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_OPERATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_EFFECTIVE_TIME_OPERATOR,
					ConsolPlugin.INSTANCE.getString("MedicationActivityEffectiveTimeOperator"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityDoseQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.doseQuantity.oclIsUndefined() implies not self.doseQuantity.unit.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityDoseQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity Unit</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityDoseQuantityUnit(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_DOSE_QUANTITY_UNIT,
					ConsolPlugin.INSTANCE.getString("MedicationActivityDoseQuantityUnit"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityDrugVehicleTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Drug Vehicle Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDrugVehicleTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(par : cda::Participant2 | par.participantRole.oclIsKindOf(consol::DrugVehicle))->forAll(p : cda::Participant2 | p.typeCode=vocab::ParticipationType::CSM)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityDrugVehicleTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Drug Vehicle Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDrugVehicleTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityDrugVehicleTypeCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityDrugVehicleTypeCode"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityInstructionsInversionInd(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityInstructionsInversionInd(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::Instructions))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityInstructionsInversionInd(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityInstructionsInversionInd(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityInstructionsInversionInd(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND,
					ConsolPlugin.INSTANCE.getString("MedicationActivityInstructionsInversionInd"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityPreconditionSubstanceAdmTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Substance Adm Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPreconditionSubstanceAdmTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_SUBSTANCE_ADM_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->select(par : cda::Precondition | par.oclIsKindOf(consol::PreconditionForSubstanceAdministration))->forAll(p : cda::Precondition | p.typeCode=vocab::ActRelationshipType::PRCN)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityPreconditionSubstanceAdmTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Substance Adm Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPreconditionSubstanceAdmTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_SUBSTANCE_ADM_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityPreconditionSubstanceAdmTypeCode(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_SUBSTANCE_ADM_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_SUBSTANCE_ADM_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_SUBSTANCE_ADM_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_SUBSTANCE_ADM_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRECONDITION_SUBSTANCE_ADM_TYPE_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityPreconditionSubstanceAdmTypeCode"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityRateQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Rate Quantity Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRateQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.rateQuantity.oclIsUndefined() implies self.rateQuantity.oclAsType(datatypes::PQ).unit->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityRateQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Rate Quantity Unit</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRateQuantityUnit(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityRateQuantityUnit(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_RATE_QUANTITY_UNIT,
					ConsolPlugin.INSTANCE.getString("MedicationActivityRateQuantityUnit"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.16')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityTemplateId(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("MedicationActivityTemplateId"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityClassCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityClassCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::SBADM";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityClassCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityClassCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityClassCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityClassCode"), new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityMoodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMoodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentSubstanceMood) and "
			+ "let value : vocab::x_DocumentSubstanceMood = self.moodCode.oclAsType(vocab::x_DocumentSubstanceMood) in "
			+ "value = vocab::x_DocumentSubstanceMood::EVN or value = vocab::x_DocumentSubstanceMood::INT";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityMoodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMoodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityMoodCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityMoodCode"), new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityId(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ID,
					ConsolPlugin.INSTANCE.getString("MedicationActivityId"), new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityCode"), new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityStatusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityStatusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityStatusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityStatusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityStatusCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityStatusCode"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityRouteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRouteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityRouteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRouteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityRouteCodeP(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ROUTE_CODE_P,
					ConsolPlugin.INSTANCE.getString("MedicationActivityRouteCodeP"),
					new Object[] { medicationActivity }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityRouteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityRouteCodeP", passToken);
				}
				passToken.add(medicationActivity);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityRouteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRouteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'C38192' or value.code = 'C38193' or value.code = 'C38194' or value.code = 'C38675' or value.code = 'C38197' or value.code = 'C38633' or value.code = 'C38205' or value.code = 'C38206' or value.code = 'C38208' or value.code = 'C38209' or value.code = 'C38210' or value.code = 'C38211' or value.code = 'C38212' or value.code = 'C38200' or value.code = 'C38215' or value.code = 'C38219' or value.code = 'C38220' or value.code = 'C38221' or value.code = 'C38222' or value.code = 'C38223' or value.code = 'C38224' or value.code = 'C38225' or value.code = 'C38226' or value.code = 'C38227' or value.code = 'C38228' or value.code = 'C38229' or value.code = 'C38230' or value.code = 'C38231' or value.code = 'C38232' or value.code = 'C38233' or value.code = 'C38234' or value.code = 'C38217' or value.code = 'C38218' or value.code = 'C38235' or value.code = 'C38238' or value.code = 'C38239' or value.code = 'C38240' or value.code = 'C38241' or value.code = 'C38242' or value.code = 'C38243' or value.code = 'C38245' or value.code = 'C38246' or value.code = 'C38247' or value.code = 'C38249' or value.code = 'C38250' or value.code = 'C38251' or value.code = 'C38252' or value.code = 'C38253' or value.code = 'C38254' or value.code = 'C28161' or value.code = 'C38255' or value.code = 'C38256' or value.code = 'C38257' or value.code = 'C38258' or value.code = 'C38259' or value.code = 'C38260' or value.code = 'C38261' or value.code = 'C38262' or value.code = 'C38263' or value.code = 'C38264' or value.code = 'C38265' or value.code = 'C38266' or value.code = 'C38267' or value.code = 'C38207' or value.code = 'C38268' or value.code = 'C38269' or value.code = 'C38270' or value.code = 'C38272' or value.code = 'C38273' or value.code = 'C38276' or value.code = 'C38277' or value.code = 'C38278' or value.code = 'C38280' or value.code = 'C38203' or value.code = 'C38281' or value.code = 'C38282' or value.code = 'C38284' or value.code = 'C38285' or value.code = 'C48623' or value.code = 'C38286' or value.code = 'C38287' or value.code = 'C38288' or value.code = 'C38289' or value.code = 'C38291' or value.code = 'C38676' or value.code = 'C38292' or value.code = 'C38677' or value.code = 'C38293' or value.code = 'C38294' or value.code = 'C38295' or value.code = 'C38216' or value.code = 'C38296' or value.code = 'C38198' or value.code = 'C38297' or value.code = 'C38298' or value.code = 'C38299' or value.code = 'C38300' or value.code = 'C38301' or value.code = 'C38304' or value.code = 'C38305' or value.code = 'C38283' or value.code = 'C38307' or value.code = 'C38308' or value.code = 'C38309' or value.code = 'C38312' or value.code = 'C38271'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityRouteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRouteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityRouteCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityRouteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicationActivity)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ROUTE_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityRouteCode"), new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityApproachSiteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Approach Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityApproachSiteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityApproachSiteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Approach Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityApproachSiteCodeP(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityApproachSiteCodeP(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_APPROACH_SITE_CODE_P,
					ConsolPlugin.INSTANCE.getString("MedicationActivityApproachSiteCodeP"),
					new Object[] { medicationActivity }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityApproachSiteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.MedicationActivityApproachSiteCodeP", passToken);
				}
				passToken.add(medicationActivity);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityApproachSiteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Approach Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityApproachSiteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityApproachSiteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Approach Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityApproachSiteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityApproachSiteCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityApproachSiteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicationActivity)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_APPROACH_SITE_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityApproachSiteCode"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityDoseQuantity(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_DOSE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationActivityDoseQuantity"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityRateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Rate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.rateQuantity.oclIsUndefined() or self.rateQuantity.isNullFlavorUndefined()) implies (not self.rateQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityRateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Rate Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityRateQuantity(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_RATE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationActivityRateQuantity"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityMaxDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Max Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMaxDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityMaxDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Max Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMaxDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityMaxDoseQuantity(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY,
					ConsolPlugin.INSTANCE.getString("MedicationActivityMaxDoseQuantity"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityAdministrationUnitCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityAdministrationUnitCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in "
			+ "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityAdministrationUnitCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityAdministrationUnitCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityAdministrationUnitCode(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityAdministrationUnitCode"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityText(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityText(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityText(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityText(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityText(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEXT,
					ConsolPlugin.INSTANCE.getString("MedicationActivityText"), new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityRepeatNumber(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRepeatNumber(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityRepeatNumber(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRepeatNumber(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityRepeatNumber(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_REPEAT_NUMBER,
					ConsolPlugin.INSTANCE.getString("MedicationActivityRepeatNumber"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityMedicationSupplyOrder(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Supply Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMedicationSupplyOrder(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::MedicationSupplyOrder) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityMedicationSupplyOrder(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Supply Order</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMedicationSupplyOrder(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityMedicationSupplyOrder(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER,
					ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationSupplyOrder"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityReactionObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityReactionObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityReactionObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reaction Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityReactionObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityReactionObservation(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_REACTION_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("MedicationActivityReactionObservation"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityPerformer(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPerformer(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityPerformer(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPerformer(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityPerformer(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PERFORMER,
					ConsolPlugin.INSTANCE.getString("MedicationActivityPerformer"), new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityInstructions(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INSTRUCTIONS,
					ConsolPlugin.INSTANCE.getString("MedicationActivityInstructions"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Indication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityIndication(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INDICATION,
					ConsolPlugin.INSTANCE.getString("MedicationActivityIndication"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityMedicationDispense(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Dispense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMedicationDispense(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::MedicationDispense) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityMedicationDispense(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Dispense</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMedicationDispense(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityMedicationDispense(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_DISPENSE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityMedicationDispense"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityPrecondition(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPrecondition(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.oclIsUndefined() and precondition.oclIsKindOf(consol::PreconditionForSubstanceAdministration))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityPrecondition(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPrecondition(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityPrecondition(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRECONDITION,
					ConsolPlugin.INSTANCE.getString("MedicationActivityPrecondition"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityDrugVehicle(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Drug Vehicle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDrugVehicle(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::DrugVehicle))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityDrugVehicle(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Drug Vehicle</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityDrugVehicle(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityDrugVehicle(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_DRUG_VEHICLE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityDrugVehicle"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityConsumable(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityConsumable(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityConsumable(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityConsumable(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityConsumable(MedicationActivity medicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_CONSUMABLE,
					ConsolPlugin.INSTANCE.getString("MedicationActivityConsumable"),
					new Object[] { medicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityConsumableMedicationInformation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable Medication Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityConsumableMedicationInformation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->excluding(null)->reject(manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(consol::MedicationInformation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityConsumableMedicationInformation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable Medication Information</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityConsumableMedicationInformation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationActivityConsumableMedicationInformation(
			MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION,
						ConsolPlugin.INSTANCE.getString("MedicationActivityConsumableMedicationInformation"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationSupplyOrder(MedicationActivity) <em>Get Medication Supply Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSupplyOrder(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_SUPPLY_ORDER__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationSupplyOrder))->asSequence()->any(true).oclAsType(consol::MedicationSupplyOrder)";

	/**
	 * The cached OCL query for the '{@link #getMedicationSupplyOrder(MedicationActivity) <em>Get Medication Supply Order</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSupplyOrder(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationSupplyOrder getMedicationSupplyOrder(MedicationActivity medicationActivity) {
		if (GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_ACTIVITY,
				ConsolPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(92));
			try {
				GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY = helper.createQuery(GET_MEDICATION_SUPPLY_ORDER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_SUPPLY_ORDER__EOCL_QRY);
		return (MedicationSupplyOrder) query.evaluate(medicationActivity);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReactionObservation(MedicationActivity) <em>Get Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REACTION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation))->asSequence()->any(true).oclAsType(consol::ReactionObservation)";

	/**
	 * The cached OCL query for the '{@link #getReactionObservation(MedicationActivity) <em>Get Reaction Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REACTION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReactionObservation getReactionObservation(MedicationActivity medicationActivity) {
		if (GET_REACTION_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_ACTIVITY,
				ConsolPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(93));
			try {
				GET_REACTION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_REACTION_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REACTION_OBSERVATION__EOCL_QRY);
		return (ReactionObservation) query.evaluate(medicationActivity);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstructions(MedicationActivity) <em>Get Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions))->asSequence()->any(true).oclAsType(consol::Instructions)";

	/**
	 * The cached OCL query for the '{@link #getInstructions(MedicationActivity) <em>Get Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static Instructions getInstructions(MedicationActivity medicationActivity) {
		if (GET_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_ACTIVITY,
				ConsolPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(94));
			try {
				GET_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INSTRUCTIONS__EOCL_QRY);
		return (Instructions) query.evaluate(medicationActivity);
	}

	/**
	 * The cached OCL expression body for the '{@link #getIndications(MedicationActivity) <em>Get Indications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndications(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INDICATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)).oclAsType(consol::Indication)";

	/**
	 * The cached OCL query for the '{@link #getIndications(MedicationActivity) <em>Get Indications</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndications(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INDICATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Indication> getIndications(MedicationActivity medicationActivity) {
		if (GET_INDICATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_ACTIVITY,
				ConsolPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(95));
			try {
				GET_INDICATIONS__EOCL_QRY = helper.createQuery(GET_INDICATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INDICATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication> result = (Collection<Indication>) query.evaluate(medicationActivity);
		return new BasicEList.UnmodifiableEList<Indication>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationDispenses(MedicationActivity) <em>Get Medication Dispenses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationDispenses(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_DISPENSES__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationDispense)).oclAsType(consol::MedicationDispense)";

	/**
	 * The cached OCL query for the '{@link #getMedicationDispenses(MedicationActivity) <em>Get Medication Dispenses</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationDispenses(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_DISPENSES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MedicationDispense> getMedicationDispenses(MedicationActivity medicationActivity) {
		if (GET_MEDICATION_DISPENSES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_ACTIVITY,
				ConsolPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(96));
			try {
				GET_MEDICATION_DISPENSES__EOCL_QRY = helper.createQuery(GET_MEDICATION_DISPENSES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_DISPENSES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationDispense> result = (Collection<MedicationDispense>) query.evaluate(medicationActivity);
		return new BasicEList.UnmodifiableEList<MedicationDispense>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDrugVehicles(MedicationActivity) <em>Get Drug Vehicles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugVehicles(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DRUG_VEHICLES__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::DrugVehicle)).oclAsType(consol::DrugVehicle)";

	/**
	 * The cached OCL query for the '{@link #getDrugVehicles(MedicationActivity) <em>Get Drug Vehicles</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugVehicles(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DRUG_VEHICLES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<DrugVehicle> getDrugVehicles(MedicationActivity medicationActivity) {
		if (GET_DRUG_VEHICLES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICATION_ACTIVITY,
				ConsolPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(97));
			try {
				GET_DRUG_VEHICLES__EOCL_QRY = helper.createQuery(GET_DRUG_VEHICLES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DRUG_VEHICLES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<DrugVehicle> result = (Collection<DrugVehicle>) query.evaluate(medicationActivity);
		return new BasicEList.UnmodifiableEList<DrugVehicle>(result.size(), result.toArray());
	}

} // MedicationActivityOperations