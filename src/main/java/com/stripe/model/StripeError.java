package com.stripe.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StripeError {
	public String code;
	public String param;
	public String type;
	public String message;

	public StripeError() {
	}
}
