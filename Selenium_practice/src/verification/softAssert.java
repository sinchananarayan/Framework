package verification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	@Test
	public void instagram() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		SoftAssert ast= new SoftAssert();
		ast.assertEquals(title, "Instagram123");//
		System.out.println("execution continue");
		Thread.sleep(6000);
		driver.findElement(By.name("email")).sendKeys("sinchana");
		ast.assertAll();//mandatory statement if we dint give this statement then it get passed.
		
}
}
