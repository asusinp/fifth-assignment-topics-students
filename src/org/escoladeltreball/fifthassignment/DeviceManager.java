/**
 * An abstract device's manager
 */
package org.escoladeltreball.fifthassignment;

import java.nio.file.Files;
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
public abstract class DeviceManager {

	protected List<Device> devices;
	
	/**
	 * This constructors load a list of devices from a file
	 * 
	 * @param fileName
	 * @throws Exception
	 */
	public DeviceManager(final String fileName) throws Exception {
		setup(fileName);
	}
	
	private void setup(String devicesFile) throws Exception {
		//First of all, read all the lines of the file
		List<String> records = Files.readAllLines(Paths.get(devicesFile));
		//We're creating a list
		this.devices = new ArrayList<>();
		for (String record : records) {
			//Separating the file by ","
			String[] fields = record.split(",");
			//Save the id
			long id = Long.parseLong(fields[0]);
			DeviceType type = DeviceType.valueOf(fields[1]); 
			//create a device with the data on the file
			Device device = new Device(id, type, fields[2], fields[3], Double.parseDouble(fields[4]));
			//add the device to the list
			devices.add(device);
		}
	}

	/**
	 * This method returns a Map of a list of devices associated with a device
	 * type
	 * 
	 * @return Map of a list of devices associated with a device type
	 * @throws Exception When devices is null
	 */
	public abstract Map<DeviceType, List<Device>> getMapByType() throws Exception;

	/**
	 * This method returns a Map of a list of devices associated with a device
	 * brand
	 * 
	 * @return Map of a list of devices associated with a device brand
	 * @throws Exception When devices is null
	 */
	public abstract Map<String, List<Device>> getMapByBrand() throws Exception;

	/**
	 * This method returns a set of brands
	 * 
	 * @return A set of brands
	 * @throws Exception When devices is null
	 */
	public abstract Set<String> getSetByBrands() throws Exception;

	/**
	 * This method returns a sorted list of devices according to a comparator
	 * 
	 * @param comparator The sorting field
	 * @return A sorted list of devices according to a comparator
	 * @throws Exception When devices null
	 */
	public abstract List<Device> getSortedList(Comparator<Device> comparator) throws Exception;

	/**
	 * This method returns the cheapest device of every type in a map
	 * 
	 * @return The cheapest device of every type in a map
	 * @throws Exception When devices is null
	 */
	public abstract Map<DeviceType, Device> findCheapestDeviceOfEachType() throws Exception;

	/**
	 * @return the devices
	 */
	public List<Device> getDevices() {
		return devices;
	}

	/**
	 * @param devices the devices to set
	 */
	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

}
