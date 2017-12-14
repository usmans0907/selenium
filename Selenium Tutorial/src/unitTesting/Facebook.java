package unitTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Usman");
		driver.findElement(By.name("lastname")).sendKeys("Shabbir");
		driver.findElement(By.name("reg_email__")).sendKeys("6304405902");
		driver.findElement(By.name("reg_passwd__")).sendKeys("imran123");
		
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel1.selectByVisibleText("Oct");
		sel2.selectByVisibleText("3");
		sel3.selectByVisibleText("1984");
		
		driver.findElement(By.xpath(".//*[@id='u_0_7']")).click();
		driver.findElement(By.xpath("//button[@id='u_0_10']")).click();

	}

}
