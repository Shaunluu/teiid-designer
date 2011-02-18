/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */

package com.metamatrix.metadata.runtime.model;

import org.teiid.logging.LogManager;
import org.teiid.core.TeiidRuntimeException;
import com.metamatrix.metadata.runtime.RuntimeMetadataPlugin;
import com.metamatrix.metadata.runtime.api.ModelID;
import com.metamatrix.metadata.runtime.util.LogRuntimeMetadataConstants;
import com.metamatrix.metadata.util.ErrorMessageKeys;

public class BasicModelID extends BasicMetadataID implements ModelID {
    /**
     */
    private static final long serialVersionUID = 1L;
    private String version;
    private String modelUuid;
    private String versionDate;

/**
 * Call constructor to instantiate a ModelID object for the fully qualified Model name, version and an internal unique identifier.
 */
    public BasicModelID(String fullName, String version, long internalUniqueID) {
        super(fullName, internalUniqueID);
        if(this.getNameComponents().size() > 1){
            LogManager.logDetail(LogRuntimeMetadataConstants.CTX_RUNTIME_METADATA,new Object[]{"Invalid ModelID \"",fullName,"\". Number of name components must be > 0."});
            throw new TeiidRuntimeException(ErrorMessageKeys.BMID_0001, RuntimeMetadataPlugin.Util.getString(ErrorMessageKeys.BMID_0001, fullName) );
        }
        this.version = version;
    }

/**
 * Call constructor to instantiate a ModelID object for the fully qualified Model name and version.
 */
    public BasicModelID(String fullName, String version){
        super(fullName);
        if(this.getNameComponents().size() > 1 ){
            LogManager.logDetail(LogRuntimeMetadataConstants.CTX_RUNTIME_METADATA,new Object[]{"Invalid ModelID \"",fullName,"\". Number of name components must be > 0."});
            throw new TeiidRuntimeException(ErrorMessageKeys.BMID_0001, RuntimeMetadataPlugin.Util.getString(ErrorMessageKeys.BMID_0001, fullName) );
        }
        this.version = version;
    }

    /**
     * Returns true if the specified object is semantically equal to this instance.
     * @param obj the object that this instance is to be compared to.
     * @return whether the object is equal to this object.
     */
    @Override
    public boolean equals(Object obj) {
        // Check if instances are identical ...
        if ( this == obj ) {
            return true;
        }

        // Check if object can be compared to this one
        // (this includes checking for null ) ...
        //if ( this.getClass().isInstance(obj) ) {
        if ( obj instanceof BasicModelID ) {

            // Do quick hash code check first
            if( this.hashCode() != obj.hashCode() ) {
                return false;
              }

            // If the types aren't the same, then fail
            BasicModelID that = (BasicModelID) obj;
            if ( this.getClass() != that.getClass() ) {
                return false;
            }
            
            //If either of the ID's do not have a UUID then only compare 
            //based on the name.  
            if( (this.getUuid() == null) || (that.getUuid() == null) ){
                return this.getFullName().equalsIgnoreCase(that.getFullName() );
            }
            
            if (! this.getUuid().equals(that.getUuid())) {
                return false;
            }
            
            if (!this.getFullName().equalsIgnoreCase(that.getFullName() ) ) {
                return false;
            }

            //If the uids are the same, return true
            long thisUID = this.getUID();
            long thatUID = that.getUID();
            return thisUID == thatUID;
        }

        // Otherwise not comparable ...
        return false;
    }

/**
 * Call constructor to instantiate a ModelID object for the fully qualified Model name.
 */
    public BasicModelID(String fullName){
        super(fullName);
        if(this.getNameComponents().size() > 1 ){
            throw new TeiidRuntimeException(ErrorMessageKeys.BMID_0001, RuntimeMetadataPlugin.Util.getString(ErrorMessageKeys.BMID_0001, fullName) );
        }
        this.version = null;
    }

    //public BasicModelID(long internalUniqueID) {
    //    super("", internalUniqueID);
    //}

/**
 * returns the version.
 * @return String
 */
    public String getVersion() {
	return this.version;
    }

    public void setVersion(String version){
        if (this.version == null) {
            this.version = version;
        }
        if(this.version.equals(FAKE_NAME)){
            this.version = version;
        }
    }

    public String getUuid(){
        return this.modelUuid;
    }

    public void setUuid(String uuid){
        this.modelUuid = uuid;
    }

    public String getVersionDate() {
	    return this.versionDate;
    }

    public void setVersionDate(String dateString) {
	      this.versionDate = dateString;
    }

}

