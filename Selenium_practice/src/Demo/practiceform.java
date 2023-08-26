package Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceform {
	public static void main(String []args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
     WebElement ele= driver.findElement(By.id("firstName"));
     ele.sendKeys("sinchana");
     WebElement ele1 = driver.findElement(By.id("lastName"));
     ele1.sendKeys("HN");
     WebElement ele2 = driver.findElement(By.id("userEmail"));
     ele2.sendKeys("sinchanahn24@gmail.com");
     Thread.sleep(2000);
     WebElement ele3= driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
     ele3.click();
     Thread.sleep(2000);
     WebElement ele4 = driver.findElement(By.id("userNumber"));
     ele4.sendKeys("9449359404");
     
     driver.findElement(By.id("dateOfBirthInput")).click();
     Thread.sleep(2000);
     
     WebElement ele5 = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
     Select sel= new Select(ele5);
     sel.selectByValue("0");
     
     WebElement ele6 = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
     Select sel1= new Select(ele6);
     sel1.selectByVisibleText("1997");
     
     driver.findElement(By.xpath("//div[text()='24']")).click();
     
     //driver.findElement(By.id("subjectsContainer")).sendKeys("English");
     driver.findElement(By.xpath("//label[text()='Sports']")).click();
     Thread.sleep(2000);
     driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\PERFIOS-HW-877\\Pictures\\Screenshots\\Screenshot (1).png");
     Thread.sleep(2000);
     driver.findElement(By.id("currentAddress")).sendKeys("Havalli village Aldur post Chikmaglur");
     Thread.sleep(2000);
     
     
     driver.findElement(By.xpath("//div[@id='state']//div[contains(@class,'css-1hwfws3')]")).click();
     Thread.sleep(2000);
     
     WebElement ele7 = driver.findElement(By.xpath("//select[@class=' css-1pahdxg-control']//select[@class=' css-1hwfws3']"));
     Select sel2= new Select(ele7);
     sel2.selectByVisibleText("Uttar Pradesh");
}
	
}
	

