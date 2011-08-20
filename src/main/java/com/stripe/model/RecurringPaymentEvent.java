package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecurringPaymentEvent implements Serializable {

	private static final long serialVersionUID = -6009229171543124334L;
	
	protected long customer, attempt;
	protected boolean livemode;
	protected Invoice invoice;
	protected Payment payment;

	public RecurringPaymentEvent() {
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof RecurringPaymentEvent))
			return false;
		RecurringPaymentEvent other = (RecurringPaymentEvent) obj;
		if (attempt != other.attempt)
			return false;
		if (customer != other.customer)
			return false;
		if (invoice == null) {
			if (other.invoice != null)
				return false;
		} else if (!invoice.equals(other.invoice))
			return false;
		if (livemode != other.livemode)
			return false;
		if (payment == null) {
			if (other.payment != null)
				return false;
		} else if (!payment.equals(other.payment))
			return false;
		return true;
	}

	public long getAttempt() {
		return attempt;
	}

	public long getCustomer() {
		return customer;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public Payment getPayment() {
		return payment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (attempt ^ (attempt >>> 32));
		result = prime * result + (int) (customer ^ (customer >>> 32));
		result = prime * result + ((invoice == null) ? 0 : invoice.hashCode());
		result = prime * result + (livemode ? 1231 : 1237);
		result = prime * result + ((payment == null) ? 0 : payment.hashCode());
		return result;
	}

	public boolean isLivemode() {
		return livemode;
	}

	public void setAttempt(long attempt) {
		this.attempt = attempt;
	}

	public void setCustomer(long customer) {
		this.customer = customer;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public void setLivemode(boolean livemode) {
		this.livemode = livemode;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RecurringPaymentEvent [customer=").append(customer).append(", attempt=").append(attempt)
				.append(", livemode=").append(livemode).append(", ");
		if (invoice != null)
			builder.append("invoice=").append(invoice).append(", ");
		if (payment != null)
			builder.append("payment=").append(payment);
		builder.append("]");
		return builder.toString();
	}

}
