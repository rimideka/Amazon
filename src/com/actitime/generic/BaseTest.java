package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public abstract class Basetest implements AutoConstant
	{
		public WebDriver driver;
		
		@BeforeMethod
		public void precondition() {
			System.setProperty(gecko_key, gecko_value);		
			
			driver = new FirefoxDriver(); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
			
			
			
			driver.get("https://www.amazon.in/");
		}


}
}
