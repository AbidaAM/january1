package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	WebDriver driver;
	String baseurl="https://www.trivago.com";
	@BeforeTest
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
	@Test
	public void test() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]/span/span[2]/span[1]")).click();
        datepickermethod("May 2024","25");
}
	private void datepickermethod(String expmonth, String expdate) throws Exception {
		Thread.sleep(3000);
		while(true)
		{
			String month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
			System.out.println(month);
			if(month.equals(expmonth))
			{
				System.out.println("month:"+month);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
			}
		}
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[2]/div/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/button/time"));
			for(WebElement dateelement:alldates)
			{
				String date=dateelement.getText();
				{
					System.out.println(date);
					dateelement.click();
					break;
					
				}
		}
		
	}
		
	}
