/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.metamodels.relational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getNativeType <em>Native Type</em>}</li>
 *   <li>{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getLength <em>Length</em>}</li>
 *   <li>{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getScale <em>Scale</em>}</li>
 *   <li>{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getNullable <em>Nullable</em>}</li>
 *   <li>{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getRadix <em>Radix</em>}</li>
 *   <li>{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teiid.designer.metamodels.relational.RelationalPackage#getProcedureParameter()
 * @model
 * @generated
 *
 * @since 8.0
 */
public interface ProcedureParameter extends RelationalEntity{
    /**
     * Returns the value of the '<em><b>Direction</b></em>' attribute.
     * The literals are from the enumeration {@link org.teiid.designer.metamodels.relational.DirectionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Direction</em>' attribute.
     * @see org.teiid.designer.metamodels.relational.DirectionKind
     * @see #setDirection(DirectionKind)
     * @see org.teiid.designer.metamodels.relational.RelationalPackage#getProcedureParameter_Direction()
     * @model
     * @generated
     */
    DirectionKind getDirection();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direction</em>' attribute.
     * @see org.teiid.designer.metamodels.relational.DirectionKind
     * @see #getDirection()
     * @generated
     */
    void setDirection(DirectionKind value);

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see org.teiid.designer.metamodels.relational.RelationalPackage#getProcedureParameter_DefaultValue()
     * @model
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(String value);

    /**
     * Returns the value of the '<em><b>Native Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Native Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Native Type</em>' attribute.
     * @see #setNativeType(String)
     * @see org.teiid.designer.metamodels.relational.RelationalPackage#getProcedureParameter_NativeType()
     * @model
     * @generated
     */
    String getNativeType();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getNativeType <em>Native Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Native Type</em>' attribute.
     * @see #getNativeType()
     * @generated
     */
    void setNativeType(String value);

    /**
     * Returns the value of the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Length</em>' attribute.
     * @see #setLength(int)
     * @see org.teiid.designer.metamodels.relational.RelationalPackage#getProcedureParameter_Length()
     * @model
     * @generated
     */
    int getLength();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length</em>' attribute.
     * @see #getLength()
     * @generated
     */
    void setLength(int value);

    /**
     * Returns the value of the '<em><b>Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Precision</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Precision</em>' attribute.
     * @see #setPrecision(int)
     * @see org.teiid.designer.metamodels.relational.RelationalPackage#getProcedureParameter_Precision()
     * @model
     * @generated
     */
    int getPrecision();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getPrecision <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Precision</em>' attribute.
     * @see #getPrecision()
     * @generated
     */
    void setPrecision(int value);

    /**
     * Returns the value of the '<em><b>Scale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scale</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scale</em>' attribute.
     * @see #setScale(int)
     * @see org.teiid.designer.metamodels.relational.RelationalPackage#getProcedureParameter_Scale()
     * @model
     * @generated
     */
    int getScale();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getScale <em>Scale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scale</em>' attribute.
     * @see #getScale()
     * @generated
     */
    void setScale(int value);

    /**
     * Returns the value of the '<em><b>Nullable</b></em>' attribute.
     * The default value is <code>"NO_NULLS"</code>.
     * The literals are from the enumeration {@link org.teiid.designer.metamodels.relational.NullableType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nullable</em>' attribute.
     * @see org.teiid.designer.metamodels.relational.NullableType
     * @see #setNullable(NullableType)
     * @see org.teiid.designer.metamodels.relational.RelationalPackage#getProcedureParameter_Nullable()
     * @model default="NO_NULLS"
     * @generated
     */
    NullableType getNullable();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getNullable <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nullable</em>' attribute.
     * @see org.teiid.designer.metamodels.relational.NullableType
     * @see #getNullable()
     * @generated
     */
    void setNullable(NullableType value);

    /**
     * Returns the value of the '<em><b>Radix</b></em>' attribute.
     * The default value is <code>"10"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Radix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Radix</em>' attribute.
     * @see #setRadix(int)
     * @see org.teiid.designer.metamodels.relational.RelationalPackage#getProcedureParameter_Radix()
     * @model default="10"
     * @generated
     */
    int getRadix();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getRadix <em>Radix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Radix</em>' attribute.
     * @see #getRadix()
     * @generated
     */
    void setRadix(int value);

    /**
     * Returns the value of the '<em><b>Procedure</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.teiid.designer.metamodels.relational.Procedure#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Procedure</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Procedure</em>' container reference.
     * @see #setProcedure(Procedure)
     * @see org.teiid.designer.metamodels.relational.RelationalPackage#getProcedureParameter_Procedure()
     * @see org.teiid.designer.metamodels.relational.Procedure#getParameters
     * @model opposite="parameters"
     * @generated
     */
    Procedure getProcedure();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getProcedure <em>Procedure</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Procedure</em>' container reference.
     * @see #getProcedure()
     * @generated
     */
    void setProcedure(Procedure value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(EObject)
     * @see org.teiid.designer.metamodels.relational.RelationalPackage#getProcedureParameter_Type()
     * @model unsettable="true" required="true"
     * @generated
     */
    EObject getType();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(EObject value);

    /**
     * Unsets the value of the '{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(EObject)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link org.teiid.designer.metamodels.relational.ProcedureParameter#getType <em>Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' reference is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(EObject)
     * @generated
     */
    boolean isSetType();

} // ProcedureParameter
