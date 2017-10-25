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

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public Map<DeviceType, List<Device>> getMapByType() throws Exception {
		Map<DeviceType, List<Device>> map = new HashMap<>();
		List<Device> devicesList = super.getDevices();
		List<Device> smartphones = new ArrayList<>();
		List<Device> smartwears = new ArrayList<>();
		List<Device> laptops = new ArrayList<>();
		List<Device> desktops = new ArrayList<>();
		for (Device device : devicesList) {
			if (device.getType().equals(DeviceType.valueOf("smartphone"))) {
				smartphones.add(device);
			} else if (device.getType().equals(DeviceType.valueOf("smartwear"))) {
				smartwears.add(device);
			} else if (device.getType().equals(DeviceType.valueOf("laptop"))) {
				laptops.add(device);
			} else if (device.getType().equals(DeviceType.valueOf("desktop"))) {
				desktops.add(device);
			}
		}
		map.put(DeviceType.valueOf("smartphone"), smartphones);
		map.put(DeviceType.valueOf("smartwear"), smartwears);
		map.put(DeviceType.valueOf("laptop"), laptops);
		map.put(DeviceType.valueOf("desktop"), desktops);
		
		return map;
	}

	@Override
	public Map<String, List<Device>> getMapByBrand() throws Exception {
		Map<String, List<Device>> map = new HashMap<>();
		List<Device> devicesList = super.getDevices();
		List<Device> samsungs = new ArrayList<>();
		List<Device> apples = new ArrayList<>();
		List<Device> acers = new ArrayList<>();
		List<Device> hcs = new ArrayList<>();
		List<Device> ibms = new ArrayList<>();
		List<Device> suns = new ArrayList<>();
		for (Device device : devicesList) {
			if (device.getBrand().equals("samsung")) {
				samsungs.add(device);
			} else if (device.getBrand().equals("apple")) {
				apples.add(device);
			} else if (device.getBrand().equals("acer")) {
				acers.add(device);
			} else if (device.getBrand().equals("hc")) {
				hcs.add(device);
			} else if (device.getBrand().equals("ibm")) {
				ibms.add(device);
			} else if (device.getBrand().equals("sun")) {
				suns.add(device);
			}
		}
		map.put("samsung", samsungs);
		map.put("apple", apples);
		map.put("acer", acers);
		map.put("hc", hcs);
		map.put("ibm", ibms);
		map.put("sun", suns);
		
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
		List<Device> deviceSorted = new ArrayList<>(super.getDevices());
		Collections.sort(deviceSorted, comparator);
		return deviceSorted;
	}

	@Override
	public Map<DeviceType, Device> findCheapestDeviceOfEachType() throws Exception {
		Map<DeviceType, Device> map = new HashMap<>();
		List<Device> devicesList = super.getDevices();
		List<Device> smartphones = new ArrayList<>();
		List<Device> smartwears = new ArrayList<>();
		List<Device> laptops = new ArrayList<>();
		List<Device> desktops = new ArrayList<>();
		Device cheapestSmartphone;
		Device cheapestSmartwear;
		Device cheapestLaptop;
		Device cheapestDesktop;
		for (Device device : devicesList) {
			if (device.getType().equals(DeviceType.valueOf("smartphone"))) {
				smartphones.add(device);
			} else if (device.getType().equals(DeviceType.valueOf("smartwear"))) {
				smartwears.add(device);
			} else if (device.getType().equals(DeviceType.valueOf("laptop"))) {
				laptops.add(device);
			} else if (device.getType().equals(DeviceType.valueOf("desktop"))) {
				desktops.add(device);
			}
		}
		cheapestSmartphone = smartphones.get(0);
		cheapestSmartwear = smartwears.get(0);
		cheapestLaptop = laptops.get(0);
		cheapestDesktop = desktops.get(0);
		
		for (Device device : smartphones) {
			if ( device.getPrice() < cheapestSmartphone.getPrice()) {
				cheapestSmartphone = device;
			}
		}
		
		for (Device device : smartwears) {
			if ( device.getPrice() < cheapestSmartwear.getPrice()) {
				cheapestSmartwear = device;
			}
		}
		
		for (Device device : laptops) {
			if ( device.getPrice() < cheapestLaptop.getPrice()) {
				cheapestLaptop = device;
			}
		}
		
		for (Device device : desktops) {
			if ( device.getPrice() < cheapestDesktop.getPrice()) {
				cheapestDesktop = device;
			}
		}
		map.put(DeviceType.valueOf("smartphone"), cheapestSmartphone);
		map.put(DeviceType.valueOf("smartwear"), cheapestSmartwear);
		map.put(DeviceType.valueOf("laptop"), cheapestLaptop);
		map.put(DeviceType.valueOf("desktop"), cheapestDesktop);
		
		System.out.println(map);
		return map;
	}

}
