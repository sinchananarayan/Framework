package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDrop {
	public static void main(String []args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();// this is upcasting done so using WebDriver
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(4000);
	WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement dst = driver.findElement(By.id("bank"));
	Actions act= new Actions(driver);
	act.dragAndDrop(src,dst).perform();
	Thread.sleep(4000);
	driver.quit();

}
}
