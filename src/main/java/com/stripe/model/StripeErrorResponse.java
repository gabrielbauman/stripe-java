package com.stripe.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StripeErrorResponse {
	public StripeError error;

	public StripeErrorResponse() {
	}
}
