package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepgm {
	ChromeDriver driver;
	String Baseurl="https:/www.google.com";
	@Before
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get(Baseurl);
}
	@Test
	public void setValues()
	{
		//driver.findElement(By.name("q")).sendKeys("books");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("books");
		search.submit();
		
		
	}


}
