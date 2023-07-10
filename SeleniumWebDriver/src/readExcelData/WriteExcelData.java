package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//Write the data in excel sheet
		FileInputStream fis=new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.createRow(11);
		
		//Row row = sheet.getRow(1);
		
		//create a cell by using row interface
		Cell cell = row.createCell(0);
		
		//Write the data into cell
		cell.setCellValue("Pune");
		
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		wb.write(fos);
	}

}
