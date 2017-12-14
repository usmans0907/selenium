package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
	@BeforeSuite
	public void beforeSuitMethod() {
	System.out.println("This is Before Suite");
	}
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("This is Before Test");
	}
	
	
	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("This is Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method");
	}
	
	@Test
	public void test() {
		System.out.println("This is Test1 method");
	}
	
	@Test
	public void test2() {
		System.out.println("This is Test2 method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is After Class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is After Suite");
	}

}
