package testngpkg;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Janasya {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://janasya.com/");
	}
	@Test  (priority=1)  //new arrivals click,logo display
public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a/span")).click();
		boolean logo=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16316676800682__9c03747e-b054-4db8-8194-5a35c71f82ca\"]/div/div/div/div[1]/div/a/img")).isDisplayed();
	if(logo)
	{
		System.out.println("logo is displayed");
	}
	else
	{
		System.out.println("logo is not displayed");
	}
	
   }
	

@Test(priority=2)
public void test2() //drop down select 15
{
	driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3")).click();
	driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a/span")).click();

}
@Test(priority=3)
public void test3() //under catogeries click on kurtas
{  
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//*[@id=\"CollectionProductGrid\"]/div/toolbar-item/div[2]/div[3]/div[1]/div/div")).click();
	driver.findElement(By.xpath("//*[@id=\"CollectionProductGrid\"]/div/toolbar-item/div[2]/div[3]/div[1]/div/ul/li[2]/span")).click();
	driver.findElement(By.xpath("//*[@id=\"44199301382314\"]"));
	driver.findElement(By.xpath("//*[@id=\"main-collection-product-grid\"]/li[1]/div/div/div[1]/div/div[2]/a"));
	
}
@Test(priority=4)    //link dispaly
public void test4()
{
List<WebElement> li=driver.findElements(By.tagName("a"));
for(WebElement link:li)
{
			String a=link.getAttribute("href");
	String text=link.getText();
	System.out.println(a+".........."+text);
}

}
@Test(priority=5)
public void test5()   //menu text display
{
	WebElement topmenu=driver.findElement(By.className("header__inline-menu"));
	List<WebElement> menuitems=topmenu.findElements(By.tagName("li"));
	for(WebElement item:menuitems)
	{
		String menuitemtext=item.getText().trim();
		if(!menuitemtext.isEmpty())
		{
			System.out.println("menu text=:"+menuitemtext);
		}
	}
}
@Test(priority=6)
public void test6()  //underkurta add pdt to wishlist,click add to cart,click view cart
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	WebElement wishlist=driver.findElement(By.xpath("//*[@id=\"main-collection-product-grid\"]/li[1]/div/div/div[1]/div/div[3]/div[1]/button"));
	Actions act=new Actions(driver);
	act.moveToElement(wishlist).click().perform();
	driver.findElement(By.xpath("//*[@id=\"main-collection-product-grid\"]/li[1]/div/div/div[2]/div/a/span")).click();
	driver.findElement(By.xpath("//*[@id=\"product-add-to-cart\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"halo-cart-sidebar\"]/div[2]/cart-coupon-discount/div/div[3]/div/div/a")).click();
	}
	@Test(priority=7)
	public void test7()   //select kurta sets under ethnic
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement ethnic=driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/a/span[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(ethnic).perform();
		driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/ul/li[2]/a/span")).click();
		
		
	}
	@Test(priority=8)
	public void test8()throws IOException   //screenshot
	{

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("./screenshot/kurtaset.png"));
	}
}