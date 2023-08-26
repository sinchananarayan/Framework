package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("file:///C:/Users/PERFIOS-HW-877/Desktop/Clear.html");
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.tagName("input"));
		Thread.sleep(2000);
        ele.sendKeys(Keys.CONTROL+"a");
        ele.sendKeys(Keys.CONTROL+"c");
        Thread.sleep(2000);
        ele.sendKeys(Keys.DELETE);
        WebElement ele1= driver.findElement(By.id("a2"));
        Thread.sleep(2000);
        ele1.sendKeys(Keys.CONTROL+"v");
}
}
