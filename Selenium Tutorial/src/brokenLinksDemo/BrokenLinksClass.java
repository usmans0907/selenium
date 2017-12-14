package brokenLinksDemo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.net.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksClass {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement i:links) {
			
			String url = i.getAttribute("href");
			verifyLinks(url);
		}
		driver.quit();
	}
	
	public static void verifyLinks(String linkUrl) throws Exception , MalformedURLException {
		
		URL url = new URL(linkUrl);
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setConnectTimeout(5000);
		connection.connect();
		
		if(connection.getResponseCode()==200) {
			System.out.println(linkUrl +" - "+connection.getResponseMessage());
		}
		else if(connection.getResponseCode()==404) {
			System.out.println(linkUrl +" - "+connection.getResponseMessage());
		}
	}

}
