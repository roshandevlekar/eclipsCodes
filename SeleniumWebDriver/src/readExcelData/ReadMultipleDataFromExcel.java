package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		//read data from IPL sheet
		//implementation of read the data from Excel
		
		//read multiple values or data from excel by using for loop
		for(int i=1;i<=10;i++)
		{
	
			FileInputStream fis=new FileInputStream("./data/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("IPL");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(1);
			String data = cell.getStringCellValue(); //read the value from cell
			Thread.sleep(1000);
			System.out.println(data);
		}
		
	}

}
