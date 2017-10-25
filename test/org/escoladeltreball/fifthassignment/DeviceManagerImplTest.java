/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw46994355
 *
 */
public class DeviceManagerImplTest {
	
	DeviceManagerImpl manager;

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
		manager = new DeviceManagerImpl("devices");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		manager = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getMapByType()}.
	 */
	@Test
	public void testGetMapByType() {
		Map<DeviceType, List<Device>> map = new HashMap<>();
		Device dev1 = new Device(345341, DeviceType.SMARTWEAR, "samsung", "pulsar", 3234.5);
		Device dev2 = new Device(102212, DeviceType.SMARTWEAR, "apple", "apple watch ii", 599.43);
		map.put
	}

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getMapByBrand()}.
	 */
	@Test
	public void testGetMapByBrand() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getSetByBrands()}.
	 */
	@Test
	public void testGetSetByBrands() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getSortedList(java.util.Comparator)}.
	 */
	@Test
	public void testGetSortedList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#findCheapestDeviceOfEachType()}.
	 */
	@Test
	public void testFindCheapestDeviceOfEachType() {
		fail("Not yet implemented"); // TODO
	}

}
