package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ObjectClass {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	File file;
	FileInputStream fis;
	
	public ObjectClass(String url, int index) throws IOException {
		file = new File(url);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(index);
	}
	public Object[][] testdata() throws IOException{
		

		int rowCount = sheet.getLastRowNum();
		String inputData [][] = new String[rowCount][2];
		

			for(int i=0; i<rowCount; i++) {
				
				for(int j=0; j<2; j++) {
					
					inputData[i][j]= sheet.getRow(i).getCell(j).getStringCellValue();
					
					}
			}
			wb.close();
			return inputData;
			
	}

}
