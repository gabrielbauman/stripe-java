package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payment implements Serializable {

	private static final long serialVersionUID = -2638805057974663457L;
	
	protected long time;
	protected Card card;
	protected boolean success;

	public Payment() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Payment))
			return false;
		Payment other = (Payment) obj;
		if (card == null) {
			if (other.card != null)
				return false;
		} else if (!card.equals(other.card))
			return false;
		if (success != other.success)
			return false;
		if (time != other.time)
			return false;
		return true;
	}

	public Card getCard() {
		return card;
	}

	public long getTime() {
		return time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((card == null) ? 0 : card.hashCode());
		result = prime * result + (success ? 1231 : 1237);
		result = prime * result + (int) (time ^ (time >>> 32));
		return result;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setTime(long time) {
		this.time = time;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Payment [time=").append(time).append(", ");
		if (card != null)
			builder.append("card=").append(card).append(", ");
		builder.append("success=").append(success).append("]");
		return builder.toString();
	}

}
