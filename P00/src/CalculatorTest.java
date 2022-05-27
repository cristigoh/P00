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
 * 21029424, 27 May 2022 12:44:44 pm
 */

public class CalculatorTest {

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
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSub() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 3087;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMul() {
		//fail("Not yet implemented");
		int a = 4;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 8;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDiv() {
		//fail("Not yet implemented");
		int a = 9;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 3;
		assertEquals(expected, actual);
	}

}
