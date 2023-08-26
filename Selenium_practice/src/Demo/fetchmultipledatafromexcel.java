package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchmultipledatafromexcel {
	
	public static void main(String []args) throws EncryptedDocumentException, IOException
	{
	 FileInputStream fis = new FileInputStream("./excel/usrnameandpass.xlsx");
	 
	Workbook book= WorkbookFactory.create(fis);
	Sheet sh= book.getSheet("Sheet1");
	
	for(int i=0; i<8;i++)
	{
	Row r = sh.getRow(i);
	Cell cel = r.getCell(0);
	String un = cel.toString();
	System.out.println("username"+un);
	}
	for(int i=0; i<8;i++)
	{
	Row r = sh.getRow(i);
	Cell cel = r.getCell(1);
	String pw = cel.toString();
	System.out.println("password"+pw);
	}
	
	}
}
