package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multipletab {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/popup.php";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test

public void test()
{
	String parentwindow=driver.getWindowHandle();   //currentwindow
	System.out.println("Parent window title="+driver.getTitle());
	driver.findElement(By.xpath("/html/body/p/a")).click();
	Set<String> allwindowHandles=driver.getWindowHandles();
	for(String handle:allwindowHandles)
	{
		if(!handle.equalsIgnoreCase(parentwindow))
		{
			driver.switchTo().window(handle);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("cpnoufiraas@gmail.com");
		driver.close();
		}
	}driver.switchTo().window(parentwindow);


}}


