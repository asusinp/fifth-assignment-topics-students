/**
 * A concrete device's manager implementation to work collection out in depth
 */
package org.escoladeltreball.fifthassignment;

import java.util.ArrayList;
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
		for (int i = 0; i < types.length; i++) {
			List<Device> listaDevices = new ArrayList<>();
			for (Device dispositiu : devices) {
				if (dispositiu.getDevice().equals(types[i])) {
					listaDevices.add(dispositiu);
				}
			}
			map.put(types[i], listaDevices);
		}
		return map;
	}

	@Override
	public Map<String, List<Device>> getMapByBrand() throws Exception {
		Set<String> brands = getSetByBrands();
		Map<String, List<Device>> map = new HashMap<>();
		for (String strBrand : brands) {
			List<Device> listaDevices = new ArrayList<>();
			for (Device dispositiu : devices) {
				if (dispositiu.getBrand().equals(strBrand)) {
					listaDevices.add(dispositiu);
				}
			}
			map.put(strBrand, listaDevices);
		}
		return map;
	}

	@Override
	public Set<String> getSetByBrands() throws Exception {
		Set<String> brands = new HashSet<String>();
		for (Device dispositiu : devices) {
			brands.add(dispositiu.getBrand());
		}
		return brands;
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
