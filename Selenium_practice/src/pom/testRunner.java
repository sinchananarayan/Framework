package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testRunner {
	
	@Test
	public void Face() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//when we give implicit wait that time this code worked
		
        pom_script p= new pom_script(driver);
        p.UN_Enter().sendKeys("sinchana");
        Thread.sleep(6000);
        driver.navigate().refresh();
        Thread.sleep(6000);
        p.UN_Enter().sendKeys("perfios");
	}

}
