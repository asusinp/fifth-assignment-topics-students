/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import java.util.Comparator;

/**
 * @author iaw26068632
 *
 */
public class DeviceTypeComparator implements Comparator<Device> {

	@Override
	public int compare(Device dev1, Device dev2) {
		return dev1.getDeviceType().compareTo(dev2.getDeviceType());
	}

}
