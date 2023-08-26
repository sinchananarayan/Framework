package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);
		WebElement ele = driver.findElement(By.name("email"));
		ele.sendKeys("sinchanahn24@gmail.com");
		Thread.sleep(6000);
		WebElement ele1 = driver.findElement(By.id("pass"));
		ele1.sendKeys("9449359404");
		Thread.sleep(6000);
		driver.findElement(By.name("login")).click();
		
		
	    

}
}

