package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swap3box {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("file:///C:/Users/PERFIOS-HW-877/Desktop/Swap3box.html");
		Thread.sleep(2000);
		
		WebElement ele= driver.findElement(By.tagName("input"));
		Thread.sleep(2000);
        ele.sendKeys(Keys.CONTROL+"ax");
        //ele.sendKeys(Keys.CONTROL+"c");x also used as ctrl+x means cut
        Thread.sleep(2000);
        //ele.sendKeys(Keys.DELETE);
        WebElement ele1= driver.findElement(By.id("a3"));
        ele1.sendKeys(Keys.CONTROL+"v");
        
        WebElement ele2= driver.findElement(By.id("a2"));
        Thread.sleep(2000);
        ele2.sendKeys(Keys.CONTROL+"ax");
        //ele3.sendKeys(Keys.CONTROL+"c");
        Thread.sleep(2000);
        //ele3.sendKeys(Keys.DELETE);
        WebElement ele3= driver.findElement(By.tagName("input"));
        ele3.sendKeys(Keys.CONTROL+"v");
        
        WebElement ele4= driver.findElement(By.id("a3"));
        ele4.sendKeys(Keys.CONTROL+"ax");
        //ele5.sendKeys(Keys.CONTROL+"c");
        Thread.sleep(2000);
        //ele5.sendKeys(Keys.DELETE);
        WebElement ele5= driver.findElement(By.id("a2"));
        ele5.sendKeys(Keys.CONTROL+"v");
	}
}