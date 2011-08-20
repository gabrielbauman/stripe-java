package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StripeErrorResponse implements Serializable {

	private static final long serialVersionUID = 8471677241982331832L;
	
	public StripeError error;

	public StripeErrorResponse() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof StripeErrorResponse))
			return false;
		StripeErrorResponse other = (StripeErrorResponse) obj;
		if (error == null) {
			if (other.error != null)
				return false;
		} else if (!error.equals(other.error))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((error == null) ? 0 : error.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StripeErrorResponse [");
		if (error != null)
			builder.append("error=").append(error);
		builder.append("]");
		return builder.toString();
	}
}
