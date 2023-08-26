package Demo;

import org.openqa.selenium.chrome.ChromeDriver; 

public class OnlyChrome {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
	  	driver.navigate().to("https://www.perfios.com");  
	  	System.out.println("Chrome runned successfully");
		}
	}

