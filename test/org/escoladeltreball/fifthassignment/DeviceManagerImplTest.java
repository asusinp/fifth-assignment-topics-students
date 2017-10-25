/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author iaw26068632
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
	 * Test method for
	 * {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getMapByType()}.
	 * @throws Exception 
	 */
//	@Ignore
	@Test
	public final void testGetMapByType() throws Exception {		
		assertEquals(4, dev.getMapByType().size());
	}
	

	/**
	 * Test method for
	 * {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getMapByBrand()}.
	 * 
	 * @throws Exception
	 */
	@Ignore
	@Test
	public final void testGetMapByBrand() throws Exception { // Collection Hierachy
		List<Device> devicesSmartphone = null;
		List<Device> devicesLabtop = null;
		List<Device> devicesDesktop = null;
		List<Device> devicesSmartWear = null;

		for (Device device : dev.getDevices()) {

		}

	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getSetByBrands()}.
	 * 
	 * @throws Exception
	 */
	// @Ignore
	@Test
	public final void testGetSetByBrands() throws Exception {
		Set<String> brands = new HashSet<>();
		for (Device device : dev.getDevices()) {
			brands.add(device.getBrand());
		}
		assertEquals(brands, dev.getSetByBrands());
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getSortedList(java.util.Comparator)}.
	 */
	@Ignore
	@Test
	public final void testGetSortedList() {
		// List<double> prices = new ArrayList<>();
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#findCheapestDeviceOfEachType()}.
	 */
	@Ignore
	@Test
	public final void testFindCheapestDeviceOfEachType() {
		fail("Not yet implemented"); // TODO
	}

}
