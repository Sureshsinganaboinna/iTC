package com.itc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.itc.qa.base.BaseTest;

public class ContactPage extends BaseTest {

	@FindBy (id = "spContacts")
	WebElement contactText;
	
	public ContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean validateContactText()
	{
		return contactText.isDisplayed();
		
	}
	public String contactPageUrl()
	{
		return driver.getCurrentUrl();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
