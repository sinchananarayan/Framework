package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.WebDriver;

public class IdLocator {
	
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("file:///C:/Users/PERFIOS-HW-877/Desktop/Id.html");
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).click();

}
}
