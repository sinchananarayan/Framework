package Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class amazonJavaScriptExecutor {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[text()='Facebook']"));
		Thread.sleep(2000);
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		Point p = ele.getLocation();
		int x= p.getX();
		System.out.println(x);
		int y=p.getY();
		System.out.println(y);
		jse.executeScript("window.scrollBy("+x+","+y+")");//if something is hiding the facebook element then give x-50, y-50
		ele.click();
		driver.quit();
}
}
