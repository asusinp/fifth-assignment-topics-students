/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import java.util.Comparator;

/**
 * @author iaw46490689
 *
 */
public class DeviceTypeComparator implements Comparator<Device> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Device device1, Device device2) {
		return device1.getDeviceType().compareTo(device2.getDeviceType());
	}

}
