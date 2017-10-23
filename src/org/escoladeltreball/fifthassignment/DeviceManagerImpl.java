/**
 * A concrete device's manager implementation to work collection out in depth
 */
package org.escoladeltreball.fifthassignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

	private void setup(String devicesFile) throws IOException {
		Path path = Paths.get(devicesFile);
		List<String> devices = Files.readAllLines(path);
		for (String device: devices) {
			String[] fields = device.split(",");
			long code = Long.parseLong(fields[0]);
			String deviceType = fields[1];
			String brand = fields[2];
			String model = fields[3];
			double price = Double.parseDouble(fields[4]);
//			devices.add(new Device(code, deviceType, brand, model, price));
		}
	}
}
