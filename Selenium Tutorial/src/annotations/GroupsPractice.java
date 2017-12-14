package annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupsPractice {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before Method");
	}
	
	@Test(groups = {"philips"})
	public void group1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://dev-lifeline.philipshomemonitoring.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	@Test(groups = {"facebook"})
	public void group2() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
		}
	
	@Test(groups = {"gmail"})
	public void group3() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
		}
	
	@Test(groups = {"yahoo"})
	public void group4() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("After Method");
	}

}
