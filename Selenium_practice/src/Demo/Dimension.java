package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimension {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.id("email"));
		org.openqa.selenium.Dimension size = ele.getSize();
		System.out.println(size);
		int h= size.getHeight();
		System.out.println(" height is "+h);
		int w= size.getWidth();
		System.out.println(" width is "+w);

}
}