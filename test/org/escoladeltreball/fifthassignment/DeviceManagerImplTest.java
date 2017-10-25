/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testGetMapByType() throws Exception {
		assertEquals(2, manager.getMapByType().get(DeviceType.smartwear).size());
		assertEquals(3, manager.getMapByType().get(DeviceType.laptop).size());
		assertEquals(3, manager.getMapByType().get(DeviceType.smartphone).size());
		assertEquals(2, manager.getMapByType().get(DeviceType.desktop).size());
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getMapByBrand()}.
	 * @throws Exception 
	 */
	@Test
	public final void testGetMapByBrand() throws Exception {
		assertEquals(3, manager.getMapByBrand().get("samsung").size());
		assertEquals(3, manager.getMapByBrand().get("apple").size());
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getSetByBrands()}.
	 * @throws Exception 
	 */
	@Test
	public final void testGetSetByBrands() throws Exception {	
		assertEquals(6, manager.getSetByBrands().size());
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getSortedList(java.util.Comparator)}.
	 * @throws Exception 
	 */
	@Test
	public final void testGetSortedList() throws Exception {
		assertEquals(234.5, manager.getSortedList(new DevicePriceComparator()).get(0).getPrice(), 1e-4);
		assertEquals(DeviceType.smartphone, manager.getSortedList(new DeviceTypeComparator()).get(0).getDeviceType());
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#findCheapestDeviceOfEachType()}.
	 * @throws Exception 
	 */
	@Test
	public final void testFindCheapestDeviceOfEachType() throws Exception {
		assertEquals(234.5, manager.findCheapestDeviceOfEachType().get(DeviceType.smartwear).getPrice(), 1e-4);
		assertEquals(833.93, manager.findCheapestDeviceOfEachType().get(DeviceType.smartphone).getPrice(), 1e-4);
		assertEquals(2332.22, manager.findCheapestDeviceOfEachType().get(DeviceType.desktop).getPrice(), 1e-4);
		assertEquals(988.12, manager.findCheapestDeviceOfEachType().get(DeviceType.laptop).getPrice(), 1e-4);
	}

}
