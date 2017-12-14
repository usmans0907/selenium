package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrorMessage {
	
	@Test
	public void testErrorMessage() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
		//Through getText()............................................................
		
		/*String actual = driver.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getText();
		String expected = "Enter an email or phone number";
		Assert.assertEquals(actual, expected,"Errors does not matched");
		System.out.println("Errors Matched");*/
		
		//Through getAttribute().......................................................
		
		String actual = driver.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getAttribute("innerHTML");
		String expected = "Enter an email or phone number";
		
		//Method 1
		Assert.assertEquals(actual, expected,"Errors does not matched");
		System.out.println("Errors Matched");
		
		//Method 2
		Assert.assertTrue(actual.contains("Enter email"),"Does not matched");
		System.out.println("Matched Successfully");
		
	}

}
