package com.actitime.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selection {
	@FindBy(xpath="(//h2[contains(.,'Casual Shirt')])[1]")
	private WebElement shirtselected;

	
		
	public Selection(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	
	}
	
	public void shirt(WebDriver driver)
	{
		shirtselected.click();
		Set<String> alltabs = driver.getWindowHandles();
		
		for(String st :alltabs) {
			
			driver.switchTo().window(st);
		
	}

}
}

