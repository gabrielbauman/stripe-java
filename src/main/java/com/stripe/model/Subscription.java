package com.stripe.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Subscription {
	protected long currentPeriodEnd, currentPeriodStart, trialEnd, trialStart, start, canceledAt, endedAt;

	protected Plan plan;
	protected String customer;
	protected String status;
	protected Period period;

	public Subscription() {
	}

	public Subscription(long currentPeriodEnd, long currentPeriodStart, long trialEnd, long trialStart, long start,
			long canceledAt, long endedAt, Plan plan, String customer, String status, Period period) {
		super();
		this.currentPeriodEnd = currentPeriodEnd;
		this.currentPeriodStart = currentPeriodStart;
		this.trialEnd = trialEnd;
		this.trialStart = trialStart;
		this.start = start;
		this.canceledAt = canceledAt;
		this.endedAt = endedAt;
		this.plan = plan;
		this.customer = customer;
		this.status = status;
		this.period = period;
	}

	@JsonProperty("current_period_end")
	public long getCurrentPeriodEnd() {
		return currentPeriodEnd;
	}

	public void setCurrentPeriodEnd(long currentPeriodEnd) {
		this.currentPeriodEnd = currentPeriodEnd;
	}

	@JsonProperty("current_period_start")
	public long getCurrentPeriodStart() {
		return currentPeriodStart;
	}

	public void setCurrentPeriodStart(long currentPeriodStart) {
		this.currentPeriodStart = currentPeriodStart;
	}

	@JsonProperty("trial_end")
	public long getTrialEnd() {
		return trialEnd;
	}

	public void setTrialEnd(long trialEnd) {
		this.trialEnd = trialEnd;
	}

	@JsonProperty("trial_start")
	public long getTrialStart() {
		return trialStart;
	}

	public void setTrialStart(long trialStart) {
		this.trialStart = trialStart;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	@JsonProperty("canceled_at")
	public long getCanceledAt() {
		return canceledAt;
	}

	public void setCanceledAt(long canceledAt) {
		this.canceledAt = canceledAt;
	}

	@JsonProperty("ended_at")
	public long getEndedAt() {
		return endedAt;
	}

	public void setEndedAt(long endedAt) {
		this.endedAt = endedAt;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

}
