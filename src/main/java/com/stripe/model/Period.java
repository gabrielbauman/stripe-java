package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Period implements Serializable {

	private static final long serialVersionUID = -7978907011181557048L;

	protected long start, end;

	public Period() {
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Period))
			return false;
		Period other = (Period) obj;
		if (end != other.end)
			return false;
		if (start != other.start)
			return false;
		return true;
	}

	public long getEnd() {
		return end;
	}

	public long getStart() {
		return start;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (end ^ (end >>> 32));
		result = prime * result + (int) (start ^ (start >>> 32));
		return result;
	}

	public void setEnd(long end) {
		this.end = end;
	}

	public void setStart(long start) {
		this.start = start;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Period [start=").append(start).append(", end=").append(end).append("]");
		return builder.toString();
	}
}
