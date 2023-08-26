package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class facebook extends base_facebook{
	
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("sinchana_narayan");
		Thread.sleep(6000);
		driver.findElement(By.name("password")).sendKeys("chinnirukimini24@");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();

	}
	

}
