package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Subscription implements Serializable {

	private static final long serialVersionUID = -5064697477386010587L;

	protected long currentPeriodEnd, currentPeriodStart, trialEnd, trialStart, start, canceledAt, endedAt;

	protected Plan plan;
	protected String customer;
	protected String status;
	protected Period period;

	public Subscription() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Subscription))
			return false;
		Subscription other = (Subscription) obj;
		if (canceledAt != other.canceledAt)
			return false;
		if (currentPeriodEnd != other.currentPeriodEnd)
			return false;
		if (currentPeriodStart != other.currentPeriodStart)
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (endedAt != other.endedAt)
			return false;
		if (period == null) {
			if (other.period != null)
				return false;
		} else if (!period.equals(other.period))
			return false;
		if (plan == null) {
			if (other.plan != null)
				return false;
		} else if (!plan.equals(other.plan))
			return false;
		if (start != other.start)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (trialEnd != other.trialEnd)
			return false;
		if (trialStart != other.trialStart)
			return false;
		return true;
	}

	@JsonProperty("canceled_at")
	public long getCanceledAt() {
		return canceledAt;
	}

	@JsonProperty("current_period_end")
	public long getCurrentPeriodEnd() {
		return currentPeriodEnd;
	}

	@JsonProperty("current_period_start")
	public long getCurrentPeriodStart() {
		return currentPeriodStart;
	}

	public String getCustomer() {
		return customer;
	}

	@JsonProperty("ended_at")
	public long getEndedAt() {
		return endedAt;
	}

	public Period getPeriod() {
		return period;
	}

	public Plan getPlan() {
		return plan;
	}

	public long getStart() {
		return start;
	}

	public String getStatus() {
		return status;
	}

	@JsonProperty("trial_end")
	public long getTrialEnd() {
		return trialEnd;
	}

	@JsonProperty("trial_start")
	public long getTrialStart() {
		return trialStart;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (canceledAt ^ (canceledAt >>> 32));
		result = prime * result + (int) (currentPeriodEnd ^ (currentPeriodEnd >>> 32));
		result = prime * result + (int) (currentPeriodStart ^ (currentPeriodStart >>> 32));
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + (int) (endedAt ^ (endedAt >>> 32));
		result = prime * result + ((period == null) ? 0 : period.hashCode());
		result = prime * result + ((plan == null) ? 0 : plan.hashCode());
		result = prime * result + (int) (start ^ (start >>> 32));
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + (int) (trialEnd ^ (trialEnd >>> 32));
		result = prime * result + (int) (trialStart ^ (trialStart >>> 32));
		return result;
	}

	public void setCanceledAt(long canceledAt) {
		this.canceledAt = canceledAt;
	}

	public void setCurrentPeriodEnd(long currentPeriodEnd) {
		this.currentPeriodEnd = currentPeriodEnd;
	}

	public void setCurrentPeriodStart(long currentPeriodStart) {
		this.currentPeriodStart = currentPeriodStart;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public void setEndedAt(long endedAt) {
		this.endedAt = endedAt;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setTrialEnd(long trialEnd) {
		this.trialEnd = trialEnd;
	}

	public void setTrialStart(long trialStart) {
		this.trialStart = trialStart;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Subscription [currentPeriodEnd=").append(currentPeriodEnd).append(", currentPeriodStart=")
				.append(currentPeriodStart).append(", trialEnd=").append(trialEnd).append(", trialStart=")
				.append(trialStart).append(", start=").append(start).append(", canceledAt=").append(canceledAt)
				.append(", endedAt=").append(endedAt).append(", ");
		if (plan != null)
			builder.append("plan=").append(plan).append(", ");
		if (customer != null)
			builder.append("customer=").append(customer).append(", ");
		if (status != null)
			builder.append("status=").append(status).append(", ");
		if (period != null)
			builder.append("period=").append(period);
		builder.append("]");
		return builder.toString();
	}

}
