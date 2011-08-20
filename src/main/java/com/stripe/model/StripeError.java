package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StripeError implements Serializable {

	private static final long serialVersionUID = 4833030492825334501L;

	public String code;
	public String param;
	public String type;
	public String message;

	public StripeError() {
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof StripeError))
			return false;
		StripeError other = (StripeError) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (param == null) {
			if (other.param != null)
				return false;
		} else if (!param.equals(other.param))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((param == null) ? 0 : param.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StripeError [");
		if (code != null)
			builder.append("code=").append(code).append(", ");
		if (param != null)
			builder.append("param=").append(param).append(", ");
		if (type != null)
			builder.append("type=").append(type).append(", ");
		if (message != null)
			builder.append("message=").append(message);
		builder.append("]");
		return builder.toString();
	}

}
