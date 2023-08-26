package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitlePageSourceCurrentUrl {
	
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		
		String title=driver.getTitle();
	  System.out.println(title);
		driver.close();
	}

}
