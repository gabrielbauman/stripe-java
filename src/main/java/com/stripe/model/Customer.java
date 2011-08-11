package com.stripe.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
	protected String description;
	protected boolean livemode;
	protected long created;
	protected Card activeCard;
	protected String id;

	public Customer() {
	}

	public Customer(String description, boolean livemode, long created, Card activeCard, String id) {
		super();
		this.description = description;
		this.livemode = livemode;
		this.created = created;
		this.activeCard = activeCard;
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isLivemode() {
		return livemode;
	}

	public void setLivemode(boolean livemode) {
		this.livemode = livemode;
	}

	public long getCreated() {
		return created;
	}

	public void setCreated(long created) {
		this.created = created;
	}

	@JsonProperty("active_card")
	public Card getActiveCard() {
		return activeCard;
	}

	public void setActiveCard(Card activeCard) {
		this.activeCard = activeCard;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
