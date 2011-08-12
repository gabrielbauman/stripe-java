package com.stripe.exception;

/**
 * {@link StripeUnauthorizedException} is thrown when an HTTP request to the
 * Stripe API returns a response with a 401 status code, indicating that your
 * API key was incorrect and the request was rejected. 
 */
public class StripeUnauthorizedException extends StripeException {

	private static final long serialVersionUID = 3666691064846302652L;

	public StripeUnauthorizedException() {
	}

	public StripeUnauthorizedException(int statusCode, String message) {
		super(statusCode, message);
	}
}
