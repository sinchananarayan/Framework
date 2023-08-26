package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSFacebook {
	
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);
		WebElement ele = driver.findElement(By.cssSelector("input[name='email']"));
		ele.sendKeys("sinchana");
		WebElement ele1= driver.findElement(By.cssSelector("input[id='pass']"));
		ele1.sendKeys("1223445");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		

}
}
