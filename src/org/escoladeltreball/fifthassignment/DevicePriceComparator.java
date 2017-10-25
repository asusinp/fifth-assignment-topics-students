/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import java.util.Comparator;


/**
 * @author iaw39442165
 *
 */
public class DevicePriceComparator implements Comparator<Device> {

	@Override
	public int compare(Device device1, Device device2) {
		Double price1 = device1.getPrice();
		Double price2 = device2.getPrice();
		return Double.compare(price1, price2);
	}
	
}
