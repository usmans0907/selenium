package readExcel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws Exception {
		
		File source = new File("C:\\Users\\Usman\\Desktop\\ExcelData.xlsx");
		
		FileInputStream fis = new FileInputStream(source);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowCount = sheet1.getLastRowNum();
		
		for(int i=0; i<=rowCount; i++) {
			
			String data = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Cells Value :" + data);
		}
		wb.close();
		
		/*File source1 = new File("C:\\Users\\Usman\\eclipse-workspace\\ExcelData.xlsx");
		
		FileInputStream fis1 = new FileInputStream(source1);
		
		XSSFWorkbook wb1 = new XSSFWorkbook(fis1);
		
		XSSFSheet sheet2 = wb1.getSheetAt(0);
		
		int rowCount1 = sheet2.getLastRowNum();
		
		for(int i=0; i<=rowCount1; i++) {
			
			String data1 = sheet2.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Cells Value :" + data1);
		}
		wb.close();*/
		
		
	}
	
}