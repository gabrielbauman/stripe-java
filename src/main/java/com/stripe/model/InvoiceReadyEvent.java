package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceReadyEvent  implements Serializable{

	private static final long serialVersionUID = -8485898834486864399L;
	
	protected long customer;
	protected Invoice invoice;

	public InvoiceReadyEvent() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof InvoiceReadyEvent))
			return false;
		InvoiceReadyEvent other = (InvoiceReadyEvent) obj;
		if (customer != other.customer)
			return false;
		if (invoice == null) {
			if (other.invoice != null)
				return false;
		} else if (!invoice.equals(other.invoice))
			return false;
		return true;
	}

	public long getCustomer() {
		return customer;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (customer ^ (customer >>> 32));
		result = prime * result + ((invoice == null) ? 0 : invoice.hashCode());
		return result;
	}

	public void setCustomer(long customer) {
		this.customer = customer;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InvoiceReadyEvent [customer=").append(customer).append(", ");
		if (invoice != null)
			builder.append("invoice=").append(invoice);
		builder.append("]");
		return builder.toString();
	}

}
