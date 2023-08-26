package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_instagram {

	//declaration
	@FindBy(name="username")
	private WebElement UN_txt;
	
	@FindBy(name="password")
	private WebElement pass_txt;
	
	@FindBy(xpath="//div[text()='Log in']")
	private WebElement login_btn;
	
	//initilization
	public pom_instagram(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement UN_Enter()
	{
		return UN_txt;
	}
	public void pass_Enter(String pass)//method with parameter
	{
		pass_txt.sendKeys(pass);
	}
	public void login_click()
	{
		login_btn.click();//reference variable plus action we did
	}
}
