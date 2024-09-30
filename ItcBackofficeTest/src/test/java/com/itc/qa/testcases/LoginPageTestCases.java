package com.itc.qa.testcases;

import org.testng.Assert;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.itc.qa.base.BaseTest;
import com.itc.qa.pages.ContactPage;
import com.itc.qa.pages.InboxPage;
import com.itc.qa.pages.LoginPage;

public class LoginPageTestCases extends BaseTest {
	 
	LoginPage loginPage;
	 InboxPage inboxPage;
	  ContactPage contactPage;
	
  public LoginPageTestCases()
  {
	  super();
  }
	
  @BeforeSuite
	public void setup()
	{
		initilazation();
		loginPage = new LoginPage();
		  inboxPage = new InboxPage();
		  contactPage = new ContactPage();
	}
	@Test(priority = 1)
	public void validatePageTitle()
	{
		String titlePage = loginPage.validatePageTitle();
		Assert.assertEquals(titlePage, "Member Login");
	}
	@Test (priority = 2)
	public void validateItcLogo()
	{
		boolean itclogo = loginPage.validateItcLogo();
		Assert.assertTrue(itclogo);
	}
	@Test (priority = 3)
	public void loginPageTest()
	{
		inboxPage = loginPage.login(prop.getProperty("username"), prop.getProperty("passcode"));
		String InboxUrl = driver.getCurrentUrl();
		Assert.assertEquals(InboxUrl, "https://backoffice.itelecenter.com/Inbox.aspx");
		//return new InboxPageTestCases();
	}
	  @Test (priority = 4)
	  public void validateContactClick()
	  {
		//  InboxPage inboxPage = new InboxPage();
		   inboxPage.clickOnContactLink();
		
	  }
	  @Test(priority = 5)
	  public void validatePageUrl()
	  {
		  Assert.assertEquals(contactPage.contactPageUrl(), "https://backoffice.itelecenter.com/Contacts.aspx");
	  }
	  @Test (priority = 6)
	  public void validateContactText()
	  {
		  boolean contacttext=  contactPage.validateContactText();
		  Assert.assertTrue(contacttext);
	  }
	  
  /* @AfterMethod
   public void tearDown()
   {
	   driver.close();
   }*/
}
