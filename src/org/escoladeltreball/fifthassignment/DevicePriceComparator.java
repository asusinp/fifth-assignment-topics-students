package org.escoladeltreball.fifthassignment;

import java.util.Comparator;

/**
 * @author iaw21752927
 *
 */
public class DevicePriceComparator implements Comparator<Device> {
	
	/**
	 * Returns a negative number if price of this device is less than other device price
	 * 0 if the id of two devices is the same
	 * positive number if price of this device is greater than other device price
	 */
	@Override
	public int compare(Device device1, Device device2) {
		return (int) (device1.getPrice() - device2.getPrice());
	}
}
