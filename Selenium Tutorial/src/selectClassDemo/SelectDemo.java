package selectClassDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDemo {
	
	static WebDriver driver;
	static WebElement element;

	
	@Test
	public void selectDropdown() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		element = driver.findElement(By.id("month"));
		element.click();
		
		Select s1 = new Select(element);
		s1.selectByVisibleText("May");
		
		/*List<WebElement> element = s1.getOptions();
		
		for(WebElement i:element) {
			
			String value = i.getText();
			
			if(value.contains("May")) {
			
				
			System.out.println("Selected month is : " + value);
			break;
			
			}
		}*/
		Thread.sleep(2000);
		driver.quit();
	}

}
