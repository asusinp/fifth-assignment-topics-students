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
		// TODO Auto-generated method stub
		if (devices != null) {
			Map<DeviceType, List<Device>> map = new HashMap<>();
			List<Device> device = new ArrayList<>(devices);
			List<Device> smarthoneDevice = new ArrayList<>();
			List<Device> smartwearDevice = new ArrayList<>();
			List<Device> laptopDevice = new ArrayList<>();
			List<Device> desktopDevice = new ArrayList<>();
			
			for (Device device2 : device) {
				DeviceType type = device2.getType();
				
				switch (type) {
				case SMARTPHONE:
					smarthoneDevice.add(device2);
					break;
				case SMARTWEAR:
					smartwearDevice.add(device2);
					break;
				case DESKTOP:
					desktopDevice.add(device2);
					break;
				case LAPTOP:
					laptopDevice.add(device2);
					break;
				default:
					break;
				}			
			}
			
			map.put(DeviceType.SMARTPHONE, smarthoneDevice);
			map.put(DeviceType.SMARTWEAR, smartwearDevice);
			map.put(DeviceType.DESKTOP, desktopDevice);
			map.put(DeviceType.LAPTOP, laptopDevice);	
			//System.out.println(map.size());
			return map;
			
		} else {
			throw new Exception("File diveces is empty or not exist");
		}	
	}

	@Override
	public Map<String, List<Device>> getMapByBrand() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getSetByBrands() throws Exception {
		// TODO Auto-generated method stub
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
	
	
	
	

}
