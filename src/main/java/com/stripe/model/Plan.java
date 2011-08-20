package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Plan implements Serializable {

	private static final long serialVersionUID = 2476721098187990372L;
	
	protected String id;
	protected long amount;
	protected String currency;
	protected String interval;
	protected int trialPeriodDays;
	protected String identifier;

	public Plan() {
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Plan))
			return false;
		Plan other = (Plan) obj;
		if (amount != other.amount)
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		if (interval == null) {
			if (other.interval != null)
				return false;
		} else if (!interval.equals(other.interval))
			return false;
		if (trialPeriodDays != other.trialPeriodDays)
			return false;
		return true;
	}

	public long getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	public String getId() {
		return id;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getInterval() {
		return interval;
	}

	@JsonProperty("trial_period_days")
	public int getTrialPeriodDays() {
		return trialPeriodDays;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (amount ^ (amount >>> 32));
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
		result = prime * result + ((interval == null) ? 0 : interval.hashCode());
		result = prime * result + trialPeriodDays;
		return result;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public void setTrialPeriodDays(int trialPeriodDays) {
		this.trialPeriodDays = trialPeriodDays;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Plan [");
		if (id != null)
			builder.append("id=").append(id).append(", ");
		builder.append("amount=").append(amount).append(", ");
		if (currency != null)
			builder.append("currency=").append(currency).append(", ");
		if (interval != null)
			builder.append("interval=").append(interval).append(", ");
		builder.append("trialPeriodDays=").append(trialPeriodDays).append(", ");
		if (identifier != null)
			builder.append("identifier=").append(identifier);
		builder.append("]");
		return builder.toString();
	}
}
