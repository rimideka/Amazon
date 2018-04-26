package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShirtStyle {
	@FindBy(xpath="//img[@alt='Casual Shirt']")
	private WebElement verityshirt;

	
		
	public ShirtStyle(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	
	}
	
	public void selectstyle()
	{
		verityshirt.click();
		
	}

}
