package com.stripe.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Invoice implements Serializable {

	private static final long serialVersionUID = 2891614845179127861L;
	
	protected long created, subtotal, total;
	protected String id;
	protected Lines lines;
	protected Discount discount;

	public Invoice() {
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Invoice))
			return false;
		Invoice other = (Invoice) obj;
		if (created != other.created)
			return false;
		if (discount == null) {
			if (other.discount != null)
				return false;
		} else if (!discount.equals(other.discount))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lines == null) {
			if (other.lines != null)
				return false;
		} else if (!lines.equals(other.lines))
			return false;
		if (subtotal != other.subtotal)
			return false;
		if (total != other.total)
			return false;
		return true;
	}

	public long getCreated() {
		return created;
	}

	public Discount getDiscount() {
		return this.discount;
	}

	public String getId() {
		return id;
	}

	public Lines getLines() {
		return lines;
	}

	public long getSubtotal() {
		return subtotal;
	}

	public long getTotal() {
		return total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (created ^ (created >>> 32));
		result = prime * result + ((discount == null) ? 0 : discount.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lines == null) ? 0 : lines.hashCode());
		result = prime * result + (int) (subtotal ^ (subtotal >>> 32));
		result = prime * result + (int) (total ^ (total >>> 32));
		return result;
	}

	public void setCreated(long created) {
		this.created = created;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLines(Lines lines) {
		this.lines = lines;
	}

	public void setSubtotal(long subtotal) {
		this.subtotal = subtotal;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Invoice [created=").append(created).append(", subtotal=").append(subtotal).append(", total=")
				.append(total).append(", ");
		if (id != null)
			builder.append("id=").append(id).append(", ");
		if (lines != null)
			builder.append("lines=").append(lines).append(", ");
		if (discount != null)
			builder.append("discount=").append(discount);
		builder.append("]");
		return builder.toString();
	}
}
