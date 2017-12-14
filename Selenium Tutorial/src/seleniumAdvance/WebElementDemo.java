package seleniumAdvance;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		
	}

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(2000);
		driver.quit();
		
	}

	@Test
	public void test() throws InterruptedException {
		
		WebElement e1 = driver.findElement(By.xpath(".//*[@id='txtUsername']"));
		WebElement e2 = driver.findElement(By.xpath(".//*[@id='txtPassword']"));
		WebElement e3 = driver.findElement(By.xpath(".//*[@id='btnLogin']"));
		
		e1.sendKeys("Usman Shabbir");
		Thread.sleep(2000);
		e1.clear();
		Thread.sleep(2000);
		e1.sendKeys("Admin");
		Thread.sleep(2000);
		
		e2.sendKeys("123456789");
		Thread.sleep(2000);
		e2.clear();
		Thread.sleep(2000);
		e2.sendKeys("admin");
		Thread.sleep(2000);
		
		e3.click();

	}

}
