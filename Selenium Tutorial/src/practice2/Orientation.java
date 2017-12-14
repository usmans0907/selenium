package practice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orientation {
	
	WebDriver driver;
	
	@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("jobs");
		driver.findElement(By.xpath(".//*[@id='sbse0']/div[2]")).click();
		driver.findElement(By.xpath("//input[@value='Google Search'][@name='btnK']")).click();
		driver.findElement(By.xpath("//a[@class='q qs'][text()='Maps']")).click();
		driver.findElement(By.xpath("//input[@id='gs_htif50']")).clear();
		driver.findElement(By.xpath("//input[@id='gs_htif50']")).sendKeys("Aurora");
		driver.findElement(By.xpath("//button[@id='searchbox-searchbutton']")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
