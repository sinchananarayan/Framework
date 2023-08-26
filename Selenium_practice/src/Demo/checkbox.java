package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// this is upcasting done so using WebDriver
		driver.get("file:///C:/Users/PERFIOS-HW-877/Desktop/checkboxischecked.html");
		Thread.sleep(6000);
		WebElement ele=driver.findElement(By.tagName("input"));
		boolean b=ele.isSelected();
		System.out.println(b);
		if(b)
		{
			System.out.println("it is checked");
		}
		else
		{
			System.out.println("it is not checked");
		}
		}
			


}

