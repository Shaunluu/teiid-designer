/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.ui.explorer;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.teiid.designer.core.workspace.ModelResource;
import org.teiid.designer.core.workspace.ModelWorkspaceException;
import org.teiid.designer.ui.UiConstants;
import org.teiid.designer.ui.common.eventsupport.SelectionUtilities;
import org.teiid.designer.ui.viewsupport.ModelUtilities;


/**
 * Helper class designed to handle transform concrete selections into other selection types Use case is the Import/Export wizards
 * may be enabled with "mixed" selections (i.e. EObjects & IResources). We need to interpret this and provide a single container
 * resource for the wizard initialization
 * 
 * @author BLaFond
 *
 * @since 8.0
 */
public class ModelExplorerSelectionHelper {

    private TreeViewer viewer;

    public ModelExplorerSelectionHelper(TreeViewer viewer) {
        super();
        this.viewer = viewer;
    }

    public IStructuredSelection getBestSelection() {
        return getBestSelection(viewer.getSelection());
    }

    public IStructuredSelection getBestSelection(ISelection theSelection) {
        IResource resrc = null;
        if (SelectionUtilities.isAllEObjects(theSelection)) {
            EObject eObj = (EObject)SelectionUtilities.getSelectedEObjects(theSelection).get(0);
            ModelResource mr = ModelUtilities.getModelResourceForModelObject(eObj);
            if (mr != null) {
                try {
                    resrc = mr.getUnderlyingResource();
                } catch (ModelWorkspaceException e) {
                    UiConstants.Util.log(e);
                }
            }
            // Grab first one and get it's model resource's folder
        } else if (!SelectionUtilities.isEmptySelection(theSelection)) {
            Object obj = SelectionUtilities.getSelectedObjects(theSelection).get(0);
            if (obj instanceof EObject) {
                // get it's model resource's folder
                ModelResource mr = ModelUtilities.getModelResourceForModelObject((EObject)obj);
                if (mr != null) {
                    try {
                        resrc = mr.getUnderlyingResource();
                    } catch (ModelWorkspaceException e) {
                        UiConstants.Util.log(e);
                    }
                }
            } else if (obj instanceof IResource) {
                resrc = (IResource)obj;
            }
        }
        if (resrc == null) {
            return new StructuredSelection();
        }
        return new StructuredSelection(resrc);
    }

}
