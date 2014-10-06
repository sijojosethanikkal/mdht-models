/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation;
import org.openhealthtools.mdht.uml.cda.consol.WoundObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Exam Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2WoundObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Wound Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#getWoundObservations() <em>Get Wound Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#getConsolPressureUlcerObservations() <em>Get Consol Pressure Ulcer Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#getConsolHighestPressureUlcerStages() <em>Get Consol Highest Pressure Ulcer Stages</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#getConsolNumberOfPressureUlcersObservations() <em>Get Consol Number Of Pressure Ulcers Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionHighestPressureUlcerStage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Highest Pressure Ulcer Stage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionNumberOfPressureUlcersObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Number Of Pressure Ulcers Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalExamSection2Operations extends PhysicalExamSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalExamSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSection2WoundObservation(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Wound Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2WoundObservation(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION2_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::WoundObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSection2WoundObservation(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Wound Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSection2WoundObservation(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION2_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicalExamSection2WoundObservation(PhysicalExamSection2 physicalExamSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION2_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION2_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION2_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION2_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION2_WOUND_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("PhysicalExamSection2WoundObservation"),
					new Object[] { physicalExamSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getWoundObservations(PhysicalExamSection2) <em>Get Wound Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWoundObservations(PhysicalExamSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_WOUND_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::WoundObservation)).oclAsType(consol::WoundObservation)";

	/**
	 * The cached OCL query for the '{@link #getWoundObservations(PhysicalExamSection2) <em>Get Wound Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWoundObservations(PhysicalExamSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_WOUND_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<WoundObservation> getWoundObservations(PhysicalExamSection2 physicalExamSection2) {
		if (GET_WOUND_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2,
				ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2.getEAllOperations().get(67));
			try {
				GET_WOUND_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_WOUND_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_WOUND_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<WoundObservation> result = (Collection<WoundObservation>) query.evaluate(physicalExamSection2);
		return new BasicEList.UnmodifiableEList<WoundObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPressureUlcerObservations(PhysicalExamSection2) <em>Get Consol Pressure Ulcer Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPressureUlcerObservations(PhysicalExamSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PRESSURE_ULCER_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PressureUlcerObservation)).oclAsType(consol::PressureUlcerObservation)";

	/**
	 * The cached OCL query for the '{@link #getConsolPressureUlcerObservations(PhysicalExamSection2) <em>Get Consol Pressure Ulcer Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPressureUlcerObservations(PhysicalExamSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PRESSURE_ULCER_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PressureUlcerObservation> getConsolPressureUlcerObservations(
			PhysicalExamSection2 physicalExamSection2) {
		if (GET_CONSOL_PRESSURE_ULCER_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2,
				ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2.getEAllOperations().get(68));
			try {
				GET_CONSOL_PRESSURE_ULCER_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_CONSOL_PRESSURE_ULCER_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_PRESSURE_ULCER_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PressureUlcerObservation> result = (Collection<PressureUlcerObservation>) query.evaluate(physicalExamSection2);
		return new BasicEList.UnmodifiableEList<PressureUlcerObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolHighestPressureUlcerStages(PhysicalExamSection2) <em>Get Consol Highest Pressure Ulcer Stages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolHighestPressureUlcerStages(PhysicalExamSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HighestPressureUlcerStage)).oclAsType(consol::HighestPressureUlcerStage)";

	/**
	 * The cached OCL query for the '{@link #getConsolHighestPressureUlcerStages(PhysicalExamSection2) <em>Get Consol Highest Pressure Ulcer Stages</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolHighestPressureUlcerStages(PhysicalExamSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<HighestPressureUlcerStage> getConsolHighestPressureUlcerStages(
			PhysicalExamSection2 physicalExamSection2) {
		if (GET_CONSOL_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2,
				ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2.getEAllOperations().get(69));
			try {
				GET_CONSOL_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_QRY = helper.createQuery(GET_CONSOL_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HighestPressureUlcerStage> result = (Collection<HighestPressureUlcerStage>) query.evaluate(physicalExamSection2);
		return new BasicEList.UnmodifiableEList<HighestPressureUlcerStage>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolNumberOfPressureUlcersObservations(PhysicalExamSection2) <em>Get Consol Number Of Pressure Ulcers Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolNumberOfPressureUlcersObservations(PhysicalExamSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation)).oclAsType(consol::NumberOfPressureUlcersObservation)";

	/**
	 * The cached OCL query for the '{@link #getConsolNumberOfPressureUlcersObservations(PhysicalExamSection2) <em>Get Consol Number Of Pressure Ulcers Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolNumberOfPressureUlcersObservations(PhysicalExamSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NumberOfPressureUlcersObservation> getConsolNumberOfPressureUlcersObservations(
			PhysicalExamSection2 physicalExamSection2) {
		if (GET_CONSOL_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2,
				ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2.getEAllOperations().get(70));
			try {
				GET_CONSOL_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_CONSOL_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NumberOfPressureUlcersObservation> result = (Collection<NumberOfPressureUlcersObservation>) query.evaluate(physicalExamSection2);
		return new BasicEList.UnmodifiableEList<NumberOfPressureUlcersObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionTemplateId(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionTemplateId(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2.10' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionTemplateId(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionTemplateId(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicalExamSectionTemplateId(PhysicalExamSection2 physicalExamSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PhysicalExamSectionTemplateId"),
					new Object[] { physicalExamSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionCodeP(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionCodeP(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionCodeP(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionCodeP(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicalExamSectionCodeP(PhysicalExamSection2 physicalExamSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION_CODE_P,
					ConsolPlugin.INSTANCE.getString("PhysicalExamSectionCodeP"), new Object[] { physicalExamSection2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSectionCodeP", passToken);
				}
				passToken.add(physicalExamSection2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionCode(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionCode(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '29545-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionCode(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionCode(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicalExamSectionCode(PhysicalExamSection2 physicalExamSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(physicalExamSection2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("PhysicalExamSectionCode"), new Object[] { physicalExamSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionHighestPressureUlcerStage(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Highest Pressure Ulcer Stage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionHighestPressureUlcerStage(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::HighestPressureUlcerStage))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionHighestPressureUlcerStage(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Highest Pressure Ulcer Stage</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionHighestPressureUlcerStage(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicalExamSectionHighestPressureUlcerStage(
			PhysicalExamSection2 physicalExamSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICAL_EXAM_SECTION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION_HIGHEST_PRESSURE_ULCER_STAGE,
					ConsolPlugin.INSTANCE.getString("PhysicalExamSectionHighestPressureUlcerStage"),
					new Object[] { physicalExamSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionNumberOfPressureUlcersObservation(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Number Of Pressure Ulcers Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionNumberOfPressureUlcersObservation(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionNumberOfPressureUlcersObservation(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Number Of Pressure Ulcers Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionNumberOfPressureUlcersObservation(PhysicalExamSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection2 The receiving '<em><b>Physical Exam Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicalExamSectionNumberOfPressureUlcersObservation(
			PhysicalExamSection2 physicalExamSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICAL_EXAM_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PHYSICAL_EXAM_SECTION2__PHYSICAL_EXAM_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("PhysicalExamSectionNumberOfPressureUlcersObservation"),
					new Object[] { physicalExamSection2 }));
			}

			return false;
		}
		return true;
	}

} // PhysicalExamSection2Operations
