package pageObjectModel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import loginPage.LoginPageDemo;

public class JUnitPOM {
	
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
		
		Thread.sleep(3000);
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		LoginPageDemo.username(driver);
		
		LoginPageDemo.username(driver).clear();
		
		LoginPageDemo.username(driver);
		
		LoginPageDemo.password(driver);
		
		LoginPageDemo.loginButton(driver);
	
		LoginPageDemo.navBack(driver);
		
		LoginPageDemo.navForward(driver);
		
	}

}
