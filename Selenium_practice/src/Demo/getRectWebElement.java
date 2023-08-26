package Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRectWebElement {
	public static void main(String []args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	WebElement ele= driver.findElement(By.id("email"));
	Rectangle rect = ele.getRect();//it will fetch both location and dimension
	int h = rect.getHeight();
	System.out.println(" height is "+h);
	int w = rect.getWidth();
	System.out.println(" width is "+w);

}
}
