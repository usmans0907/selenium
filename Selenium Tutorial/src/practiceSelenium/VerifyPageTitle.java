package practiceSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyPageTitle {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	}


	@Test
	public void testLogin () throws InterruptedException{
		
		//Enter invalid email address....
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ssgill@yahoo.com");
		Thread.sleep(1000);
		//Clear invalid email address....
		driver.findElement(By.xpath(".//*[@id='email']")).clear();
		Thread.sleep(1000);
		//Enter valid email address....
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ssgill302@yahoo.com");
		Thread.sleep(1000);
		//Enter invalid password....
		driver.findElement(By.id("pass")).sendKeys("856773");
		Thread.sleep(1000);
		//Clear invalid password....
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(1000);
		//Enter valid password....
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("8560783");
		Thread.sleep(1000);
		//Click the login button....
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
		String actual = driver.getTitle();
		System.out.println("The actual title is : " + actual);
		
		/*String expected = "facebook";
		Assert.assertEquals(actual,expected,"......Title is not matched......");
		System.out.println("Title Matched Successfully");*/
		
		Assert.assertTrue(actual.contains("book"),"Title not matched");
		System.out.println("Title matched");

	}
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
