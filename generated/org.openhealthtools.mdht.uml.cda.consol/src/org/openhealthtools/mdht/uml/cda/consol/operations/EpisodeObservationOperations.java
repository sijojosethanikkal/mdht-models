/*******************************************************************************
 * Copyright (c) 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Episode Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation#validateEpisodeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation#validateEpisodeObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation#validateEpisodeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation#validateEpisodeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation#validateEpisodeObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EpisodeObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpisodeObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEpisodeObservationTemplateId(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationTemplateId(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.41')";

	/**
	 * The cached OCL invariant for the '{@link #validateEpisodeObservationTemplateId(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationTemplateId(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.41')
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEpisodeObservationTemplateId(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EPISODE_OBSERVATION);
			try {
				VALIDATE_EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("EpisodeObservationTemplateId"),
					new Object[] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEpisodeObservationClassCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationClassCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateEpisodeObservationClassCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationClassCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEpisodeObservationClassCode(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EPISODE_OBSERVATION);
			try {
				VALIDATE_EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("EpisodeObservationClassCode"), new Object[] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEpisodeObservationMoodCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationMoodCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateEpisodeObservationMoodCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationMoodCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEpisodeObservationMoodCode(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EPISODE_OBSERVATION);
			try {
				VALIDATE_EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("EpisodeObservationMoodCode"), new Object[] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEpisodeObservationCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("
			+ "value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4'))";

	/**
	 * The cached OCL invariant for the '{@link #validateEpisodeObservationCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4'))
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEpisodeObservationCode(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EPISODE_OBSERVATION);
			try {
				VALIDATE_EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("EpisodeObservationCode"), new Object[] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEpisodeObservationStatusCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationStatusCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("
			+ "value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateEpisodeObservationStatusCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Episode Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEpisodeObservationStatusCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEpisodeObservationStatusCode(EpisodeObservation episodeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EPISODE_OBSERVATION);
			try {
				VALIDATE_EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("EpisodeObservationStatusCode"),
					new Object[] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

} // EpisodeObservationOperations
