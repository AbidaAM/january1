package testngpkg;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {

	
	WebDriver driver;
	@BeforeTest
	public void beforetest()
	{
	driver=new ChromeDriver();
	}
	@Test
	public void test() throws Exception
	{
		FileInputStream f=new FileInputStream("D:\\Users\\Abida\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int row=sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			
			String un=sh.getRow(i).getCell(0).getStringCellValue();
			String pw=sh.getRow(i).getCell(2).getStringCellValue();
			System.out.println("username="+un);
			System.out.println("password="+pw);
			
			driver.get("https://www.facebook.com");
			
			driver.findElement(By.id("email")).sendKeys(un);
			driver.findElement(By.id("pass")).sendKeys(pw);
			driver.findElement(By.name("login")).click();
			
		}
	}

}
