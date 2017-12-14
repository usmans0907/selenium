package highlightElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Library.HighlightElement;

public class HighlightDummyClass {
	
	WebDriver driver;
	WebElement element;
	
	@Test
	public void testMethod() throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
	
	element = driver.findElement(By.id("email"));
	HighlightElement.highlightMethod(driver, element);
	element.sendKeys("ssgill302@yahoo.com");
	element = driver.findElement(By.id("pass"));
	HighlightElement.highlightMethod(driver, element);
	element.sendKeys("6304405902");
	element = driver.findElement(By.id("loginbutton"));
	HighlightElement.highlightMethod(driver, element);
	element.click();
	
	
	}
}
