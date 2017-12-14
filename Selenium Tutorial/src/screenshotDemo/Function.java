package screenshotDemo;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Function {
	
	public static void screenshot(WebDriver driver, String name) throws Exception {
		
		//Steps for Taking Screenshot......
		
				//Typecast the TakesScreenshot Interface with the object of WebDriver....
				TakesScreenshot ts = (TakesScreenshot)driver;
				
				//Get the Screenshot as a File and stores in a File instance i.e; source....
				File source = ts.getScreenshotAs(OutputType.FILE);
				
				//Copy the Screenshot in the given folder as '.png' format....
				FileUtils.copyFile(source , new File("./Screenshots/" + name + ".png"));
	}

}
