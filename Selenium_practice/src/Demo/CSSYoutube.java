package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSYoutube {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.youtube.com/");
		Thread.sleep(6000);
		WebElement ele = driver.findElement(By.cssSelector("input[id='search']"));
		ele.sendKeys("teere vaaste");
		WebElement ele1= driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
		ele1.click();
		Thread.sleep(4000);
		driver.close();
		

}
}
