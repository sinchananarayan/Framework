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

public class writethedatainexcel {
	public static void main(String []args) throws EncryptedDocumentException, IOException
	{
	 FileInputStream fis = new FileInputStream("./excel/writedatainexcel.xlsx");
	 
	Workbook book= WorkbookFactory.create(fis);
	Sheet sh= book.getSheet("Sheet1");
	
	Row r = sh.createRow(0);
	Cell cel = r.createCell(1);
	
	//step5
	cel.setCellValue("SINCHANA");//setting the value
	
	//output the same file
	FileOutputStream fout= new FileOutputStream("./excel/writedatainexcel.xlsx");//in this output excel file will open
		book.write(fout);//here that set value will be coming

}
}
