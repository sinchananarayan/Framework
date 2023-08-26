package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup {
	public static void main(String []args) throws InterruptedException
	{

	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();// this is upcasting done so using WebDriver
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.name("cusid")).sendKeys("sinchana");
	Thread.sleep(2000);

}
}
