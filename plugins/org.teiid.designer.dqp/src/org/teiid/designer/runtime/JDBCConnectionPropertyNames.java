/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.runtime;


/** 
 * This has names for properties stored on connectorbindings stored on vdb definition file
 * and also the jdbc import properties stored on physical models. 
 * @since 8.0
 */
public class JDBCConnectionPropertyNames {

    /**
     * This is the name of the property that stores driver class name on a connector binding.
     */
    public static final String CONNECTOR_JDBC_DRIVER_CLASS = "ConnectionSource"; //"Driver"; //$NON-NLS-1$

    /**
     * This is the name of the property that stores the connection url name on a connector binding.
     */    
    public static final String CONNECTOR_JDBC_URL = "URL"; //$NON-NLS-1$

    /**
     * This is the name of the property that stores user name on a connector binding.
     */
    public static final String CONNECTOR_JDBC_USER = "User"; //$NON-NLS-1$
    
    /**
     * The property identifier that stores the JDBC URL password.
     * @since 5.5 
     */
    public static final String CONNECTOR_JDBC_PASSWORD = "Password"; //$NON-NLS-1$

    /**
     * This is the name of the property that stores driver class name on the jdbc import settings of a physical models. 
     */
    public static final String JDBC_IMPORT_DRIVER_CLASS = "com.metamatrix.modeler.jdbc.JdbcSource.driverClass"; //$NON-NLS-1$

    /**
     * This is the name of the property that stores driver class name on the jdbc import settings of a physical models.
     */    
    public static final String JDBC_IMPORT_URL = "com.metamatrix.modeler.jdbc.JdbcSource.url"; //$NON-NLS-1$

    /**
     * This is the name of the property that stores user name on the jdbc import settings of a physical models.
     */    
    public static final String JDBC_IMPORT_USERNAME = "com.metamatrix.modeler.jdbc.JdbcSource.username"; //$NON-NLS-1$
    
    /**
     * Name of the import driver
     */
    public static final String JDBC_IMPORT_DRIVER_NAME = "com.metamatrix.modeler.jdbc.JdbcSource.driverName"; //$NON-NLS-1$
    
    /**
     * This is the name of the default JDBC connector
     */
    public static final String DEFAULT_JDBC_CONNECTOR_NAME = "JDBC Connector"; //$NON-NLS-1$

}
