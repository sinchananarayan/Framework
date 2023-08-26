package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSInstagram {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.instagram.com/");
		Thread.sleep(6000);
		WebElement ele = driver.findElement(By.cssSelector("input[name='username']"));
		ele.sendKeys("sinchana_narayan");
		WebElement ele1= driver.findElement(By.cssSelector("input[type='password']"));
		ele1.sendKeys("11111");
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
		

}
}

