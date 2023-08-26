package Demo;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class robot {
	public static void main(String []args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PERFIOS-HW-877\\eclipse-workspace\\Selenium_practice\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement kan = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Actions act= new Actions(driver);
		act.contextClick(kan).perform();//right click action will perform using action class
		
		Thread.sleep(2000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(4000);
		driver.quit();
		

}
}
