package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSPerfios {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.perfios.com/");
		Thread.sleep(6000);
		WebElement ele = driver.findElement(By.cssSelector("a[title='PFM Login']"));
		ele.click();
		driver.get("https://pfm.perfios.com/KuberaVault/login");
		WebElement ele1= driver.findElement(By.cssSelector("input[type='email']"));
		ele1.sendKeys("sinchana.hn@perfios.com");
		WebElement ele2= driver.findElement(By.cssSelector("input[type='password']"));
		ele2.sendKeys("P330sinchana");
		driver.findElement(By.cssSelector("button[id='loginButton']")).click();
		Thread.sleep(4000);
		driver.close();
		

}
}
	
