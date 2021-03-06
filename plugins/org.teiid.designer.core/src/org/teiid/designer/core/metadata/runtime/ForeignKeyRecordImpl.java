/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.core.metadata.runtime;

import org.eclipse.emf.ecore.EObject;
import org.teiid.designer.core.index.IndexConstants;
import org.teiid.designer.core.metamodel.aspect.sql.SqlForeignKeyAspect;
import org.teiid.designer.metadata.runtime.ForeignKeyRecord;


/**
 * ForeignKeyRecordImpl
 *
 * @since 8.0
 */
public class ForeignKeyRecordImpl extends ColumnSetRecordImpl implements ForeignKeyRecord {

    private static final long serialVersionUID = 8403148788957708630L;

	/**
	 * Flags to determine if values have been set.
	 */
	private boolean uniqueKeyIDSet;
    private Object uniqueKeyID;

    // ==================================================================================
    //                        C O N S T R U C T O R S
    // ==================================================================================

    public ForeignKeyRecordImpl(final SqlForeignKeyAspect sqlAspect, final EObject eObject) {
        super(sqlAspect, eObject, IndexConstants.RECORD_TYPE.FOREIGN_KEY);
	}

	private SqlForeignKeyAspect getForeignKeyAspect() {
		return (SqlForeignKeyAspect) ((ModelerMetadataRecordDelegate)this.delegate).getSqlAspect();			
	}

    //==================================================================================
    //                     I N T E R F A C E   M E T H O D S
    //==================================================================================

    /* (non-Javadoc)
     * @see org.teiid.designer.metadata.runtime.ForeignKeyRecord#getPrimaryKeyID()
     */
    @Override
    public Object getUniqueKeyID() {
    	if(eObject != null && !uniqueKeyIDSet) {
			EObject primaryKey = (EObject) getForeignKeyAspect().getUniqueKey((EObject)eObject);
			setUniqueKeyID(((ModelerMetadataRecordDelegate)this.delegate).getObjectID(primaryKey));    		
    	}
        return this.uniqueKeyID;
    }

    // ==================================================================================
    //                      P U B L I C   M E T H O D S
    // ==================================================================================

    /**
     * @param object
     */
    public void setUniqueKeyID(Object keyID) {
        this.uniqueKeyID = keyID;
		uniqueKeyIDSet = true;
    }    
}
