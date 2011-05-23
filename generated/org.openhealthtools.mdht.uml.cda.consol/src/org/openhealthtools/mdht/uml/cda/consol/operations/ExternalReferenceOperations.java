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
import org.openhealthtools.mdht.uml.cda.consol.ExternalReference;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>External Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference#validateExternalReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference#validateExternalReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference#validateExternalReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalReferenceOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalReferenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalReferenceTemplateId(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceTemplateId(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalReferenceTemplateId(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceTemplateId(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EXTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.4')
	 * @param externalReference The receiving '<em><b>External Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExternalReferenceTemplateId(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EXTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_REFERENCE);
			try {
				VALIDATE_EXTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ExternalReferenceTemplateId"), new Object[] { externalReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalReferenceClassCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceClassCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalReferenceClassCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceClassCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EXTERNAL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param externalReference The receiving '<em><b>External Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExternalReferenceClassCode(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EXTERNAL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_REFERENCE);
			try {
				VALIDATE_EXTERNAL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ExternalReferenceClassCode"), new Object[] { externalReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalReferenceMoodCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceMoodCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalReferenceMoodCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceMoodCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EXTERNAL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param externalReference The receiving '<em><b>External Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExternalReferenceMoodCode(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EXTERNAL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_REFERENCE);
			try {
				VALIDATE_EXTERNAL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("ExternalReferenceMoodCode"), new Object[] { externalReference }));
			}
			return false;
		}
		return true;
	}

} // ExternalReferenceOperations
