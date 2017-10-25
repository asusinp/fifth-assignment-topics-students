/**
 * A concrete device's manager implementation to work collection out in depth
 */
package org.escoladeltreball.fifthassignment;

import java.util.ArrayList;
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
	}

	@Override
	public Map<DeviceType, List<Device>> getMapByType() throws Exception {
		Map<DeviceType, List<Device>> map = new HashMap<>();
		List<Device> smartphoneDevices = new ArrayList<>();
		List<Device> smartwearDevices = new ArrayList<>();
		List<Device> laptopDevices = new ArrayList<>();
		List<Device> desktopDevices = new ArrayList<>();
		
		for ( int i = 0; i < devices.size(); i++ ) {
			System.out.println(devices.get(i));
			DeviceType type = devices.get(i).getType();
			switch(type) {
			case SMARTPHONE:
				smartphoneDevices.add(devices.get(i));
				break;
			case SMARTWEAR:
				smartwearDevices.add(devices.get(i));
				break;
			case LAPTOP:
				laptopDevices.add(devices.get(i));
				break;
			case DESKTOP:
				desktopDevices.add(devices.get(i));
				break;
			}
		}
		
		map.put(DeviceType.SMARTPHONE, smartphoneDevices);
		map.put(DeviceType.SMARTWEAR, smartwearDevices);
		map.put(DeviceType.LAPTOP, laptopDevices);
		map.put(DeviceType.DESKTOP, desktopDevices);
		return map;
	}

	@Override
	public Map<String, List<Device>> getMapByBrand() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getSetByBrands() throws Exception {
		
		return null;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("DeviceManagerImpl [devices=%s]", devices);
	}
	
	

}
