package webdriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
public static void main(String[] args) throws IOException {
	

	FileInputStream file=new FileInputStream("C:\\Users\\swapn\\Desktop\\GuruClassPrograms\\Output.xlsx");
	Workbook wb=new XSSFWorkbook(file);
	Sheet sheet=wb.getSheetAt(0);
	
	Row row=sheet.createRow(1);
	
	Cell cell=row.createCell(0);
	
	String str="Hello Welcome To LiveTech";
	
	cell.setCellValue(str);
	
	
	FileOutputStream fo=new FileOutputStream("C:\\Users\\swapn\\Desktop\\GuruClassPrograms\\Output.xlsx");
	wb.write(fo);
	wb.close();
	
}
}
