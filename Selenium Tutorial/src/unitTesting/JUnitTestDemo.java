package unitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTestDemo {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This is Before Method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is After Method");
	}

	@Test
	public void test() {
		System.out.println("This is Test Case 0");
	}
	@Test
	public void test1() {
		System.out.println("This is Test Case 1");
	}
	@Test
	public void test2() {
		System.out.println("This is Test Case 2");
	}
	@Test
	public void test3() {
		System.out.println("This is Test Case 3");
	}

}
