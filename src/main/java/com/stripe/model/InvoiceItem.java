package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceItem implements Serializable {

	private static final long serialVersionUID = 5371742599539316631L;
	
	protected long date, amount;
	protected String description, currency, id;

	public InvoiceItem() {
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof InvoiceItem))
			return false;
		InvoiceItem other = (InvoiceItem) obj;
		if (amount != other.amount)
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (date != other.date)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public long getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	public long getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public String getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (amount ^ (amount >>> 32));
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + (int) (date ^ (date >>> 32));
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InvoiceItem [date=").append(date).append(", amount=").append(amount).append(", ");
		if (description != null)
			builder.append("description=").append(description).append(", ");
		if (currency != null)
			builder.append("currency=").append(currency).append(", ");
		if (id != null)
			builder.append("id=").append(id);
		builder.append("]");
		return builder.toString();
	}

}
