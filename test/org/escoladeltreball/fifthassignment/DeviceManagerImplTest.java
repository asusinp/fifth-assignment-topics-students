/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author iaw26509397
 *
 */
public class DeviceManagerImplTest {
	
	DeviceManagerImpl dev;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		dev = new DeviceManagerImpl("devices");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		dev = null;
	}
	

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getMapByType()}.
	 */
	@Test
	public final void testGetMapByType() throws Exception {
		Map<DeviceType, List<Device>> map = new HashMap<>();
		List<Device> smartphones = new ArrayList<>();
		List<Device> smartwears = new ArrayList<>();
		List<Device> labtops = new ArrayList<>();
		List<Device> desktops = new ArrayList<>();
		Device d1 = new Device(345435L, DeviceType.valueOf("smartphone"), "samsung", "galaxy 8", 901.32D);
		Device d2 = new Device(452344L, DeviceType.valueOf("smartphone"), "apple", "8+", 1023.33D);
		Device d3 = new Device(345341L, DeviceType.valueOf("smartwear"), "samsung", "pulsar", 3234.5D);
		Device d4 = new Device(125433L, DeviceType.valueOf("labtop"), "apple", "macbook air", 1235.54D);
		Device d5 = new Device(943521L, DeviceType.valueOf("labtop"), "samsung", "light plus", 988.12D);
		Device d6 = new Device(211234L, DeviceType.valueOf("labtop"), "acer", "chrome", 1001.21D);
		Device d7 = new Device(943221L, DeviceType.valueOf("smartphone"), "hc", "model1", 833.93D);
		Device d8 = new Device(876669L, DeviceType.valueOf("desktop"), "ibm", "pentium iv", 2332.22D);
		Device d9 = new Device(675453L, DeviceType.valueOf("desktop"), "sun", "modelx", 2982.21D);
		Device d10 = new Device(102212L, DeviceType.valueOf("smartwear"), "apple", "apple watch ii", 599.43D);
		smartphones.add(d1);
		smartphones.add(d2);
		smartphones.add(d7);
		smartwears.add(d3);
		smartwears.add(d10);
		labtops.add(d4);
		labtops.add(d5);
		labtops.add(d6);
		desktops.add(d8);
		desktops.add(d9);
		map.put(DeviceType.valueOf("smartwear"), smartwears);
		map.put(DeviceType.valueOf("desktop"), desktops);		
		map.put(DeviceType.valueOf("labtop"), labtops);
		map.put(DeviceType.valueOf("smartphone"), smartphones);
		
		assertEquals(map, dev.getMapByType());
	}

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getMapByBrand()}.
	 * @throws Exception 
	 */
	@Test
	public final void testGetMapByBrand() throws Exception {
		Map<String, List<Device>> map = new HashMap<>();
		List<Device> samsungs = new ArrayList<>();
		List<Device> apples = new ArrayList<>();
		List<Device> acers = new ArrayList<>();
		List<Device> hcs = new ArrayList<>();
		List<Device> ibms = new ArrayList<>();
		List<Device> suns = new ArrayList<>();
		Device d1 = new Device(345435L, DeviceType.valueOf("smartphone"), "samsung", "galaxy 8", 901.32D);
		Device d2 = new Device(452344L, DeviceType.valueOf("smartphone"), "apple", "8+", 1023.33D);
		Device d3 = new Device(345341L, DeviceType.valueOf("smartwear"), "samsung", "pulsar", 3234.5D);
		Device d4 = new Device(125433L, DeviceType.valueOf("labtop"), "apple", "macbook air", 1235.54D);
		Device d5 = new Device(943521L, DeviceType.valueOf("labtop"), "samsung", "light plus", 988.12D);
		Device d6 = new Device(211234L, DeviceType.valueOf("labtop"), "acer", "chrome", 1001.21D);
		Device d7 = new Device(943221L, DeviceType.valueOf("smartphone"), "hc", "model1", 833.93D);
		Device d8 = new Device(876669L, DeviceType.valueOf("desktop"), "ibm", "pentium iv", 2332.22D);
		Device d9 = new Device(675453L, DeviceType.valueOf("desktop"), "sun", "modelx", 2982.21D);
		Device d10 = new Device(102212L, DeviceType.valueOf("smartwear"), "apple", "apple watch ii", 599.43D);
		samsungs.add(d1);
		apples.add(d2);
		hcs.add(d7);
		samsungs.add(d3);
		apples.add(d4);
		apples.add(d10);
		samsungs.add(d5);
		acers.add(d6);
		ibms.add(d8);
		suns.add(d9);
		map.put("samsung", samsungs);
		map.put("apple", apples);
		map.put("acer", acers);
		map.put("hc", hcs);
		map.put("ibm", ibms);
		map.put("sun", suns);
		
		assertEquals(map, dev.getMapByBrand());
	}

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#findCheapestDeviceOfEachType()}.
	 * @throws Exception 
	 */
	@Test
	public final void testFindCheapestDeviceOfEachType() throws Exception {
		Map<DeviceType, Device> map = new HashMap<>();
		
		Device d1 = new Device(943521L, DeviceType.valueOf("labtop"), "samsung", "light plus", 988.12D);
		Device d2 = new Device(943221L, DeviceType.valueOf("smartphone"), "hc", "model1", 833.93D);
		Device d3 = new Device(876669L, DeviceType.valueOf("desktop"), "ibm", "pentium iv", 2332.22D);
		Device d4 = new Device(102212L, DeviceType.valueOf("smartwear"), "apple", "apple watch ii", 599.43D);
		
		map.put(DeviceType.valueOf("smartphone"), d2);
		map.put(DeviceType.valueOf("smartwear"), d4);
		map.put(DeviceType.valueOf("labtop"), d1);
		map.put(DeviceType.valueOf("desktop"), d3);
		
		assertEquals(map, dev.findCheapestDeviceOfEachType());
	}

}
