package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm {
	ChromeDriver driver;
	String Baseurl="https:/www.amazon.in";
	@Before
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get(Baseurl);
	}

@Test
public void setValues()
{
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
	driver.findElement(By.xpath("//div[@id='nav-xshop']/a[16]")).click();
	driver.findElement(By.xpath("//input[@id='nav-link-accountList']")).click();
	driver.findElement(By.xpath("//input[@id='nav-cart']")).click();
	
	
}
}


