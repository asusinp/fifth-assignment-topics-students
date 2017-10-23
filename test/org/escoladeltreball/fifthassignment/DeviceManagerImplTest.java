/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author iaw39442165
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
	@Ignore
	@Test
	public final void testGetMapByType() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getMapByBrand()}.
	 */
	@Ignore
	@Test
	public final void testGetMapByBrand() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#getSetByBrands()}.
	 * @throws Exception 
	 */
	@Test
	public final void testGetSetByBrands() throws Exception {
		assertEquals(6, manager.getSetByBrands().size());
	}

	/**
	 * Test method for {@link org.escoladeltreball.fifthassignment.DeviceManagerImpl#findCheapestDeviceOfEachType()}.
	 */
	@Ignore
	@Test
	public final void testFindCheapestDeviceOfEachType() {
		fail("Not yet implemented"); // TODO
	}

}
