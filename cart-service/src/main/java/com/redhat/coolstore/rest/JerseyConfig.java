package com.redhat.coolstore.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import org.jboss.resteasy.plugins.interceptors.CorsFilter;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
		register(CartEndpoint.class);
	        register(CorsFilter.class);
	}
}
