/**
 * A concrete device's manager implementation to work collection out in depth
 */
package org.escoladeltreball.fifthassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author pep
 *
 */
public class DeviceManagerImpl extends DeviceManager {

	public DeviceManagerImpl(String fileName) throws Exception {
		super(fileName);
	}

	@Override
	public Map<DeviceType, List<Device>> getMapByType() throws Exception {
		
		return null;
	}

	@Override
	public Map<String, List<Device>> getMapByBrand() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getSetByBrands() throws Exception {
		Set<String> brandSet = new HashSet<>();
		for (Device device:devices) {
			brandSet.add(device.getBrand());
		}
		return brandSet;
	}

	@Override
	public List<Device> getSortedList(Comparator<Device> comparator) throws Exception {
		List<Device> devicesSorted = new ArrayList<>(devices);
		Collections.sort(devicesSorted, comparator);
		return devicesSorted;
	}

	@Override
	public Map<DeviceType, Device> findCheapestDeviceOfEachType() throws Exception {
		Map<DeviceType, Device> deviceMap = new HashMap<>();
		List<Device> sortedDevices = getSortedList(new DevicePriceComparator());
		Set<String> brandSet = getSetByBrands();
		while(brandSet.size() != 0 ) {
			Device device = sortedDevices.get(0);
			if(brandSet.contains(device.getBrand())) {
				deviceMap.put(device.getType(), device);
				brandSet.remove(device.getBrand());
			}
			sortedDevices.remove(device);
		}
		return deviceMap;
	}

}
