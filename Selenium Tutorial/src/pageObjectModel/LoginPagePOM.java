package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import loginPage.LoginPageDemo;

public class LoginPagePOM {
	
	static WebDriver driver;
	
	public static void main (String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		LoginPageDemo.username(driver);
		Thread.sleep(2000);
		LoginPageDemo.username(driver).clear();
		Thread.sleep(2000);
		LoginPageDemo.username(driver);
		Thread.sleep(2000);
		LoginPageDemo.password(driver);
		Thread.sleep(2000);
		LoginPageDemo.loginButton(driver);
	}

}
