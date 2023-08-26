package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fetchSingledatafromExcel {
	public static void main(String []args) throws EncryptedDocumentException, IOException
	{
	 FileInputStream fis = new FileInputStream("./excel/perfios.xlsx");
	 
	Workbook book= WorkbookFactory.create(fis);
	Sheet sh= book.getSheet("Sheet1");
	Row r = sh.getRow(0);
	Cell cel = r.getCell(0);
	String value = cel.toString();
	System.out.println(value);
	
	//steps to pass the excel fetched data into the  text field
	
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe"); 
	  FirefoxDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/PERFIOS-HW-877/Desktop/textfield.html"); 
	driver.findElement(By.tagName("input")).sendKeys("value");
	driver.quit();
	
	
	
}
}
