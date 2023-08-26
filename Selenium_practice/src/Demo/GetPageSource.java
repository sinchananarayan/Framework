package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetPageSource {
	
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//this is upcasting done so using WebDriver
		driver.get("https://www.amzaon.com");
		Thread.sleep(2000);
		
		String src=driver.getPageSource();
	  System.out.println(src);
		driver.close();

}
	
}
