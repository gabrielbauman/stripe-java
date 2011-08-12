package com.stripe.exception;

/**
 * {@link StripeServerErrorException} is thrown when an HTTP request to the
 * Stripe API returns a response with a 5XX status code, indicating that
 * something has gone wrong with Stripe's service.
 */
public class StripeServerErrorException extends StripeException {

	private static final long serialVersionUID = 5973542329323958647L;

	public StripeServerErrorException() {
	}

	public StripeServerErrorException(int statusCode, String message) {
		super(statusCode, message);
	}
}
