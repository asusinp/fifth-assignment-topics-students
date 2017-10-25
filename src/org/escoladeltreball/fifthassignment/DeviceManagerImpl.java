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
		Map<DeviceType, List<Device>> map = new HashMap<>();
		DeviceType[] types = DeviceType.values();
		for (DeviceType deviceType : types) {
			List<Device> list = new ArrayList<>();
			for (Device device : devices) {
				if (deviceType.equals(device.getDeviceType())) {
					list.add(device);
				}
			}
			map.put(deviceType, list);
		}
		return map;
	}

	@Override
	public Map<String, List<Device>> getMapByBrand() throws Exception {
		Set<String> brands = getSetByBrands();
		Map<String, List<Device>> map = new HashMap<>();
		for (String brand : brands) {
			List<Device> list = new ArrayList<>();
			for (Device device : devices) {
				if (brand.equals(device.getBrand())) {
					list.add(device);
				}
			}
			map.put(brand, list);
		}
		return map;
	}

	@Override
	public Set<String> getSetByBrands() throws Exception {
		Set<String> brands = new HashSet<>();
		for (Device device : devices) {
			brands.add(device.getBrand());
		}
		return brands;
	}

	@Override
	public List<Device> getSortedList(Comparator<Device> comparator) throws Exception {
		List<Device> sortedList = new ArrayList<Device>(devices);
		Collections.sort(sortedList,comparator);
		return sortedList;
	}

	@Override
	public Map<DeviceType, Device> findCheapestDeviceOfEachType() throws Exception {
		Map<DeviceType, List<Device>> map = getMapByType();
		Map<DeviceType, Device> cheaps = new HashMap<>();
		for (DeviceType key : map.keySet()) {
			Device cheap = cheapestDevice(map.get(key));
			cheaps.put(key, cheap);
		}
		return cheaps;
	}
	
	/**
	 * Method used to get the cheapest device in a list of devices.
	 * 
	 * @param devices
	 * @return
	 * @throws Exception
	 */
	public Device cheapestDevice(List<Device> devices) throws Exception {
		Collections.sort(devices,new DevicePriceComparator());
		return devices.get(0);
	}

}
