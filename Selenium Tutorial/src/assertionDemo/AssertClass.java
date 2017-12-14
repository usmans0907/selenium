package assertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertClass {
	
	@Test
	public void hardAssert() {
		
		//It will fails the test and does not executes the further commands....
		System.out.println("Hard test started");
		Assert.assertEquals(10, 20);
		System.out.println("Hard test completed");
		
	}
	
	@Test
	public void softAssert() {
		
		//It will fails the test but executes the further commands as well....
		SoftAssert assertion = new SoftAssert();
		System.out.println("Soft test started");
		assertion.assertEquals(10, 20);
		System.out.println("Soft test completed");
		assertion.assertAll();
	}

}
