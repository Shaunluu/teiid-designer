/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */

package org.teiid.designer.metadata.runtime.impl;

import org.teiid.designer.metadata.runtime.PropertyValueRecord;

/**
 * PropertyValueRecordImpl
 *
 * @since 8.0
 */
public class PropertyValueRecordImpl implements PropertyValueRecord {

	private String property;
	private String value;
    
	// ==================================================================================
	//                        C O N S T R U C T O R S
	// ==================================================================================
    
	public PropertyValueRecordImpl(final String property, final String value) {
		this.property     = property;
		this.value = value;
	}

	//==================================================================================
	//                     I N T E R F A C E   M E T H O D S
	//==================================================================================

	/* (non-Javadoc)
	 * @see org.teiid.designer.metadata.runtime.PropertyValueRecord#getProperty()
	 */
	@Override
	public String getProperty() {
		return property;
	}

	/* (non-Javadoc)
	 * @see org.teiid.designer.metadata.runtime.PropertyValueRecord#getValue()
	 */
	@Override
	public String getValue() {
		return value;
	}

}
