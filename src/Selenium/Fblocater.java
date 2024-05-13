package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblocater {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@Before
	public void seUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void setValues()
	{
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
	}

}
