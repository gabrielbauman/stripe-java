package com.stripe.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Lines {
	protected Subscription subscription;
	protected Plan plan;
	protected InvoiceItem[] invoiceItems;

	public Lines() {
	}

	public Lines(Subscription subscription, Plan plan, InvoiceItem[] invoiceItems) {
		super();
		this.subscription = subscription;
		this.plan = plan;
		this.invoiceItems = invoiceItems;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public InvoiceItem[] getInvoiceItems() {
		return invoiceItems;
	}

	public void setInvoiceItems(InvoiceItem[] invoiceItems) {
		this.invoiceItems = invoiceItems;
	}

}
