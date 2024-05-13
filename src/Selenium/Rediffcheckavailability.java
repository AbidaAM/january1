package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffcheckavailability {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
	public void seUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void buttontetverification()
	{
		String buttontext=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
		if(buttontext.equals("Check availability"))
		{
			System.out.println("pass");
		}
		else
			
		{
			System.out.println("fail");
		}
		
		
		
	}

}
