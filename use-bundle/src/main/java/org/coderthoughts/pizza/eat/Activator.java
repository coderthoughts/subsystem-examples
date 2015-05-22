package org.coderthoughts.pizza.eat;

import org.coderthoughts.pizza.api.Pizza;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {
    private ServiceTracker<Pizza, Pizza> st;

    @Override
    public void start(BundleContext context) throws Exception {
        st = new ServiceTracker<Pizza, Pizza>(context, Pizza.class, null) {
            @Override
            public Pizza addingService(ServiceReference<Pizza> reference) {
                Pizza pizza = super.addingService(reference);
                System.out.println("Hmmm pizza! " + pizza.getName());
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
