package Selenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;
	String Baseurl="https://www.facebook.com";
	@Before
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get(Baseurl);
	}
	@Test
	public void setValues()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("total num of links="+li.size());
		for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			String linktext=ele.getText();
			System.out.println(link+"-----------"+linktext);
		}
	}

}
