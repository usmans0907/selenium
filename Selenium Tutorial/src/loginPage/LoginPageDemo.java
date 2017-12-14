package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageDemo {
	
	public static WebElement element = null;
	
	public static WebElement username (WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='txtUsername']"));
		element.sendKeys("Admin");
		return element;
		
	}
	
	public static WebElement password (WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='txtPassword']"));
		element.sendKeys("admin");
		return element;
		
	}
	
	public static void loginButton (WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='btnLogin']"));
		element.click();
		
	}
	
	
	public static void navBack(WebDriver driver) {
		
		driver.navigate().back();
		
	}
	
	
	public static void navForward(WebDriver driver) {
		
		driver.navigate().forward();
		
	}

}
