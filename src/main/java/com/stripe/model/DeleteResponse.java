package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteResponse implements Serializable {

	private static final long serialVersionUID = -7503123117701803268L;

	protected String id;
	protected boolean deleted;

	public DeleteResponse() {
	}

	public DeleteResponse(String id, boolean deleted) {
		super();
		this.id = id;
		this.deleted = deleted;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof DeleteResponse))
			return false;
		DeleteResponse other = (DeleteResponse) obj;
		if (deleted != other.deleted)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (deleted ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DeleteResponse [");
		if (id != null)
			builder.append("id=").append(id).append(", ");
		builder.append("deleted=").append(deleted).append("]");
		return builder.toString();
	}

}
