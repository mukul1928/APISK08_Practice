package Utilities;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchDataFromExcel2 {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet1;
	FetchDataFromExcel2(String excelPath, String sheetName) throws IOException{
		workbook = new XSSFWorkbook(excelPath);
		sheet1 = workbook.getSheet(sheetName);
	}
	
	//E:\\API_Automation_08_SK_GrotechMinds\\TestData06thAug2026.xlsx
	//Sheet1
	
	public static Object getData(int x,int y) {
		DataFormatter formatter = new DataFormatter(); //for changing the data format from byte to String we use DataFormatter
		Object value = formatter.formatCellValue(sheet1.getRow(x).getCell(y));
		return value;
    }
}
