package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbtitleverification;

public class fbtitletest {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://WWW.facebook.com/");
	}
	@Test
	public void createlinktest()
	{
		Fbtitleverification ob=new Fbtitleverification(driver);
	    ob.createlinkclick();
		String actualtitle=ob.titleverification();
		Assert.assertEquals(actualtitle,"Facebook");
	}
	

}
