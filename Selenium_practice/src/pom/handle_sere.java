package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class handle_sere {
	
	@Test
	public void metho() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  	driver.get("https://www.instagram.com/"); 
	  	
	  	WebElement ele = driver.findElement(By.name("username"));
	  	ele.sendKeys("sinchana");
	  	Thread.sleep(6000);
	  	driver.navigate().refresh();
	  	Thread.sleep(6000);
	  	ele.sendKeys("perfios");//this pogrm will get stale element reference exception
}
}
