package assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class SwitchingTabs {
	
	WebDriver driver;
	WebElement element;
	String innerhtml;
	
	public void webPage() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println("The Current URL is .... \n" + driver.getCurrentUrl());
	}
	
	public void login() {
		
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
	}
	
	public Actions adminTab() throws InterruptedException {	
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='menu_admin_viewAdminModule']"));
		WebElement userManagement = driver.findElement(By.xpath(".//*[@id='menu_admin_UserManagement']"));
		WebElement job = driver.findElement(By.xpath(".//*[@id='menu_admin_Job']"));
		WebElement organization = driver.findElement(By.xpath(".//*[@id='menu_admin_Organization']"));
		WebElement qualification = driver.findElement(By.xpath(".//*[@id='menu_admin_Qualifications']"));
		WebElement nationalities = driver.findElement(By.xpath(".//*[@id='menu_admin_nationality']"));
		WebElement configuration = driver.findElement(By.xpath(".//*[@id='menu_admin_Configuration']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		action.moveToElement(element).moveToElement(userManagement).perform();
		Thread.sleep(1000);
		
		System.out.println("\n....Tags in User Management.... ");
		System.out.println(driver.findElement(By.xpath(".//*[@id='menu_admin_viewSystemUsers']")).getText());
		Thread.sleep(1000);
		
		action.moveToElement(element).moveToElement(job).perform();
		Thread.sleep(1000);
		
		List<WebElement> jobWrapperClass= driver.findElements(By.xpath(".//*[@id='wrapper']/div[2]/ul/li[1]/ul/li[2]/ul"));
		
		
		for(WebElement ele:jobWrapperClass) {
			
			innerhtml = ele.getText();
			System.out.println("\n....Tags in Job.... ");
			System.out.println(innerhtml);
		}
		
		
		action.moveToElement(element).moveToElement(organization).perform();
		Thread.sleep(1000);
		
		List<WebElement> organizationWrapperClass= driver.findElements(By.xpath(".//*[@id='wrapper']/div[2]/ul/li[1]/ul/li[3]/ul"));
		
		for(WebElement ele:organizationWrapperClass) {
			
			innerhtml = ele.getText();
			System.out.println("\n....Tags in Organization.... ");
			System.out.println(innerhtml);
		}
		
		action.moveToElement(element).moveToElement(qualification).perform();
		Thread.sleep(1000);
		
		List<WebElement> qualificationWrapperClass= driver.findElements(By.xpath(".//*[@id='wrapper']/div[2]/ul/li[1]/ul/li[4]/ul"));
		
		for(WebElement ele:qualificationWrapperClass) {
			
			innerhtml = ele.getText();
			System.out.println("\n....Tags in Qualification.... ");
			System.out.println(innerhtml);
		}
		
		action.moveToElement(element).moveToElement(nationalities).perform();
		Thread.sleep(1000);
		

		action.moveToElement(element).moveToElement(configuration).perform();
		Thread.sleep(1000);
		
		List<WebElement> configurationWrapperClass= driver.findElements(By.xpath(".//*[@id='wrapper']/div[2]/ul/li[1]/ul/li[6]/ul"));
		
		for(WebElement ele:configurationWrapperClass) {
			
			innerhtml = ele.getText();
			System.out.println("\n....Tags in Configuration.... ");
			System.out.println(innerhtml);
		}
		
		
		return action;
	}
	
	public Actions pimTab() throws InterruptedException {	
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']"));
		WebElement pimConfigure = driver.findElement(By.xpath(".//*[@id='menu_pim_Configuration']"));
		WebElement pimEmployeeList = driver.findElement(By.xpath(".//*[@id='menu_pim_viewEmployeeList']"));
		WebElement pimAddEmployees = driver.findElement(By.xpath(".//*[@id='menu_pim_addEmployee']"));
		WebElement pimReports = driver.findElement(By.xpath(".//*[@id='menu_core_viewDefinedPredefinedReports']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		action.moveToElement(element).moveToElement(pimConfigure).perform();
		Thread.sleep(1000);
		
		List<WebElement> pimConfigureWrapperClass = driver.findElements(By.xpath(".//*[@id='wrapper']/div[2]/ul/li[2]/ul/li[1]/ul"));
		for(WebElement ele:pimConfigureWrapperClass) {
			
			innerhtml = ele.getText();
			System.out.println("\n....Tags in PIM Configuration.... ");
			System.out.println(innerhtml);
		}
		
		action.moveToElement(element).moveToElement(pimEmployeeList).perform();
		Thread.sleep(1000);
		action.moveToElement(element).moveToElement(pimAddEmployees).perform();
		Thread.sleep(1000);
		action.moveToElement(element).moveToElement(pimReports).perform();
		Thread.sleep(1000);
		return action;
	}
	
	public Actions leaveTab() throws InterruptedException {	
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='menu_leave_viewLeaveModule']"));
		WebElement leaveEntitlements = driver.findElement(By.xpath(".//*[@id='menu_leave_Entitlements']"));
		WebElement leaveReports = driver.findElement(By.xpath(".//*[@id='menu_leave_Reports']"));
		WebElement leaveConfigure = driver.findElement(By.xpath(".//*[@id='menu_leave_Configure']"));
		WebElement leaveList = driver.findElement(By.xpath(".//*[@id='menu_leave_viewLeaveList']"));
		WebElement leaveAssign = driver.findElement(By.xpath(".//*[@id='menu_leave_assignLeave']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		
		action.moveToElement(element).moveToElement(leaveEntitlements).perform();
		Thread.sleep(1000);
		
		List<WebElement> leaveEntitlementWrapperClass = driver.findElements(By.xpath(".//*[@id='wrapper']/div[2]/ul/li[3]/ul/li[1]/ul"));
		
		for(WebElement ele:leaveEntitlementWrapperClass) {
			
			innerhtml = ele.getText();
			System.out.println("\n....Tags in Leave Entitlement.... ");
			System.out.println(innerhtml);
			
		}
		
		action.moveToElement(element).moveToElement(leaveReports).perform();
		Thread.sleep(1000);
		
		List<WebElement> leaveReportsWrapperClass = driver.findElements(By.xpath(".//*[@id='wrapper']/div[2]/ul/li[3]/ul/li[2]/ul"));
		
		for(WebElement ele:leaveReportsWrapperClass) {
			
			innerhtml = ele.getText();
			System.out.println("\n....Tags in Leave Reports.... ");
			System.out.println(innerhtml);
			
		}
		
		
		action.moveToElement(element).moveToElement(leaveConfigure).perform();
		Thread.sleep(1000);
		
		List<WebElement> leaveConfigureWrapperClass = driver.findElements(By.xpath(".//*[@id='wrapper']/div[2]/ul/li[3]/ul/li[3]/ul"));
		
		for(WebElement ele:leaveConfigureWrapperClass) {
			
			innerhtml = ele.getText();
			System.out.println("\n....Tags in Leave Configure.... ");
			System.out.println(innerhtml);
		}
		
		
		action.moveToElement(element).moveToElement(leaveList).perform();
		Thread.sleep(1000);
		action.moveToElement(element).moveToElement(leaveAssign).perform();
		Thread.sleep(1000);
		
		return action;
	}
	
	public Actions timeTab() throws InterruptedException {	
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='menu_time_viewTimeModule']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		return action;
	}
	
	public Actions recruitmentTab() throws InterruptedException {	
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='menu_recruitment_viewRecruitmentModule']"));
		WebElement recruitmentTime = driver.findElement(By.xpath(".//*[@id='menu_recruitment_viewCandidates']"));
		WebElement recruitmentVacancies = driver.findElement(By.xpath(".//*[@id='menu_recruitment_viewJobVacancy']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		action.moveToElement(element).moveToElement(recruitmentTime).perform();
		Thread.sleep(1000);
		action.moveToElement(element).moveToElement(recruitmentVacancies).perform();
		Thread.sleep(1000);
		return action;
	}
	
	public Actions performanceTab() throws InterruptedException {	
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='menu__Performance']"));
		WebElement performanceConfigure = driver.findElement(By.xpath(".//*[@id='menu_performance_Configure']"));
		WebElement performanceManageReviews = driver.findElement(By.xpath(".//*[@id='menu_performance_ManageReviews']"));
		WebElement performanceEmployeeTrackers = driver.findElement(By.xpath(".//*[@id='menu_performance_viewEmployeePerformanceTrackerList']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		action.moveToElement(element).moveToElement(performanceConfigure).perform();
		Thread.sleep(1000);
		
		List<WebElement> performanceConfigureWrapperClass = driver.findElements(By.xpath(".//*[@id='wrapper']/div[2]/ul/li[6]/ul/li[1]/ul"));
		
		for(WebElement ele:performanceConfigureWrapperClass) {
			
			innerhtml = ele.getText();
			System.out.println("\n....Tags in Performance Configure.... ");
			System.out.println(innerhtml);
		}
		
		action.moveToElement(element).moveToElement(performanceManageReviews).perform();
		Thread.sleep(1000);
		
		List<WebElement> performanceManageReviewsWrapperClass = driver.findElements(By.xpath(".//*[@id='wrapper']/div[2]/ul/li[6]/ul/li[2]/ul"));
		
		for(WebElement ele:performanceManageReviewsWrapperClass) {
			
			innerhtml = ele.getText();
			System.out.println("\n....Tags in Performance Manage.... ");
			System.out.println(innerhtml);
		}
		
		action.moveToElement(element).moveToElement(performanceEmployeeTrackers).perform();
		Thread.sleep(1000);
		
		return action;
	}
	
	
	public Actions dashboardTab() {	
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='menu_dashboard_index']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		return action;
	}
	public Actions directoryTab() {	
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='menu_directory_viewDirectory']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		return action;
	}
	
	public void dropDown() throws InterruptedException {
		
		driver.findElement(By.xpath(".//*[@id='welcome']")).click();
		element=driver.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[2]/a"));
		Thread.sleep(2000);
		element.click();
	}	
	
	public void createUser() throws InterruptedException {
		
		driver.findElement(By.xpath(".//*[@id='menu_admin_viewAdminModule']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='btnAdd']")).click();
		Thread.sleep(1000);
		
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='systemUser_userType']"));
		element1.click();
		Select select1 = new Select(element1);
		select1.selectByVisibleText("Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='systemUser_employeeName_empName']")).sendKeys("Usman Shabbir");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='systemUser_userName']")).sendKeys("usmans0907");
		Thread.sleep(1000);
		WebElement element2 = driver.findElement(By.xpath(".//*[@id='systemUser_status']"));
		element2.click();
		Select select2 = new Select(element2);
		select2.selectByVisibleText("Disabled");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='systemUser_password']")).sendKeys("6304405902");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='systemUser_confirmPassword']")).sendKeys("6304405902");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='btnSave']")).click();
	}
	
	public void closeWindow() {
		
		driver.quit();
	}

}
