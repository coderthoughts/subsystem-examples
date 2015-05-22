package org.coderthoughts.pizza.feature2;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Feature 2 started");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
    }
}
