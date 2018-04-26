package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryLanding {
	@FindBy(xpath="//a[.='Shirts']")
	private WebElement selectshirt;

	
		
	public CategoryLanding(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	
	}
	
	public void selectshirt()
	{
		selectshirt.click();
		
	}

}


