package com.stripe.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Card {
	protected String type;
	protected String country;
	protected String expiryMonth;
	protected String expiryYear;
	protected String last4;
	protected String id;

	public Card() {
	}

	public Card(String type, String country, String expiryMonth, String expiryYear, String last4, String id) {
		super();
		this.type = type;
		this.country = country;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.last4 = last4;
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("exp_month")
	public String getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	@JsonProperty("exp_month")
	public String getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}

	public String getLast4() {
		return last4;
	}

	public void setLast4(String last4) {
		this.last4 = last4;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
