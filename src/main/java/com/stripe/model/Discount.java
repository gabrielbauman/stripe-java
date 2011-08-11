package com.stripe.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Discount {
	protected String code;
	protected int percentOff;

	public Discount() {
	}

	public Discount(String code, int percentOff) {
		super();
		this.code = code;
		this.percentOff = percentOff;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@JsonProperty("percent_off")
	public int getPercentOff() {
		return percentOff;
	}

	public void setPercentOff(int percentOff) {
		this.percentOff = percentOff;
	}

}
