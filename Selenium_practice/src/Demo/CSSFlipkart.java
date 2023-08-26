package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSFlipkart {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.flipkart.com/");
		Thread.sleep(6000);
		WebElement ele = driver.findElement(By.cssSelector("input[type='text']"));
		ele.sendKeys("women shoes");
		WebElement ele1= driver.findElement(By.cssSelector("button[type='submit']"));
		ele1.click();
		Thread.sleep(4000);
		driver.close();
		
		

}
}

