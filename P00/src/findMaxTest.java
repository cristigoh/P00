import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21029424, 27 May 2022 3:16:41 pm
 */

public class findMaxTest {

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
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void findMaxTest1() {
		//fail("Not yet implemented");
		int[] arrA = {3,1,4,2};
		assertEquals("test if the biggest integer is 4", 4, hi.findMax(arrA));
	}
	
	@Test
	public final void findMaxTest2() {
		//fail("Not yet implemented");
		int[] arrB = {-11,-3,-1, -2,-4};
		assertEquals("test if the biggest integer is -1", -1, hi.findMax(arrB));
	}

}
