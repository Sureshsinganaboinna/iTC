package com.itc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.itc.qa.base.BaseTest;

public class InboxPage extends BaseTest {
	
	
	@FindBy (xpath = "//*[@id='divContacts']")
	WebElement contactlink;
	
	public InboxPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public ContactPage clickOnContactLink()
	{
		contactlink.click();
		return new ContactPage();
	}
	
	

}
