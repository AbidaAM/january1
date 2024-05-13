package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Filkeuploadtextfeild {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/upload/";
	@BeforeTest
	public void seUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void fileupload()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("D:\\Users\\Abida\\Documents\\MOHAMMED ISSA_CV.docx");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.name("send")).click();
		
		
	}

}
