package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestNGDemo {
	
	public WebElement element = null;
	//public Select select = null;
	
	public WebElement firstName(WebDriver driver) {
		element=driver.findElement(By.name("firstname"));
		element.sendKeys("Usman");
		return element;
	}
	
	public WebElement lastName(WebDriver driver) {
		element=driver.findElement(By.name("lastname"));
		element.sendKeys("Shabbir");
		return element;
	}
	
	public WebElement mobileNumber(WebDriver driver) {
		element=driver.findElement(By.name("reg_email__"));
		element.sendKeys("6304405902");
		return element;
	}
	
	public WebElement password(WebDriver driver) {
		element=driver.findElement(By.name("reg_passwd__"));
		element.sendKeys("imran123");
		return element;
	
	}
	
	/*public Select month(WebDriver driver) {
		
		select=(Select) driver.findElement(By.xpath(".//*[@id='month']"));
		select.selectByVisibleText("Oct");
		return select;
	}
	public Select day(WebDriver driver) {
		
		select=(Select) driver.findElement(By.xpath(".//*[@id='day']"));
		select.selectByVisibleText("3");
		return select;
	}
	public Select year(WebDriver driver) {
		
		select=(Select) driver.findElement(By.xpath(".//*[@id='year']"));
		select.selectByVisibleText("1984");
		return select;
	}*/
	
}

