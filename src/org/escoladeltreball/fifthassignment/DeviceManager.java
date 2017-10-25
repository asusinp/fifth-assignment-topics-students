/**
 * An abstract device's manager
 */
package org.escoladeltreball.fifthassignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author pep
 *
 */
public abstract class DeviceManager {

	protected List<Device> devices;

	/**
	 * This constructors load a list of devices from a file
	 * 
	 * @param fileName
	 * @throws Exception
	 */
	public DeviceManager(final String fileName) throws Exception {
		if (fileName != null) {
			devices = new LinkedList<Device>();
			setup(fileName);
		} else {
			throw new Exception("File is unreached");
		}
	}

	/**
	 * This method returns a Map of a list of devices associated with a device type
	 * 
	 * @return Map of a list of devices associated with a device type
	 * @throws Exception
	 *             When devices is null
	 */
	public abstract Map<DeviceType, List<Device>> getMapByType() throws Exception;

	/**
	 * This method returns a Map of a list of devices associated with a device brand
	 * 
	 * @return Map of a list of devices associated with a device brand
	 * @throws Exception
	 *             When devices is null
	 */
	public abstract Map<String, List<Device>> getMapByBrand() throws Exception;

	/**
	 * This method returns a set of brands
	 * 
	 * @return A set of brands
	 * @throws Exception
	 *             When devices is null
	 */
	public abstract Set<String> getSetByBrands() throws Exception;

	/**
	 * This method returns a sorted list of devices according to a comparator
	 * 
	 * @param comparator
	 *            The sorting field
	 * @return A sorted list of devices according to a comparator
	 * @throws Exception
	 *             When devices null
	 */
	public abstract List<Device> getSortedList(Comparator<Device> comparator) throws Exception;

	/**
	 * This method returns the cheapest device of every type in a map
	 * 
	 * @return The cheapest device of every type in a map
	 * @throws Exception
	 *             When devices is null
	 */
	public abstract Map<DeviceType, Device> findCheapestDeviceOfEachType() throws Exception;

	/**
	 * this method setup the file for read all lines
	 * @param devicesFile
	 * @throws IOException
	 */
	private void setup(String devicesFile) throws IOException {
		Path path = Paths.get(devicesFile);
		List<String> devicesList = Files.readAllLines(path);
		for (String device : devicesList) {
			String[] fields = device.split(",");
			long code = Long.parseLong(fields[0]);
			DeviceType deviceType = DeviceType.valueOf(fields[1]);
			String brand = fields[2];
			String model = fields[3];
			double price = Double.parseDouble(fields[4]);
			devices.add(new Device(code, deviceType, brand, model, price));
		}
	}

}
