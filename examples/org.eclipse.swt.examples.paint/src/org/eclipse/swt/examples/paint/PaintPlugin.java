/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.examples.paint;


import org.eclipse.core.runtime.*;
import org.eclipse.ui.plugin.*;
import org.osgi.framework.BundleContext;

import java.util.*;

/**
 * The main plugin class to be used in the desktop.
 */
public class PaintPlugin extends AbstractUIPlugin {
	private static PaintPlugin plugin;
	private static ResourceBundle resourceBundle;

	/**
	 * Constructs the Paint plugin.
	 */
	public PaintPlugin() {
		super();
		plugin = this;
	}
	
	/**
	 * Log an error to the ILog for this plugin
	 * 
	 * @param message the localized error message text
	 * @param exception the associated exception, or null
	 */
	public static void logError(String message, Throwable exception) {
		plugin.getLog().log(
			new Status(IStatus.ERROR, plugin.getBundle().getSymbolicName(), 0, message, exception));
	}

    public void start(BundleContext context) throws Exception {
        super.start(context);
        resourceBundle = Platform.getResourceBundle(getBundle());
    }
}