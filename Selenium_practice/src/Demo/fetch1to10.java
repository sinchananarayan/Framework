package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch1to10
{
	public static void main(String []args) throws EncryptedDocumentException, IOException
	{
	
	
	 FileInputStream fis = new FileInputStream("./excel/fetch1to10excel.xlsx");
	 Workbook book= WorkbookFactory.create(fis);
	Sheet sh= book.getSheet("Sheet1");
	for(int i=0;i<11;i++)
	{
	Row r = sh.createRow(i);
	Cell cel = r.createCell(0);
	cel.setCellValue(i);
	FileOutputStream fout= new FileOutputStream("./excel/fetch1to10excel.xlsx");//in this output excel file will open
	book.write(fout);
	}
	}
	}

