package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frames {
	public static void main(String []args) throws InterruptedException
	{

	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();// this is upcasting done so using WebDriver
	driver.get("file:///C:/Users/PERFIOS-HW-877/Desktop/primary.html");
	Thread.sleep(2000);
	driver.findElement(By.id("u1")).sendKeys("Hi");
	Thread.sleep(2000);
	//driver.switchTo().frame(0);           using indexing
	//driver.switchTo().frame("i1");         using id or name
	WebElement frm = driver.findElement(By.tagName("iframe"));
	driver.switchTo().frame(frm);//          using element address
	driver.findElement(By.id("p1")).sendKeys("World");
    driver.quit();
}
}
