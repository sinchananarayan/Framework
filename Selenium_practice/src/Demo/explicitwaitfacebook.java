package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwaitfacebook {
	public static void main(String []args)
	{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.urlContains("facebook"));//urlContains we can also use titleContains
	
	 WebElement un = driver.findElement(By.id("email"));
  wait.until(ExpectedConditions.visibilityOf(un)).sendKeys("Qspsiders");//visibiltyOf
  driver.findElement(By.id("pass")).sendKeys("Rajajinagar");
}
}
