package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.youtube.com/");
		Thread.sleep(6000);
		WebElement ele = driver.findElement(By.name("search_query"));
		ele.sendKeys("teere vaaste");
		Thread.sleep(6000);
		driver.findElement(By.id("search-icon-legacy")).click();

}
}

