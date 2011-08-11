package com.stripe.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Plan {
	protected String id;
	protected long amount;
	protected String currency;
	protected String interval;
	protected int trialPeriodDays;
	protected String identifier;

	public Plan() {
	}

	public Plan(String id, long amount, String currency, String interval, int trialPeriodDays, String identifier) {
		super();
		this.id = id;
		this.amount = amount;
		this.currency = currency;
		this.interval = interval;
		this.trialPeriodDays = trialPeriodDays;
		this.identifier = identifier;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	@JsonProperty("trial_period_days")
	public int getTrialPeriodDays() {
		return trialPeriodDays;
	}

	public void setTrialPeriodDays(int trialPeriodDays) {
		this.trialPeriodDays = trialPeriodDays;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
}
