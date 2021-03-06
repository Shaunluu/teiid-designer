/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.metamodels.core.extension.impl;

import java.util.Iterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.teiid.designer.metamodels.core.extension.ExtensionPackage;
import org.teiid.designer.metamodels.core.extension.XClass;
import org.teiid.designer.metamodels.core.extension.XPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>XPackage</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 *
 * @since 8.0
 */
public class XPackageImpl extends EPackageImpl implements XPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected XPackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExtensionPackage.Literals.XPACKAGE;
    }

    /**
     * <!-- begin-user-doc --> Finds the first {@link XClass} that has the supplied class as it's
     * {@link XClass#getExtendedClass() extended class}.
     * 
     * @return the XClass that has extends the supplied class, or null if there is no extension for the supplied class. <!--
     *         end-user-doc -->
     * @generated NOT
     */
    @Override
	public XClass findXClass( EClass extendedClass ) {
        if (extendedClass == null) {
            return null;
        }
        final Iterator iter = this.getEClassifiers().iterator();
        while (iter.hasNext()) {
            final EClassifier eClassifier = (EClassifier)iter.next();
            if (eClassifier instanceof XClass) {
                final XClass xclass = (XClass)eClassifier;
                final EClass xedClass = xclass.getExtendedClass();
                if (extendedClass.equals(xedClass)) {
                    return xclass;
                }
            }
        }
        return null;
    }

    /**
     * <!-- begin-user-doc --> Finds the first {@link XClass} that has the supplied class as it's
     * {@link XClass#getExtendedClass() extended class}.
     * 
     * @return the XClass that has extends the supplied class, or null if there is no extension for the supplied class. <!--
     *         end-user-doc -->
     * @generated
     */
    public XClass findXClassGen( EClass extendedClass ) { // NO_UCD
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

} // XPackageImpl
