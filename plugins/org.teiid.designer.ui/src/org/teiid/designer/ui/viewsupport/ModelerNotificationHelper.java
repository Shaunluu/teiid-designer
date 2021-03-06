/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.ui.viewsupport;

import org.eclipse.emf.common.notify.Notification;
import org.teiid.designer.core.ModelerCore;
import org.teiid.designer.core.notification.util.INotificationHelper;


/**
 * ModelerNotificationHelper
 *
 * @since 8.0
 */
public class ModelerNotificationHelper implements INotificationHelper {

    /**
     * Construct an instance of ModelerNotificationHelper.
     * 
     */
    public ModelerNotificationHelper() {
        super();
    }

    /* (non-Javadoc)
     * @see org.teiid.designer.ui.common.eventsupport.INotificationHelper#getNotifier(org.eclipse.emf.common.notify.Notification)
     */
    @Override
	public Object getNotifier(Notification notification) {
        return ModelerCore.getModelEditor().getChangedObject(notification);
    }

}
