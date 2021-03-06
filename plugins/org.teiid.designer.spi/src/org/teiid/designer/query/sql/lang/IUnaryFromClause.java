/*
 * JBoss, Home of Professional Open Source.
*
* See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
*
* See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
*/
package org.teiid.designer.query.sql.lang;

import org.teiid.designer.query.sql.ILanguageVisitor;
import org.teiid.designer.query.sql.symbol.IGroupSymbol;


/**
 *
 */
public interface IUnaryFromClause<GS extends IGroupSymbol, LV extends ILanguageVisitor> extends IFromClause<LV> {

    /**
     * Set the group held by the clause
     * 
     * @param group Group to hold
     */
    void setGroup(GS group);
    
    /**
     * Get group held by clause
     * 
     * @return Group held by clause
     */
    GS getGroup();
}
