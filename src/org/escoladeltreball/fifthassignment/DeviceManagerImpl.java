/**
 * A concrete device's manager implementation to work collection out in depth
 */
package org.escoladeltreball.fifthassignment;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
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
		List<String> records = Files.readAllLines(Paths.get(fileName));
		
		devices = new ArrayList<>();
		
		for (String record : records) {
			String[] fields = record.split(",");
			long id = Long.parseLong(fields[0]);
			//Device device = new Device(id, DeviceType.valueOf(fields[2]), fields[3], fields[4], fields[5]);
			//devices.add(device);
			
			
		}
		
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public Map<DeviceType, List<Device>> getMapByType() throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
		return null;
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
