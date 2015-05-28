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
package org.coderthoughts.pizza.eat;

import org.coderthoughts.pizza.api.Pizza;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.subsystem.Subsystem;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {
    private ServiceTracker<Pizza, Pizza> st;

    @Override
    public void start(BundleContext context) throws Exception {
        ServiceReference<Subsystem> ssref = context.getServiceReference(Subsystem.class);
        String p = null;
        if (ssref != null) {
            Subsystem ss = context.getService(ssref);
            if (ss != null) {
                p = "[Scope " + ss.getSubsystemId() + "] ";
            }
        }
        final String prefix = (p != null) ? p : "";

        System.out.println(prefix + "Looking for pizzas...");
        st = new ServiceTracker<Pizza, Pizza>(context, Pizza.class, null) {
            @Override
            public Pizza addingService(ServiceReference<Pizza> reference) {
                Pizza pizza = super.addingService(reference);
                System.out.println(prefix + "Hmmm pizza! " + pizza.getName());
                return pizza;
            }
        };
        st.open();
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        if (st != null)
            st.close();
    }
}
