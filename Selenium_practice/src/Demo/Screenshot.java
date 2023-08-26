package Demo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String []args) throws InterruptedException, IOException
	{
		Date d= new Date();
		String d1= d.toString();
		String date=d1.replace(":", "-");
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot tss= (TakesScreenshot)driver;
		File src= tss.getScreenshotAs(OutputType.FILE);
		//File src = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		//File dst= new File("C:\\Users\\PERFIOS-HW-877\\Pictures\\Saved Pictures "+ date+".jpg"); we can give drive path as well
		File dst= new File("./photos/ " + date + ".jpg");
	    FileHandler.copy(src, dst);
	    Thread.sleep(4000);
	    driver.quit();
		
	}

}
