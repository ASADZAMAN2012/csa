package com.cs.ui.test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	public static FirefoxDriver driver = new FirefoxDriver();
	
	@BeforeTest
	public void start()
	{
		driver.get("http://www.crowdsurge.com/store/index.php?storeid=1227");
		//driver.get("http://www.crowdsurge.com/onerepublic/listings.html");
		
	}
	
	@AfterTest
	public void end() throws Throwable
	{
		Thread.sleep(3000);
		driver.quit();
	}

	

}
