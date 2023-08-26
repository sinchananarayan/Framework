package Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fifthProductMyntra {
	public static void main(String []args) throws InterruptedException
	
	{
	
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();//this is upcasting done so using WebDriver
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	ele.sendKeys("shoes");
	ele.sendKeys(Keys.ENTER);//need to traversing in next line
	//driver.findElement(By.xpath("//div[@class='sort-sortBy']/..

}
}
