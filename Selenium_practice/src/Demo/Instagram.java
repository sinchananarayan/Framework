package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.instagram.com/");
		Thread.sleep(6000);
		WebElement ele = driver.findElement(By.name("username"));
		ele.sendKeys("sinchana_narayan");
		Thread.sleep(6000);
		WebElement ele1 = driver.findElement(By.name("password"));
		ele1.sendKeys("111111");
		Thread.sleep(6000);
		driver.findElement(By.tagName("button")).click();

}
}
