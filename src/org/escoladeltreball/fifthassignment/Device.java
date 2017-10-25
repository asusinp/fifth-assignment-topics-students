/**
 * A physical electronic device
 */
package org.escoladeltreball.fifthassignment;

/**
 * @author pep
 *
 */
public class Device {

	private long id;
	private DeviceType type;
	private String style;
	private String model;
	private double price;
	/**
	 * @param id
	 * @param type
	 * @param style
	 * @param model
	 * @param price
	 */
	public Device(long id, DeviceType type, String style, String model, double price) {
		this.id = id;
		this.type = type;
		this.style = style;
		this.model = model;
		this.price = price;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the type
	 */
	public DeviceType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(DeviceType type) {
		this.type = type;
	}
	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}
	/**
	 * @param style the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((style == null) ? 0 : style.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Device)) {
			return false;
		}
		Device other = (Device) obj;
		if (id != other.id) {
			return false;
		}
		if (model == null) {
			if (other.model != null) {
				return false;
			}
		} else if (!model.equals(other.model)) {
			return false;
		}
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			return false;
		}
		if (style == null) {
			if (other.style != null) {
				return false;
			}
		} else if (!style.equals(other.style)) {
			return false;
		}
		if (type != other.type) {
			return false;
		}
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Device [id=%s, type=%s, style=%s, model=%s, price=%s]", id, type, style, model, price);
	}
	
	
	
	
}


