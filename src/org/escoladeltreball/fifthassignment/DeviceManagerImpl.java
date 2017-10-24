/**
 * A concrete device's manager implementation to work collection out in depth
 */
package org.escoladeltreball.fifthassignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
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
		List<Device> smartphone = new LinkedList<>();
		List<Device> smartwear = new LinkedList<>();
		List<Device> labtop = new LinkedList<>();
		List<Device> desktop = new LinkedList<>();

		Map<DeviceType, List<Device>> map = new HashMap<>();

		for (Device device : devices) {
			if (device.getDeviceType().equals(DeviceType.smartphone)) {
				smartphone.add(device);
			} else if (device.getDeviceType().equals(DeviceType.smartwear)) {
				smartwear.add(device);
			} else if (device.getDeviceType().equals(DeviceType.labtop)) {
				labtop.add(device);
			} else {
				desktop.add(device);
			}
		}

		map.put(DeviceType.smartphone, smartphone);
		map.put(DeviceType.smartwear, smartwear);
		map.put(DeviceType.labtop, labtop);
		map.put(DeviceType.desktop, desktop);
		return map;
	}

	@Override
	public Map<String, List<Device>> getMapByBrand() throws Exception {
		List<Device> samsung = new LinkedList<>();
		List<Device> apple = new LinkedList<>();
		List<Device> acer = new LinkedList<>();
		List<Device> hc = new LinkedList<>();
		List<Device> ibm = new LinkedList<>();
		List<Device> sun = new LinkedList<>();

		Map<String, List<Device>> map = new HashMap<>();

		for (Device device : devices) {
			if (device.getBrand().equals("samsung")) {
				samsung.add(device);
			} else if (device.getBrand().equals("iphone")) {
				apple.add(device);
			} else if (device.getBrand().equals("acer")) {
				acer.add(device);
			} else if (device.getBrand().equals("hc")) {
				hc.add(device);
			} else if (device.getBrand().equals("ibm")) {
				ibm.add(device);
			} else if (device.getBrand().equals("sun")) {
				sun.add(device);
			}
		}

		map.put("samsung", samsung);
		map.put("apple", apple);
		map.put("acer", acer);
		map.put("ibm", ibm);
		map.put("hc", hc);
		map.put("sun", sun);

		return map;
	}

	@Override
	public Set<String> getSetByBrands() throws Exception {
		Set brands = new HashSet<String>();
		for (Device device : devices) {
			brands.add(device.getBrand());
		}
		return brands;
	}

	@Override
	public List<Device> getSortedList(Comparator<Device> comparator) throws Exception {
		if (devices != null) {
			List<Device> devicesSorted = new LinkedList<Device>(devices);
			Collections.sort(devicesSorted, comparator);
			return devicesSorted;
		} else {
			throw new Exception("devices is null or the file is unreached");
		}
	}

	@Override
	public Map<DeviceType, Device> findCheapestDeviceOfEachType() throws Exception {
		List<Device> devicesSorted = this.getSortedList(new DevicePriceComparator());
		Map<DeviceType, Device> map = new HashMap<>();
		Collections.sort(devicesSorted, new DeviceTypeComparator());
//		for(Device dev: devicesSorted) {
//		 System.out.println(dev.toString());
//		 }
		DeviceType[] types = DeviceType.values();
		for (DeviceType deviceType : types) {
			Device devCheapest = null;
			for (Device device : devicesSorted) {
					if(device.getDeviceType().equals(deviceType)) {
						devCheapest = device;
					}
			}
			map.put(deviceType, devCheapest);
		}
		return map;
	}

	public List<Device> getDevices() {
		return devices;
	}

}
