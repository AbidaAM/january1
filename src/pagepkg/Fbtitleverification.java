package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbtitleverification {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	WebElement createlink;
	
	
	public Fbtitleverification(WebDriver driver)
	{
		this.driver=driver;                     //creating constructor
		PageFactory.initElements(driver,this);     
	}
	public void createlinkclick()
	{
		createlink.click();
	}
	public String titleverification()
	{
	String actual=driver.getTitle();
	return actual;
		
		
	}
	
	

}
