package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage
{
	//declaration
	private WebDriver driver;

	// initialization
	public Basepage(WebDriver driver) 
	{
		this.driver = driver; 
	}
	
	//utilization
	
	public void verifyTitle(String eTitle) {
		
		try {
			
		WebDriverWait wait = new WebDriverWait(driver, 10);
				
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("title is maatching"+eTitle);
	}
		catch (Exception e)
	{
		Reporter.log("Title is not matching:", true);
		Reporter.log("Actual Title is :"+driver.getTitle()+"Actual Title is :"+eTitle, true );
	Assert.fail();
	}
}
}
