package org.coderthoughts.pizza.svc2;

import org.coderthoughts.pizza.api.Pizza;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        context.registerService(Pizza.class, new Pepperoni(), null);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
    }
}
