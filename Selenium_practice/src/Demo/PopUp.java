package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUp {
	public static void main(String []args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();//this is upcasting done so using WebDriver
	driver.get("https://www.google.com/");
	WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	Thread.sleep(2000);
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	
	String pid = driver.getWindowHandle();
	Set<String> allid = driver.getWindowHandles();
	allid.remove(pid);
	
	for(String id:allid)
	{
		driver.switchTo().window(id);
		Thread.sleep(2000);
		WebElement ele1= driver.findElement(By.xpath("//textarea[@title='Search']"));
	ele1.sendKeys("amazon");
	ele1.sendKeys(Keys.ENTER);//this is to enter this amazon title
	driver.quit();
			
	

}
}
}