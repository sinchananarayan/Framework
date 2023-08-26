package basic_hybrid_framework;

import org.testng.annotations.Test;

public class test_Runner extends base_class{
	
	@Test
	public void Face() throws InterruptedException
	{

	pom_class p= new pom_class(driver);
    p.UN_Enter().sendKeys("sinchana");
    Thread.sleep(6000);
    driver.navigate().refresh();
    Thread.sleep(6000);
    p.UN_Enter().sendKeys("perfios");

}
}
