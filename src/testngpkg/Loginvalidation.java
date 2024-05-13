package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginvalidation {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@BeforeTest
	public void seUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void loginvalidation()
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abida.am001@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Luyi@123");
		driver.findElement(By.name("login")).click();
		String link=driver.getCurrentUrl();
		System.out.println(link);
		String expected="https://www.facebook.com";
		if(link.equals(expected))
		{
			System.out.println("pass");
		}
		else
			System.out.println("fail");
	}
	}


