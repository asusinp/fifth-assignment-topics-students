/**
 * A physical electronic device
 */
package org.escoladeltreball.fifthassignment;

/**
 * @author Carlos Santos - WIAW2
 *
 */
public class Device {

	private long id;
	private DeviceType device;
	private String brand;
	private String model;
	private double price;
	
	/**
	 * @param id
	 * @param device
	 * @param brand
	 * @param model
	 * @param price
	 */
	public Device(long id, DeviceType device, String brand, String model, double price) {
		this.id = id;
		this.device = device;
		this.brand = brand;
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
	 * @return the device
	 */
	public DeviceType getDevice() {
		return device;
	}

	/**
	 * @param device the device to set
	 */
	public void setDevice(DeviceType device) {
		this.device = device;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
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
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Device [id=" + id + ", device=" + device + ", brand=" + brand + ", model=" + model + ", price=" + price
				+ "]";
	}
}
