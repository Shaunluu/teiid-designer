/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.metamodels.webservice;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.teiid.designer.metamodels.webservice.WebServicePackage
 * @generated
 *
 * @since 8.0
 */
public interface WebServiceFactory extends EFactory {

    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    WebServiceFactory eINSTANCE = new org.teiid.designer.metamodels.webservice.impl.WebServiceFactoryImpl();

    /**
     * Returns a new object of class '<em>Operation</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Operation</em>'.
     * @generated
     */
    Operation createOperation();

    /**
     * Returns a new object of class '<em>Input</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Input</em>'.
     * @generated
     */
    Input createInput();

    /**
     * Returns a new object of class '<em>Output</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Output</em>'.
     * @generated
     */
    Output createOutput();

    /**
     * Returns a new object of class '<em>Interface</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Interface</em>'.
     * @generated
     */
    Interface createInterface();

    /**
     * Returns a new object of class '<em>Sample Messages</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Sample Messages</em>'.
     * @generated
     */
    SampleMessages createSampleMessages();

    /**
     * Returns a new object of class '<em>Sample File</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Sample File</em>'.
     * @generated
     */
    SampleFile createSampleFile();

    /**
     * Returns a new object of class '<em>Sample From Xsd</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Sample From Xsd</em>'.
     * @generated
     */
    SampleFromXsd createSampleFromXsd();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the package supported by this factory.
     * @generated
     */
    WebServicePackage getWebServicePackage(); // NO_UCD

} // WebServiceFactory
