package Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo
{
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	
	@Before 
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void titleverification()
	{
		String exp="Google";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
		
		@Test
		public void contentVerification()
		{
			String src=driver.getPageSource();
			if(src.contains("Gmail"))
			{
				System.out.println("text is present");
			}
			else
			{
				System.out.println("text is not present");
			}
		

	}
		@After
		public void tearDown()
		{
			driver.quit();
		}
		
	}
	
	


