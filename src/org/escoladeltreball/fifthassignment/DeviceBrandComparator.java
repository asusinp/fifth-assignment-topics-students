/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import java.util.Comparator;

/**
 * @author iaw39442165
 *
 */
public class DeviceBrandComparator implements Comparator<Device> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Device device1, Device device2) {
		String type1 = device1.getBrand();
		String type2 = device2.getBrand();
		return type1.compareTo(type2);
	}

}
