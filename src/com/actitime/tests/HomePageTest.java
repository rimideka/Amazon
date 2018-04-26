package com.actitime.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.pages.CategoryLanding;
import com.actitime.pages.CheckOut;
import com.actitime.pages.HomePage;
import com.actitime.pages.Selection;
import com.actitime.pages.ShirtStyle;

public class HomePageTest extends BaseTest
{
	
	@Test
	public void checkHomePage(WebDriver driver) 
	
	{
		HomePage h1= new HomePage(driver);
		h1.selectcategory();
		
		CategoryLanding h2= new CategoryLanding(driver);
		h2.selectshirt();
		
		
		ShirtStyle h3= new ShirtStyle(driver);
		h3.selectstyle();
		
		Selection h4= new Selection(driver);
		h4.shirt(driver);
		
		CheckOut c1 = new CheckOut(driver);
		c1.sizeofshirt();
		c1.addToCart();
	}
	
	
			

}
