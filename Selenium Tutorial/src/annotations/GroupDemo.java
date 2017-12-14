package annotations;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupDemo {

	@BeforeMethod
	public void beforMethod() {
		System.out.println("Before Method");
	}
	@Test(groups = {"CAT"})
	public void animalTest() {
		System.out.println("Animal 1 = CAT");
	}
	@Test (groups = {"DOG"})
	public void animalTest2() {
		System.out.println("Animal 2 = DOG");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
}
