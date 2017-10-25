/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import java.util.Comparator;

/**
 * @author iaw39442165
 *
 */
public class DeviceTypeComparator implements Comparator<Device> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Device device1, Device device2) {
		DeviceType type1 = device1.getType();
		DeviceType type2 = device2.getType();
		return type1.compareTo(type2);
	}

}
