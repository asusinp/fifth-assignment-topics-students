/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import java.util.Comparator;

/**
 * @author iaw24555579
 *
 */
public class DevicePriceComparator implements Comparator<Device> {

	@Override
	public int compare(Device device1, Device device2) {
		return Double.compare(device1.getPrice(), device2.getPrice());
	}

}
