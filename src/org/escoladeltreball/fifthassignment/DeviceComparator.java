/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import java.util.Comparator;

/**
 * @author iaw26509397
 *
 */
public class DeviceComparator implements Comparator<Device> {


	@Override
	public int compare(Device dev1, Device dev2) {
		return dev1.getModel().compareTo(dev2.getModel());
	}

}
