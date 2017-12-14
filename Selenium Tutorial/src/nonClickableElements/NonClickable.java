package nonClickableElements;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Library.NonClickableElement;

public class NonClickable {
	
	WebDriver driver;
	
	@Test
	public void method() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		NonClickableElement.clickById(driver, "persistent");
		
	}

}
