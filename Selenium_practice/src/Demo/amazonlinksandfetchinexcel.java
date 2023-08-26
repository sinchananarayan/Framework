package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonlinksandfetchinexcel {
	public static void main(String []args) throws EncryptedDocumentException, IOException, InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe"); 
	  FirefoxDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.amazon.in"); 
	Thread.sleep(2000);
 List<WebElement> links = driver.findElements(By.xpath("//a"));
 int count=links.size();
 for(WebElement link:links)
{
	String att= link.getAttribute("href");
FileInputStream fis = new FileInputStream("./excel/amazonlinks.xlsx");
	 Workbook book= WorkbookFactory.create(fis);
	//Sheet sh= book.getSheet("Sheet1");//this worked able to see all the links in sheet1
	Sheet sh= book.createSheet("Amazon"+1);//able to create the sheet and not able to fetch the amazon links in created Amazon sheet 
	for(int i=0; i<count;i++)
	{
		Row r = sh.createRow(i);
		Cell cel = r.createCell(0);
		cel.setCellValue(att);
	}
	
	
	//output the same file
	FileOutputStream fout= new FileOutputStream("./excel/amazonlinks.xlsx");//in this output excel file will open
		book.write(fout);//here that set value will be coming

}

	}
}
