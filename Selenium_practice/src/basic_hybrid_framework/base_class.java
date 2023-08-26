package basic_hybrid_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_class {
	
	public static WebDriver driver;
	@BeforeMethod
	public void open_app()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		
	}
	@AfterMethod
	public void close_app()
	{
		driver.close();
	}
}
//its starts executing from baseclass launching the browser and getting the URL and then it will go to Pom class to find every element
//and then its goes to test runnerclass and executes and will close the it in base class.