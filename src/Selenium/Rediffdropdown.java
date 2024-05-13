package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdropdown {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
	public void seUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void setValues()
	{
		WebElement daydropdown=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select"));
		Select obday=new Select (daydropdown);
		obday.selectByValue("01");
		
		WebElement monthdropdown=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select obmonth=new Select (monthdropdown);
		obmonth.selectByValue("02");
		
		WebElement yeardropdown=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select obyear=new Select (yeardropdown);
		obyear.selectByValue("2020");
		
		
		
	}


}
