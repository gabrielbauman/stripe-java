package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Discount implements Serializable {

	private static final long serialVersionUID = 5734839162398127195L;

	protected String code;
	protected int percentOff;

	public Discount() {
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Discount))
			return false;
		Discount other = (Discount) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (percentOff != other.percentOff)
			return false;
		return true;
	}

	public String getCode() {
		return code;
	}

	@JsonProperty("percent_off")
	public int getPercentOff() {
		return percentOff;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + percentOff;
		return result;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setPercentOff(int percentOff) {
		this.percentOff = percentOff;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Discount [");
		if (code != null)
			builder.append("code=").append(code).append(", ");
		builder.append("percentOff=").append(percentOff).append("]");
		return builder.toString();
	}

}
