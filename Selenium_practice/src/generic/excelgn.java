package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelgn {
	
	public static String get_data(String sheet, int rnum, int cnum)
	{
		String val= "";
	try
		{
	 FileInputStream fis = new FileInputStream("./excel/perfios.xlsx");
	 
	Workbook book= WorkbookFactory.create(fis);
	Sheet sh= book.getSheet("Sheet1");
	Row r = sh.getRow(0);
	Cell cel = r.getCell(0);
	val=cel.toString();
}
	
catch(Exception e)
{
	System.out.println("unable to fetch test data");
}
	return val;
	}
}