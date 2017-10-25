/**
 * A concrete device's manager implementation to work collection out in depth
 */
package org.escoladeltreball.fifthassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
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
		if (devices.size() == 0 || devices == null) {
			throw new Exception("Devices missing");
		}
	}

	@Override
	public Map<DeviceType, List<Device>> getMapByType() throws Exception {
		Map <DeviceType, List<Device>> map = new HashMap<>();
		for (DeviceType type : DeviceType.values()) {
			List<Device> l1 = new ArrayList<>();
			for (Device device : devices) {
				if (device.getType() == type) {
					l1.add(device);
				}
			}
			map.put(type,l1);
		}
		return map;
	}

	@Override
	public Map<String, List<Device>> getMapByBrand() throws Exception {
		return null;
	}

	@Override
	public Set<String> getSetByBrands() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Device> getSortedList(Comparator<Device> comparator) throws Exception {
		List<Device> devicesSorted = new ArrayList<>(devices);
		Collections.sort(devicesSorted,comparator);
		return devicesSorted;
	}

	@Override
	public Map<DeviceType, Device> findCheapestDeviceOfEachType() throws Exception {
		Map <DeviceType, Device> cheapMap = new HashMap<>();
		Map<DeviceType,List<Device>> map = getMapByType();
		for (DeviceType type : map.keySet()()) {
			cheapMap.put( deviceList.sort(new DevicePriceComparator()).get(0).getType(), getSortedList(new DevicePriceComparator()).get(0));
		}
		return cheapMap;
	}

}
