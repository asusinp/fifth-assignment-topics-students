/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import java.util.Comparator;

/**
 * @author iaw26068632
 *
 */
public class DevicePriceComparator implements Comparator<Device> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Device dev1, Device dev2) {
		if (dev1.getPrice() > dev2.getPrice()) return 1;
		if (dev1.getPrice() < dev2.getPrice()) return -1;
		return 0;
	}

}
