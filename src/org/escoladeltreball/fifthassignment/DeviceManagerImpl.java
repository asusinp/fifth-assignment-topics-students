/**
 * A concrete device's manager implementation to work collection out in depth
 */
package org.escoladeltreball.fifthassignment;

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
		Map<DeviceType, List<Device>> map = new HashMap<>();
		List<Device> smartphoneDevices = new LinkedList<>();
		List<Device> labtopDevices = new LinkedList<>();
		List<Device> desktopDevices = new LinkedList<>();
		List<Device> smartwearDevices = new LinkedList<>();
		for (Device device : devices) {
			if (device.getType() == DeviceType.smartphone) {
				smartphoneDevices.add(device); 
			} else if (device.getType() == DeviceType.labtop) {
				labtopDevices.add(device);
			} else if (device.getType() == DeviceType.desktop) {
				desktopDevices.add(device);
			} else if (device.getType() == DeviceType.smartwear) {
				smartwearDevices.add(device);
			}
		}
		map.put(DeviceType.smartphone, smartphoneDevices);
		map.put(DeviceType.smartwear, smartwearDevices);
		map.put(DeviceType.desktop, desktopDevices);
		map.put(DeviceType.labtop, labtopDevices);
		return map;
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public Map<String, List<Device>> getMapByBrand() throws Exception {
		Map<String, List<Device>> map = new HashMap<>();
//		HashSet<String> brands = new HashSet<>();
//		for (Device device : devices) {
//			brands.add(device.getBrand());
//		}
//		System.out.println(brands);
		List<Device> samsungDevices = new LinkedList<>();
		List<Device> appleDevices = new LinkedList<>();
		List<Device> acerDevices = new LinkedList<>();
		List<Device> hcDevices = new LinkedList<>();
		List<Device> ibmDevices = new LinkedList<>();
		List<Device> sunDevices = new LinkedList<>();
		for (Device device : devices) {
			if (device.getBrand().equals("samsung")) {
				samsungDevices.add(device);				 
			} else if (device.getBrand().equals("apple")) {
				appleDevices.add(device);
			} else if (device.getBrand().equals("acer")) {
				acerDevices.add(device);
			} else if (device.getBrand().equals("hc")) {
				hcDevices.add(device);
			} else if (device.getBrand().equals("ibm")) {
				ibmDevices.add(device);
			} else if (device.getBrand().equals("sun")) {
				sunDevices.add(device);
			}
		}
		map.put("samsung", samsungDevices);
		map.put("apple", appleDevices);
		map.put("acer", acerDevices);
		map.put("hc", hcDevices);
		map.put("ibm", ibmDevices);
		map.put("sun", sunDevices);
		return map;
		
	}

	@Override
	public Set<String> getSetByBrands() throws Exception {
		Set<String> brandsSet = new HashSet<String>();
		for (Device device : devices) {
			brandsSet.add(device.getBrand());
		}
		return brandsSet;
	}

	@Override
	public List<Device> getSortedList(Comparator<Device> comparator) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<DeviceType, Device> findCheapestDeviceOfEachType() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
