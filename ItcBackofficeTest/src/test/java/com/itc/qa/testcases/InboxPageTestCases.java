package com.itc.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.itc.qa.base.BaseTest;
import com.itc.qa.pages.InboxPage;
import com.itc.qa.pages.LoginPage;

public class InboxPageTestCases extends BaseTest {
	   LoginPage loginPage;
	
	public InboxPageTestCases()
	{
		super();
	}
	
	  @BeforeSuite
		public void setup()
		{
			initilazation();
			loginPage = new LoginPage();
			loginPage.login(prop.getProperty("username"), prop.getProperty("passcode"));
		}
	  @Test
	  public void validateContactPageUrl()
	  {
		  InboxPage inboxPage = new InboxPage();
		  inboxPage.clickOnContactLink();
		 String contactPageUrl =  driver.getCurrentUrl();
		 Assert.assertEquals(contactPageUrl, "https://backoffice.itelecenter.com/Contacts.aspx");
	  }
	

}
