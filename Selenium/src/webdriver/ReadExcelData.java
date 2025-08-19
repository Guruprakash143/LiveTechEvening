package webdriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
public static void main(String[] args) throws IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\swapn\\Desktop\\GuruClassPrograms\\Input.xlsx");
	Workbook wb=new XSSFWorkbook(file);
	Sheet sheet=wb.getSheetAt(0);
	
	Row row=sheet.getRow(1);
	Cell cell=row.getCell(0);
	System.out.println(cell.getStringCellValue());
	
	int rows=sheet.getLastRowNum()-sheet.getFirstRowNum()+1;
	System.out.println(rows);
	
	for(int i=0;i<rows;i++) {
		 Row r=sheet.getRow(i);
		 for(int j=0;j<r.getLastCellNum();j++) {
			 System.out.println(r.getCell(j).getStringCellValue());
		 }
	}
	
}
}
