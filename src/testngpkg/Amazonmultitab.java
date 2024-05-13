package testngpkg;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonmultitab {
	WebDriver driver;
	@BeforeTest
		public void setUp()
		{
			driver=new ChromeDriver();
		
		}
		@Test
		public void test()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.amazon.in/");
			driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones",Keys.ENTER);
			String expected="Amazon.in: mobile phones";
			String pagetitle=driver.getTitle();
			if(expected.equalsIgnoreCase(pagetitle))
			{
			System.out.println("title verified successfully");
		}
			else
			{
				System.out.println("title verification failed");
			}

		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		String parentwindow=driver.getWindowHandle();   //currentwindow

		Set<String> s=driver.getWindowHandles();
		for(String handle:s)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{   
				driver.switchTo().window(handle);
				JavascriptExecutor js=(	JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,500)");
	            
			driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
		
			}
		}


	}
	}


