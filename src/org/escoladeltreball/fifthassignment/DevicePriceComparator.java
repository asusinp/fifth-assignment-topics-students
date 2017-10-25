/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import java.util.Comparator;

/**
 * @author iaw46490689
 *
 */
public class DevicePriceComparator implements Comparator<Device> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Device device1, Device device2) {
		return Double.compare(device1.getPrice(), device2.getPrice());
	}

}
