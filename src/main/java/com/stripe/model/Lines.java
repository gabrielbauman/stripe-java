package com.stripe.model;

import java.io.Serializable;
import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Lines implements Serializable {

	private static final long serialVersionUID = -4912602208275943299L;
	
	protected Subscription subscription;
	protected Plan plan;
	protected InvoiceItem[] invoiceItems;

	public Lines() {
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Lines))
			return false;
		Lines other = (Lines) obj;
		if (!Arrays.equals(invoiceItems, other.invoiceItems))
			return false;
		if (plan == null) {
			if (other.plan != null)
				return false;
		} else if (!plan.equals(other.plan))
			return false;
		if (subscription == null) {
			if (other.subscription != null)
				return false;
		} else if (!subscription.equals(other.subscription))
			return false;
		return true;
	}

	public InvoiceItem[] getInvoiceItems() {
		return invoiceItems;
	}

	public Plan getPlan() {
		return plan;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(invoiceItems);
		result = prime * result + ((plan == null) ? 0 : plan.hashCode());
		result = prime * result + ((subscription == null) ? 0 : subscription.hashCode());
		return result;
	}

	public void setInvoiceItems(InvoiceItem[] invoiceItems) {
		this.invoiceItems = invoiceItems;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lines [");
		if (subscription != null)
			builder.append("subscription=").append(subscription).append(", ");
		if (plan != null)
			builder.append("plan=").append(plan).append(", ");
		if (invoiceItems != null)
			builder.append("invoiceItems=").append(Arrays.toString(invoiceItems));
		builder.append("]");
		return builder.toString();
	}

}
