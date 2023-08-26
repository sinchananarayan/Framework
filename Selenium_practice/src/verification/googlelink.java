package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class googlelink {
	@Test
	public void kannadalink() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		String txt = ele.getText();
		System.out.println(txt);
		Thread.sleep(2000);
		Assert.assertEquals(txt, "ಕನ್ನಡ");
		Thread.sleep(2000);
		System.out.println("verified");
		ele.click();
		driver.quit();

}
}
