package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CapitalOneDemo {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.capitalone.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.linkText("Credit Cards"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).build().perform();
		
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='personal-nav']/div[1]/div/ul[2]/li[1]/ul/li[2]/div/div[2]/div/ul/li[4]/a"));
		element1.click();
	}

}
