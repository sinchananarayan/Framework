package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testRunner_Instagram {
	
	@Test
	public void insta() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
	driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//when we give implicit wait that time this code worked
	
	pom_instagram p= new pom_instagram(driver);
    p.UN_Enter().sendKeys("sinchanahn24@gmail.com");//un_Enter method name
    Thread.sleep(6000);
    p.pass_Enter("chinnirukmini1997@");//pass_Enter methodname
    Thread.sleep(6000);
    p.login_click();

}
}
