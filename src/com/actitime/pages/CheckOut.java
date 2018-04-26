package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOut {
	
	@FindBy(id="native_dropdown_selected_size_name")
	private WebElement size;
	
	@FindBy(id="add-to-cart-button")
	private WebElement addCart;

	
		
	public CheckOut(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	
	}
	
	public void sizeofshirt()
	{
		Select sel = new Select(size);
		sel.selectByVisibleText(" Medium ");
		
	}
	
	public void addToCart() {
		addCart.click();
	}



}
