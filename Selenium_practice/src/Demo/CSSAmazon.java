package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSAmazon {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.amazon.com/");
		Thread.sleep(6000);
		WebElement ele = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		ele.sendKeys("women handbags");
		WebElement ele1= driver.findElement(By.cssSelector("input[type='submit']"));
		ele1.click();
		
		

}
}

