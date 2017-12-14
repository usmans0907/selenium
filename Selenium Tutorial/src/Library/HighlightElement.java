package Library;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighlightElement {
	
	public static void highlightMethod(WebDriver driver, WebElement element) throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('style','background: yellow','border: 2px solid red')", element);
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].setAttribute('style','border: 2px solid white')", element);
	}


}
