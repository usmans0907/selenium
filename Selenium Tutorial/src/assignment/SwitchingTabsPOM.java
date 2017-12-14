package assignment;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchingTabsPOM {
	
	WebDriver driver;
	SwitchingTabs object = new SwitchingTabs();
	
	@BeforeMethod
	public void beforeMethod() {
		
		//Open Web Page
		object.webPage();
		
		//Login Credentials
		object.login();

	}
	
	@Test(groups = {"switching"})
	public void admin() throws InterruptedException {
		
		//Admin Tab
		Thread.sleep(1000);
		object.adminTab();
		
		//PIM Tab
		Thread.sleep(1000);
		object.pimTab();
		
		//Leave Tab
		Thread.sleep(1000);
		object.leaveTab();
		
		//Time Tab
		Thread.sleep(1000);
		object.timeTab();
		
		//Recruitment Tab
		Thread.sleep(1000);
		object.recruitmentTab();
		
		//Performance Tab
		Thread.sleep(1000);
		object.performanceTab();
		
		//Dashboard Tab
		Thread.sleep(1000);
		object.dashboardTab();
		
		//Directory Tab
		Thread.sleep(1000);
		object.directoryTab();
		
		//Welcome Tab & Logout
		Thread.sleep(1000);
		object.dropDown();
		
	}
	@Test(groups = {"newuser"})
	public void userAdd() throws InterruptedException {
		Thread.sleep(1000);
		object.createUser();
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		
		Thread.sleep(2000);
		object.closeWindow();

	}

}
