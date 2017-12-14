package handleWindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsHandle {
	
	WebDriver driver;
	
	@Test
	public void test() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
		System.out.println("Title before switching -- "+driver.getTitle());
		String parent = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("Total child windows -- "+count);
		
		for(String child:allWindows) {
			
			if(!parent.equalsIgnoreCase(child)) {
				
				driver.switchTo().window(child);
				driver.manage().window().maximize();
				System.out.println("Child window title -- "+driver.getTitle());
				Thread.sleep(2000);
				driver.close();
			}
			driver.switchTo().window(parent);
			//System.out.println("Title after switching -- "+driver.getTitle());
		Thread.sleep(2000);
		}
		
	}

}
