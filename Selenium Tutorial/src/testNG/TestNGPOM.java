package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPOM {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void myBeforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		
		
	}
	
	@Test()
	public void login( ){
		
		TestNGDemo obj = new TestNGDemo();
		obj.firstName(driver);
		obj.lastName(driver);
		obj.mobileNumber(driver);
		obj.password(driver);
		
		Select select1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		Select select2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		Select select3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		
		select1.selectByVisibleText("Jan");
		select2.selectByVisibleText("3");
		select3.selectByVisibleText("2000");
		
		driver.findElement(By.xpath(".//*[@id='u_0_7']")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_10']")).click();

		
	}

	
	@AfterMethod
	
	public void myAfterMethod() {
	
	}
	

}
