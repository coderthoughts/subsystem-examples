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
