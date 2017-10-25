/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author iaw46490689
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
	 * Test method for
	 * {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getMapByType()}.
	 * @throws Exception 
	 */
	@Test
	public final void testGetMapByType() throws Exception {
		List<Device> smartwears = manager.getMapByType().get(DeviceType.smartwear);
		List<Device> laptops = manager.getMapByType().get(DeviceType.laptop);
		List<Device> smartphones = manager.getMapByType().get(DeviceType.smartphone);
		List<Device> desktops = manager.getMapByType().get(DeviceType.desktop);
		assertEquals(2, smartwears.size());
		assertEquals(3, laptops.size());
		assertEquals(3, smartphones.size());
		assertEquals(2, desktops.size());
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getMapByBrand()}.
	 */
	@Ignore
	@Test
	public final void testGetMapByBrand() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getSetByBrands()}.
	 */
	@Ignore
	@Test
	public final void testGetSetByBrands() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getSortedList(java.util.Comparator)}.
	 */
	@Ignore
	@Test
	public final void testGetSortedList() {
		fail("Not yet implemented"); // TODO
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
