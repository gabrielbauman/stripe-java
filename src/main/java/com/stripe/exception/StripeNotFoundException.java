package com.stripe.exception;

/**
 * {@link StripeNotFoundException} is thrown when an HTTP request to the Stripe
 * API returns a response with a 404 status code, indicating that the request
 * failed because the resource you were attempting to work with does not exist.
 */
public class StripeNotFoundException extends StripeException {

	private static final long serialVersionUID = 7327544733869018763L;

	public StripeNotFoundException() {
	}

	public StripeNotFoundException(int statusCode, String message) {
		super(statusCode, message);
	}
}
