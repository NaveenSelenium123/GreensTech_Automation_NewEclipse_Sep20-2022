import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
	public static void main(String[] args) throws IOException {
		
String excelFilePath=".\\dataFiles\\country.xlsx";
FileInputStream inputstream=new FileInputStream(excelFilePath);
XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
XSSFSheet sheet = workbook.getSheetAt(0);

//int rows = sheet.getLastRowNum();
//int cols = sheet.getRow(1).getLastCellNum();
//
//for(int r=0;r<=rows;r++)
//{
//	XSSFRow row = sheet.getRow(r);
//	for(int c=0;c<cols;c++)
//	{
//	XSSFCell cell = row.getCell(c);	
//	
//	switch(cell.getCellType())
//	{
//	case STRING: System.out.println(cell.getStringCellValue());break;
//	case NUMERIC: System.out.println(cell.getNumericCellValue());break;
//	case BOOLEAN: System.out.println(cell.getBooleanCellValue());break;
//	}
//	System.out.println(" | ");
//	}
//	System.out.println();
//}




//iterator
Iterator<Row> iterator = sheet.iterator();
while(iterator.hasNext()) {
	XSSFRow row= (XSSFRow) iterator.next();
	Iterator<Cell> cellIterator = row.cellIterator();
	while(cellIterator.hasNext()) {
		XSSFCell cell = (XSSFCell) cellIterator.next();
	
		switch(cell.getCellType())
	{
		case STRING: System.out.println(cell.getStringCellValue());break;
		case NUMERIC: System.out.println(cell.getNumericCellValue());break;
		case BOOLEAN: System.out.println(cell.getBooleanCellValue());break;
		}
		System.out.println(" | ");
		}
		System.out.println();
	}
	
	}
	


}
