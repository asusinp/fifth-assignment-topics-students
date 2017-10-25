/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author iaw21752927
 *
 */
public class DeviceManagerImplTest {
	
	private DeviceManagerImpl testClass;

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
		testClass = new DeviceManagerImpl("devices");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		testClass = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getMapByType()}.
	 * @throws Exception 
	 */
	
	@Test
	public void testGetMapByType() throws Exception {
		Map<DeviceType, List<Device>> map = testClass.getMapByType();
		assertEquals(3, map.get(DeviceType.smartphone).size());
	}

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getMapByBrand()}.
	 * @throws Exception 
	 */
	
	@Test
	public void testGetMapByBrand() throws Exception {
		Map<String, List<Device>> map = testClass.getMapByBrand();
		assertEquals(3, map.get("samsung").size());
	}

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getSetByBrands()}.
	 */
	@Ignore
	@Test
	public void testGetSetByBrands() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getSortedList(java.util.Comparator)}.
	 */
	@Ignore
	@Test
	public void testGetSortedList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#findCheapestDeviceOfEachType()}.
	 */
	@Ignore
	@Test
	public void testFindCheapestDeviceOfEachType() {
		fail("Not yet implemented");
	}

}
