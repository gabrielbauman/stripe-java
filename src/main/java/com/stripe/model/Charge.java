package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Charge implements Serializable {

	private static final long serialVersionUID = 108564488270815969L;

	protected long amount;
	protected boolean attempted;
	protected Card card;
	protected long created;
	protected String currency;
	protected String description;
	protected String id;
	protected boolean livemode;
	protected String object;
	protected boolean paid;
	protected boolean refunded;

	public Charge() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Charge))
			return false;
		Charge other = (Charge) obj;
		if (amount != other.amount)
			return false;
		if (attempted != other.attempted)
			return false;
		if (card == null) {
			if (other.card != null)
				return false;
		} else if (!card.equals(other.card))
			return false;
		if (created != other.created)
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
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
		if (livemode != other.livemode)
			return false;
		if (object == null) {
			if (other.object != null)
				return false;
		} else if (!object.equals(other.object))
			return false;
		if (paid != other.paid)
			return false;
		if (refunded != other.refunded)
			return false;
		return true;
	}

	public long getAmount() {
		return amount;
	}

	public Card getCard() {
		return card;
	}

	public long getCreated() {
		return created;
	}

	public String getCurrency() {
		return currency;
	}

	public String getDescription() {
		return description;
	}

	public String getId() {
		return id;
	}

	public String getObject() {
		return object;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (amount ^ (amount >>> 32));
		result = prime * result + (attempted ? 1231 : 1237);
		result = prime * result + ((card == null) ? 0 : card.hashCode());
		result = prime * result + (int) (created ^ (created >>> 32));
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (livemode ? 1231 : 1237);
		result = prime * result + ((object == null) ? 0 : object.hashCode());
		result = prime * result + (paid ? 1231 : 1237);
		result = prime * result + (refunded ? 1231 : 1237);
		return result;
	}

	public boolean isAttempted() {
		return attempted;
	}

	public boolean isLivemode() {
		return livemode;
	}

	public boolean isPaid() {
		return paid;
	}

	public boolean isRefunded() {
		return refunded;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public void setAttempted(boolean attempted) {
		this.attempted = attempted;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public void setCreated(long created) {
		this.created = created;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLivemode(boolean livemode) {
		this.livemode = livemode;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public void setRefunded(boolean refunded) {
		this.refunded = refunded;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Charge [amount=").append(amount).append(", attempted=").append(attempted).append(", ");
		if (card != null)
			builder.append("card=").append(card).append(", ");
		builder.append("created=").append(created).append(", ");
		if (currency != null)
			builder.append("currency=").append(currency).append(", ");
		if (description != null)
			builder.append("description=").append(description).append(", ");
		if (id != null)
			builder.append("id=").append(id).append(", ");
		builder.append("livemode=").append(livemode).append(", ");
		if (object != null)
			builder.append("object=").append(object).append(", ");
		builder.append("paid=").append(paid).append(", refunded=").append(refunded).append("]");
		return builder.toString();
	}

}
