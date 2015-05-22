package org.coderthoughts.pizza.svc2;

import java.util.Dictionary;
import java.util.Hashtable;

import org.coderthoughts.pizza.api.Pizza;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        Dictionary<String, Object> props = new Hashtable<>();
        props.put("toppings", 1);
        context.registerService(Pizza.class, new Pepperoni(), props);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
    }
}
