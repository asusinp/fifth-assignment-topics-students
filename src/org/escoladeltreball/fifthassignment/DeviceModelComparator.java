/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import java.util.Comparator;

/**
 * @author iaw26540084
 *
 */
public class DeviceModelComparator implements Comparator<Device> {

	@Override
	public int compare(Device device1, Device device2) {
		return device1.getModel().compareTo(device2.getModel());
	}

}
