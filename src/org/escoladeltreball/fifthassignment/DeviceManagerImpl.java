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
		List<Device> deviceList = new ArrayList<>();
		List<Device> smartphones = new ArrayList<>();
		List<Device> smartwears = new ArrayList<>();
		List<Device> labtops = new ArrayList<>();
		List<Device> desktops = new ArrayList<>();
		
		for (Device device : deviceList) {
			deviceList.add(device);
			if (device.getType().equals("smartphone")) {
				smartphones.add(device);
			} else if (device.getType().equals("smartwear")) {
				smartwears.add(device);
			} else if (device.getType().equals("labtop")) {
				labtops.add(device);
			} else if (device.getType().equals("desktop")) {
				desktops.add(device);
			}
		}
		
		map.put(DeviceType.valueOf("smartphone"), smartphones);
		map.put(DeviceType.valueOf("smartwear"), smartwears);
		map.put(DeviceType.valueOf("labtop"), labtops);
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
			if (device.getStyle().equals("samsung")) {
				samsungs.add(device);
			} else if (device.getStyle().equals("apple")) {
				apples.add(device);
			} else if (device.getStyle().equals("acer")) {
				acers.add(device);
			} else if (device.getStyle().equals("hc")) {
				hcs.add(device);
			} else if (device.getStyle().equals("ibm")) {
				ibms.add(device);
			} else if (device.getStyle().equals("sun")) {
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
			brands.add(device.getStyle());
		}
		return brands;
	}

	@Override
	public List<Device> getSortedList(Comparator<Device> comparator) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<DeviceType, Double> findCheapestDeviceOfEachType() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
