package basic_hybrid_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_class {
	
	//declaration
		@FindBy(name="username")
		private WebElement UN_txt;
		
		//initilization
		public pom_class(WebDriver driver)
		{
			PageFactory.initElements(driver, this);//to intialize the element.
		}
		
		//utilization
		public WebElement UN_Enter()
		{
			return UN_txt;
		}

	}


