package org.coderthoughts.pizza.api;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Pizza {
    String getName();
}
