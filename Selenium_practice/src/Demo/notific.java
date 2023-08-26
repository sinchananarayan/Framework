package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notific {
	public static void main(String []args) throws InterruptedException
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--incognito");
		
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver(opt);//this is upcasting done so using WebDriver
	driver.get("https://www.redbus.com/");
	driver.manage().window().maximize();
	driver.close();
	}

}
