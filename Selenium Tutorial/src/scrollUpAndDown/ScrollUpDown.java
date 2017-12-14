package scrollUpAndDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollUpDown {
	
	WebDriver driver;
	
	@BeforeMethod
	public void url() throws Exception {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	
	}
	
	@Test
	public void scrollTest() throws Exception {
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("scroll(0,200)");
		Thread.sleep(1000);
		js.executeScript("scroll(0,-200)");
		Thread.sleep(1000);
		js.executeScript("scroll(0,200)");
		Thread.sleep(1000);
		js.executeScript("scroll(0,-200)");
		Thread.sleep(1000);
		js.executeScript("scroll(0,200)");
		Thread.sleep(1000);
		js.executeScript("scroll(0,-200)");
		Thread.sleep(1000);
		js.executeScript("scroll(0,200)");
		Thread.sleep(1000);
		js.executeScript("scroll(0,-200)");
		
		
		//This is the method to scroll inside view if their is anyscrool view present on web page.....
		//js.executeScript("arguments[0].scrollIntoView(true);", element);
		//Here the 'element' contains the exect xpath of desired element  inside the view... 
	}
	
	@AfterMethod
	public void afterMethod() throws Exception {
		
		Thread.sleep(2000);
		driver.quit();
	}

}
