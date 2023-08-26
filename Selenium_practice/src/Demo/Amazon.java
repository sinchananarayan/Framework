package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.amazon.in/");
		Thread.sleep(6000);
		WebElement ele = driver.findElement(By.name("field-keywords"));
		ele.sendKeys("Women tops");
		Thread.sleep(6000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.close();

}
}
