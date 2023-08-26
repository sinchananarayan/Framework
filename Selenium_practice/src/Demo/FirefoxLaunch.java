package Demo;

import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  


public class FirefoxLaunch {
	
	
public static void main(String[] args) {
		
		int key=0; 
    for(int i=0 ; i<2 ; i++)
        if(key==i) 
        	{
        	
        	 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe"); 
        	  ChromeDriver driver=new ChromeDriver();
        	  System.out.println("ChromeRunSuccessfully");
        }
        else
        	 System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe"); 
        FirefoxDriver driver=new FirefoxDriver();
  	  System.out.println("FireFoxRunSucessfully");
        	
        	
        	
        	
        }
        
     
}
