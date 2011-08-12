package com.stripe.exception;

/**
 * {@link StripeBadRequestException} is thrown when an HTTP request to the
 * Stripe API returns a response with a 400 status code, indicating that your
 * request was malformed. This is usually due to a missing parameter.
 */
public class StripeBadRequestException extends StripeException {

	private static final long serialVersionUID = -769959596755582241L;

	public StripeBadRequestException() {

	}

	public StripeBadRequestException(int statusCode, String message) {
		super(statusCode, message);
	}
}
