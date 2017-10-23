/**
 * A physical electronic device
 */
package org.escoladeltreball.fifthassignment;

/**
 * @author pep
 */
public class Device implements Comparable<Device> {
	
	private long id;
	private String deviceType;
	private String brand;
	private String model;
	private double price;
	
	/**
	 * @param id
	 * @param deviceType
	 * @param brand
	 * @param model
	 * @param price
	 */
	public Device(long id, String deviceType, String brand, String model, double price) {
		this.id = id;
		this.deviceType = deviceType;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	@Override
	public int compareTo(Device device) {
		return (int) (id - device.id);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		return true;
	}
	
	@Override
	public String toString() {
		return String.format("Device [id=%s, deviceType=%s, brand=%s, model=%s, price=%s]", id, deviceType, brand,
				model, price);
	}
	
	// Getters & Setters

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

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
	 * @return the deviceType
	 */
	public String getDeviceType() {
		return deviceType;
	}

	/**
	 * @param deviceType the deviceType to set
	 */
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
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

}
