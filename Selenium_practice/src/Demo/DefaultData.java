package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultData {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("file:///C:/Users/PERFIOS-HW-877/Desktop/deafaultdata.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.tagName("input"));
		ele.clear();
				 

}
}


