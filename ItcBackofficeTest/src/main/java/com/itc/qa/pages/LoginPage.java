package com.itc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.itc.qa.base.BaseTest;

public class LoginPage extends BaseTest {
	
	//Page Factory == OR
	@FindBy(name="txtPhone")
	WebElement username;
	@FindBy(name = "txtPasscode")
	WebElement passcode;
	@FindBy(name = "btnSubmit")
	WebElement loginbutton;
	@FindBy(xpath = "//img[contains(@id,'imgLogo')]")
	WebElement itclogo;
	
	
	//Initializiing the Page Objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//Actions
	public String validatePageTitle()
	{
		return driver.getTitle();
	}
	public boolean validateItcLogo()
	{
		return itclogo.isDisplayed();
	}
	public InboxPage login(String un, String pwd)
	{
		username.sendKeys(un);
		passcode.sendKeys(pwd);
		loginbutton.click();
		return new InboxPage();
	}
	

}
