package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void test()
	{
		Actions act=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		act.dragAndDrop(drag, drop).perform();
		WebElement a=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		act.dragAndDrop(a, b).perform();
		WebElement c=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement d=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		act.dragAndDrop(c, d).perform();
		WebElement e=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement f=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		act.dragAndDrop(e, f).perform();
		WebElement display=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		String s=display.getText();
		if(s.equals("Perfect!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}



