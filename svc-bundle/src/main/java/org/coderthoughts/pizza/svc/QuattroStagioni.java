/*************************************************************************
 *
 * ADOBE CONFIDENTIAL
 * __________________
 *
 *  Copyright 2014 Adobe Systems Incorporated
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Adobe Systems Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated and its
 * suppliers and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Adobe Systems Incorporated.
 **************************************************************************/
package org.coderthoughts.pizza.svc;

import org.coderthoughts.pizza.api.Pizza;
import org.osgi.framework.BundleReference;

public class QuattroStagioni implements Pizza {
    @Override
    public String getName() {
        ClassLoader cl = getClass().getClassLoader();
        BundleReference br = (BundleReference) cl;
        return "Quattro Stagioni (" + br.getBundle().getSymbolicName() + ")";
    }
}
