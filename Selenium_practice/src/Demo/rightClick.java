package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick {
	public static void main(String []args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();// this is upcasting done so using WebDriver
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement rele = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions act= new Actions(driver);
	act.contextClick(rele).perform();

}
}