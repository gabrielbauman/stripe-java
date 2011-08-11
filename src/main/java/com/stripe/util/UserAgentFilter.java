package com.stripe.util;

import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.filter.ClientFilter;

/**
 * Add an HTTP header to each outgoing request, identifying the client library
 * to the Stripe servers. This is intended to help debug problems with different
 * versions of stripe-java and to allow Stripe to deprecate library versions at
 * the server.
 * 
 * @author Gabriel Bauman <gabe@codehaus.org>
 * 
 */
public class UserAgentFilter extends ClientFilter {

	public UserAgentFilter() {
		super();
	}

	@Override
	public ClientResponse handle(ClientRequest cr) throws ClientHandlerException {

		// TODO hook this into the build so that versioning is handled
		// automagically.
		cr.getHeaders().add("User-Agent", "Stripe/v1 JavaBindings/0.0 Git/0");

		// TODO The value of this should be a JSON dictionary with system
		// details.
		// https://github.com/stripe/stripe-python/blob/master/stripe/__init__.py#L202
		cr.getHeaders().add("X-Stripe-Client-User-Agent", "{}");

		/*
		 * ua = { 'bindings_version' : VERSION, 'lang' : 'python', 'publisher' :
		 * 'stripe' } for attr, func in [['lang_version',
		 * platform.python_version], ['platform', platform.platform], ['uname',
		 * lambda: ' '.join(platform.uname())]]:
		 */

		ClientResponse result = getNext().handle(cr);

		return result;
	}

}
