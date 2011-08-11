package com.stripe.util;

import java.util.Set;

import javax.ws.rs.core.MediaType;

import com.google.common.collect.Sets;
import com.stripe.model.Charge;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.json.JSONConfiguration;

public class StripeClient {

	protected final String BASEURL = "https://api.stripe.com/v1";

	protected Client client;

	protected WebResource resource;

	public StripeClient(String apiKey) {
		ClientConfig cc = new DefaultClientConfig();
		cc.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		client = Client.create(cc);

		client.addFilter(new HTTPBasicAuthFilter(apiKey, ""));
		client.addFilter(new UserAgentFilter());

		resource = client.resource(BASEURL);
	}

	public Set<Charge> getCharges() throws Exception {
		
		Charge[] result = resource.path("charges")
				.accept(MediaType.APPLICATION_JSON).get(Charge[].class);

		return Sets.newHashSet(result);
	}

}
