package unitTesting;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeLoginPractice {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(3000);
		//For maximizing the window and wait for 10 seconds....
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}

	@Test
	public void test1() throws InterruptedException {
		
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Usman Shabbir");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).clear();
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath(".//*[@id='btnLogin']")).getText());
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		
	}
	
	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
	/*@Test
	public void test2() throws InterruptedException {
		
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		
	}*/

}
