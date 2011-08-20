package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer implements Serializable {

	private static final long serialVersionUID = 6262281053483749213L;

	protected String description;
	protected boolean livemode;
	protected long created;
	protected Card activeCard;
	protected String id;

	protected String email;

	public Customer() {
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		if (activeCard == null) {
			if (other.activeCard != null)
				return false;
		} else if (!activeCard.equals(other.activeCard))
			return false;
		if (created != other.created)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (livemode != other.livemode)
			return false;
		return true;
	}

	@JsonProperty("active_card")
	public Card getActiveCard() {
		return activeCard;
	}

	public long getCreated() {
		return created;
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
		result = prime * result + ((activeCard == null) ? 0 : activeCard.hashCode());
		result = prime * result + (int) (created ^ (created >>> 32));
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (livemode ? 1231 : 1237);
		return result;
	}

	public boolean isLivemode() {
		return livemode;
	}

	public void setActiveCard(Card activeCard) {
		this.activeCard = activeCard;
	}

	public void setCreated(long created) {
		this.created = created;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [");
		if (description != null)
			builder.append("description=").append(description).append(", ");
		builder.append("livemode=").append(livemode).append(", created=").append(created).append(", ");
		if (activeCard != null)
			builder.append("activeCard=").append(activeCard).append(", ");
		if (id != null)
			builder.append("id=").append(id).append(", ");
		if (email != null)
			builder.append("email=").append(email);
		builder.append("]");
		return builder.toString();
	}

}
