package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Card implements Serializable {

	private static final long serialVersionUID = -2399243952072412371L;

	protected String country;
	protected String expiryMonth;
	protected String expiryYear;
	protected String id;
	protected String last4;
	protected String type;

	public Card() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (expiryMonth == null) {
			if (other.expiryMonth != null)
				return false;
		} else if (!expiryMonth.equals(other.expiryMonth))
			return false;
		if (expiryYear == null) {
			if (other.expiryYear != null)
				return false;
		} else if (!expiryYear.equals(other.expiryYear))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (last4 == null) {
			if (other.last4 != null)
				return false;
		} else if (!last4.equals(other.last4))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public String getCountry() {
		return country;
	}

	@JsonProperty("exp_month")
	public String getExpiryMonth() {
		return expiryMonth;
	}

	@JsonProperty("exp_year")
	public String getExpiryYear() {
		return expiryYear;
	}

	public String getId() {
		return id;
	}

	public String getLast4() {
		return last4;
	}

	public String getType() {
		return type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((expiryMonth == null) ? 0 : expiryMonth.hashCode());
		result = prime * result + ((expiryYear == null) ? 0 : expiryYear.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((last4 == null) ? 0 : last4.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLast4(String last4) {
		this.last4 = last4;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Card [");
		if (country != null)
			builder.append("country=").append(country).append(", ");
		if (expiryMonth != null)
			builder.append("expiryMonth=").append(expiryMonth).append(", ");
		if (expiryYear != null)
			builder.append("expiryYear=").append(expiryYear).append(", ");
		if (id != null)
			builder.append("id=").append(id).append(", ");
		if (last4 != null)
			builder.append("last4=").append(last4).append(", ");
		if (type != null)
			builder.append("type=").append(type);
		builder.append("]");
		return builder.toString();
	}

}
