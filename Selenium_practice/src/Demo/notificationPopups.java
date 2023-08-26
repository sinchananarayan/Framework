package Demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationPopups {
	public static void main(String []args) throws InterruptedException
	{
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifictaions");
		opt.addArguments("--icognito");
		
		
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver(opt);//this is upcasting done so using WebDriver
	driver.get("https://www.redbus.com/");
	driver.manage().window().maximize();
}
}
