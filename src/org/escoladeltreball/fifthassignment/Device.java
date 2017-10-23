/**
 * A physical electronic device
 */
package org.escoladeltreball.fifthassignment;

/**
 * @author pep
 *
 */
public class Device {

	// Device code
	private long code;
	// Type of device
	private DeviceType deviceType;
	// Brand of Device
	private String brand;
	// Model of device
	private String model;
	// price of devices
	private Double price;

	// ****************** Constructor *********************
	/**
	 * @param code
	 * @param deviceType
	 * @param brand
	 * @param model
	 * @param price
	 */
	public Device(long code, String deviceType, String brand, String model, Double price) {
		this.code = code;
		this.deviceType = DeviceType.valueOf(deviceType);
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	// ****************** Getters & Setters *********************

	/**
	 * @return the code
	 */
	public long getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(long code) {
		this.code = code;
	}

	/**
	 * @return the deviceType
	 */
	public Enum getDeviceType() {
		return deviceType;
	}

	/**
	 * @param deviceType
	 *            the deviceType to set
	 */
	public void setDeviceType(DeviceType deviceType) {
		this.deviceType = deviceType;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand
	 *            the brand to set
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
	 * @param model
	 *            the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	// ****************** HashCode & Equals *********************

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (code ^ (code >>> 32));
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (code != other.code)
			return false;
		return true;
	}
	
	// ****************** toString *********************

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Device [code=%s, deviceType=%s, brand=%s, model=%s, price=%s]", code, deviceType, brand,
				model, price);
	}




}
