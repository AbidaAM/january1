package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebooklogintestng {
		ChromeDriver driver;
		String baseurl="https://www.facebook.com";
		@BeforeTest
		public void seUp()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		@Parameters({"UN","pswd"})
		@Test
		public void test(String UN,String pswd)
		{
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(UN);
			driver.findElement(By.id("pass")).sendKeys(pswd);
			driver.findElement(By.name("login")).click();
			
		}
		

}
