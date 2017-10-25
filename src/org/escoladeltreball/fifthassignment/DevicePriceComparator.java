/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import java.util.Comparator;

/**
 * @author Carlos Santos - WIAW2
 *
 */
public class DevicePriceComparator implements Comparator<Device> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Device device1, Device device2) {
		return new Double(device1.getPrice()).compareTo(new Double(device2.getPrice()));
	}

}
