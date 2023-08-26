package Demo;

import org.openqa.selenium.firefox.FirefoxDriver; 
public class OnlyFirefox {
	
	public static void main (String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe"); 
  	  FirefoxDriver driver=new FirefoxDriver();
  	driver.navigate().to("https://www.perfios.com");  
  	System.out.println("Firefox runned successfully");
	}

}
