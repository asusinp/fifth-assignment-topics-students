/**
 * A physical electronic device
 */
package org.escoladeltreball.fifthassignment;

/**
 * @author pep
 *
 */
public class Device {
	
	// id of device
	private long id;
	// type of device
	private DeviceType type;
	// brand of device
	private String brand;
	//model of device
	private String model;
	// price of device
	private double price;
	
	/**
	 * @param id
	 * @param type
	 * @param brand
	 * @param model
	 * @param price
	 */
	public Device(long id, DeviceType type, String brand, String model, double price) {
		this.id = id;
		this.type = type;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	// ********* Getters & Setters **********

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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Device [id=%s, type=%s, brand=%s, model=%s, price=%s]", id, type, brand, model, price);
	}

}
