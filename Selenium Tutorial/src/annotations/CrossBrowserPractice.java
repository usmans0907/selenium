package annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserPractice {
	
	WebDriver driver;
	
	@Test
	@Parameters("crossbrowser")
	public void testing(String browserName) throws InterruptedException {
		
		if(browserName.equalsIgnoreCase("chrome")) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Usman\\\\eclipse-workspace\\\\Drivers\\\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\Usman\\\\eclipse-workspace\\\\Drivers\\\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.quit();
		
	
	}

}
