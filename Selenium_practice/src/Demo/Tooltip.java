package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		String tool_tip = ele.getAttribute("title");
		System.out.println(tool_tip);

}
}
