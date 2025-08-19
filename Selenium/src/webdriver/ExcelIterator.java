package webdriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIterator {
public static void main(String[] args) throws IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\swapn\\Desktop\\GuruClassPrograms\\Input.xlsx");
	Workbook wb=new XSSFWorkbook(file);
	Sheet sheet=wb.getSheetAt(0);
	
/************Excel Iterator using POI*********/
	Iterator<Row> iterow=sheet.iterator();
	while(iterow.hasNext()) {
		
		Row  row=iterow.next();
		
		Iterator<Cell> iteCell=row.iterator();
		while(iteCell.hasNext()) {
			Cell cell=iteCell.next();
			
			switch(cell.getCellType()){
			case STRING:
				System.out.print(cell.getStringCellValue() + "\t");
				break;
			case NUMERIC:
				System.out.print(cell.getNumericCellValue()+"\t");
				break;
			case BOOLEAN:
				System.out.print(cell.getBooleanCellValue()+"\t");
				break; 
			}
		}
	}
}
}
