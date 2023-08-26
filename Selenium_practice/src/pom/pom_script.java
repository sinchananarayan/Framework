package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory; 

public class pom_script {
	
	//declaration
	@FindBy(name="username")
	private WebElement UN_txt;
	
	//initilization
	public pom_script(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public WebElement UN_Enter()
	{
		return UN_txt;
	}

}
