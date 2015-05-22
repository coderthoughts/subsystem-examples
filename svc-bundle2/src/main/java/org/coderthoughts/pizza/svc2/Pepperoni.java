package org.coderthoughts.pizza.svc2;

import org.coderthoughts.pizza.api.Pizza;
import org.osgi.framework.BundleReference;

public class Pepperoni implements Pizza {
    @Override
    public String getName() {
        ClassLoader cl = getClass().getClassLoader();
        BundleReference br = (BundleReference) cl;
        return "Pepperoni (" + br.getBundle().getSymbolicName() + ")";
    }
}
