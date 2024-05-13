package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		//chrome-chromedriver
		//firefox-firefoxdriver
		//edge-edgedriver
		
		ChromeDriver driver=new ChromeDriver();     //object create
		driver.get("https:/www.google.com");        //method used get
		
		String actualtitle=driver.getTitle();
		String exp="Google";
		if(actualtitle.equals(exp))
		{
			System.out.println("comparison pass");
		}
		else
		{
			System.out.println("comparison fail");
		}

	}

}
