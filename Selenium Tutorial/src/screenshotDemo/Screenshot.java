package screenshotDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	
	WebDriver driver;
	
	@Test
	public void screenshot() throws Exception  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Usman\\\\eclipse-workspace\\\\Drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://ww.facebook.com");
		driver.manage().window().maximize();
		Function.screenshot(driver, "BeforeUsername");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("ssgill302@yahoo.com");
		Function.screenshot(driver, "AfterUsername");
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	

}
