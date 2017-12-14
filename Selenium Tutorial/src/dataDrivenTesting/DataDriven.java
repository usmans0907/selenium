package dataDrivenTesting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataDriven {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void before(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
	}
	@Test(dataProvider= "exceldata")
	public void test1(String username, String password) throws Exception {
		
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.findElement(By.id("loginbutton")).click();
			SoftAssert assertion = new SoftAssert();
			assertion.assertAll();
			
		}
	
	@AfterMethod
	public void after() throws Exception {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	@DataProvider(name = "exceldata")
	public Object[][] acceptData() throws IOException {
		
		ObjectClass obj = new ObjectClass("C:\\Users\\Usman\\Desktop\\login.xlsx", 1);
		
		return obj.testdata();
	}
	
	

/*	@DataProvider(name= "exceldata")
	public Object[][] testdata() throws IOException{
	
	
		File file = new File("C:\\Users\\Usman\\eclipse-workspace\\ExcelData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheetAt(0);
	
		int rowCount = s.getLastRowNum();
		String inputData [][] = new String[rowCount][2];

			for(int i=0; i<rowCount; i++) {
				
				for(int j=0; j<2; j++) {
					
					inputData[i][j]= s.getRow(i).getCell(j).getStringCellValue();
				}
			}
			wb.close();
			return inputData;
			
	}*/
}

