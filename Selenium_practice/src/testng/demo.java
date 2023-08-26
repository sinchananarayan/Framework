package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo {
	
	@Test(enabled= true)
	public void lion()
	{
		Reporter.log("hi", true);
	}
	@Test(enabled=false)
	public void apple()
	{
		Reporter.log("Bye", true);
	}

}
