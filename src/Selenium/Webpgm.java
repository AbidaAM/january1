package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpgm {
		ChromeDriver driver;
		String Baseurl="file:///D:/Users/Abida/Desktop/webpgm.html";
		@Before
		public void setUp()
		{
		driver=new ChromeDriver();
		driver.get(Baseurl);
		}
		@Test
		public void setValues()
		{
			driver.findElement(By.xpath("/html/body/input")).click();
			Alert a=driver.switchTo().alert();
			System.out.println(a.getText());
			a.accept();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abida");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lamees");
			driver.findElement(By.xpath("/html/body/input[4]")).click();

			
			
			
		}
		

}
