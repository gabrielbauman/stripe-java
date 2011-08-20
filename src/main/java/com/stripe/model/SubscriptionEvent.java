package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionEvent implements Serializable {

	private static final long serialVersionUID = -2460647124763727193L;

	protected long customer;
	protected Subscription subscription;

	public SubscriptionEvent() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SubscriptionEvent))
			return false;
		SubscriptionEvent other = (SubscriptionEvent) obj;
		if (customer != other.customer)
			return false;
		if (subscription == null) {
			if (other.subscription != null)
				return false;
		} else if (!subscription.equals(other.subscription))
			return false;
		return true;
	}

	public long getCustomer() {
		return customer;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (customer ^ (customer >>> 32));
		result = prime * result + ((subscription == null) ? 0 : subscription.hashCode());
		return result;
	}

	public void setCustomer(long customer) {
		this.customer = customer;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SubscriptionEvent [customer=").append(customer).append(", ");
		if (subscription != null)
			builder.append("subscription=").append(subscription);
		builder.append("]");
		return builder.toString();
	}

}
