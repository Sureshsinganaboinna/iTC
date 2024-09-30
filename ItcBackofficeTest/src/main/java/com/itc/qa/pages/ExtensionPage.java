package com.itc.qa.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.itc.qa.base.BaseTest;
public class ExtensionPage extends BaseTest {
	private JavascriptExecutor jsExecutor;
	@FindBy (xpath = "//*[@id='Masterbody']/div[10]/div[@class='cookieinfo-close']")
	WebElement cookies;
	@FindBy (xpath = "//h2[contains(text(),'Extentions')]")
	WebElement extensionText;
	@FindBy (xpath = "//img[@src='Images/newImages/Filter-lines.svg']")
	WebElement imgage;
	@FindBy (id = "imgExtAdd")
	WebElement extAddSymbol;
	@FindBy (xpath = "//h3[contains(text(),'Add New Extension')]")
	WebElement addNewExtensionText;
	@FindBy (xpath = "//*[@id='divAddNewExtTitle']/div/div[1]/p[contains(text(),'Manage your team members and their account permissions here.')]")
	WebElement manageText;
	@FindBy (xpath = "//h4[contains(text(),'Extension Number')]")
	WebElement extensionNumber;
	@FindBy (xpath = "//p[contains(text(),'Extension number can range from 1-9999')]")
	WebElement enterExtNumber;
	@FindBy (id = "btnNewCanelExt")
	WebElement cancelButton;
	@FindBy (id = "btnSaveNewExt")
	WebElement saveButton;
	@FindBy (id = "txtExtensionNo")
	WebElement extTextBox;
	@FindBy (xpath="//h4[contains(text(),'Extension Type')]")
	WebElement extTypeText;
	@FindBy (xpath="//label[contains(text(),'Extension number is required.')]")
	WebElement extnumTextBoxValidation;
	@FindBy (xpath="//label[contains(text(),'Enter values ranging from 1 to 9999.')]")
	WebElement extnumTextBoxValidation1;
	@FindBy (id="divExtensions")
	WebElement clickExtension;
	////////////////////////////////////////////////////////////////////////////
	@FindBy (xpath="//p[contains(text(),'Select the extenstion type')]")
	WebElement extensionTexte;
	@FindBy (xpath="//label[@for='rdbInfo']")
	WebElement radioButtonInfo;
	@FindBy (xpath="//label[@for='rdbInfo']")
	WebElement infomationalText;
	@FindBy (xpath="//*[@id='divTypeInfo']/p[contains(text(),'Play a greeting')]")
	WebElement informational;
	@FindBy (xpath="//img[@src='Images/newImages/Help-icon.svg' and @id='a1']")
	WebElement infomationalToolTip;
	@FindBy (xpath="//h3[contains(text(),'Informational Extension')]")
	WebElement infomationalToolTipTextHead;
	@FindBy (xpath="//*[contains(text(),'The Informational extension can be used to present an audio message for your callers to listen to. A Informational extension is the ultimate tool when it comes to providing Product/Service information, testimonials and other types of information around the clock. This feature is your 24/7 Information Hotline!')]")
	WebElement infomationalToolTipTextDescription;
	///////////////////////////////////////////////
	@FindBy (xpath="//label[@for='rdbMsgTaking']")
	WebElement radioButtonMessageTaking;
	@FindBy (xpath="//label[@for='rdbMsgTaking']")
	WebElement messageTakingText;
	@FindBy (xpath="//img[@src='Images/newImages/Help-icon.svg' and @id='a2']")
	WebElement messageTakingToolTip;
	@FindBy (xpath="//p[contains(text(),'Play a greeting,takes a message')]")
	WebElement messageTaking;
	@FindBy (xpath="//h3[contains(text(),'Message Taking Extension')]")
	WebElement messageTakingToolTipTextHead;
	@FindBy (xpath="//*[contains(text(),'The Message Taking extension can be used to present information and then allow your caller to leave a message. By far the greatest use for this type of extension is for Lead Capture. With a Message Taking extension you can spend a few minutes exciting the caller about your Product or Service 24/7 and then give them an immediate outlet to demonstrate their interest by leaving a message with their contact info for you to call them back.')]")
	WebElement messageTakingToolTipTextDescription;
	////////////////////////////////////////////////
	@FindBy (xpath="//label[@for='rdbPBX']")
	WebElement radioButtonPBx;
	@FindBy (xpath="//label[@for='rdbPBX']")
	WebElement pBXText;
	@FindBy (xpath="//img[@src='Images/newImages/Help-icon.svg' and @id='a3']")
	WebElement pBXToolTip;
	@FindBy (xpath="//p[contains(text(),'Play a greeting, takes a faxes, messages, forward calls, etc.')]")
	WebElement pBXinfo;
	@FindBy (xpath="//h3[contains(text(),'Standard Extension')]")
	WebElement pBXToolTipTextHead;
	@FindBy (xpath="//*[contains(text(),'The standard extension is designed to ring to a specific person rather than a mailbox. You can assign specific standard extensions to each of your employees, departments, sub-contractors and even third party support vendors.')]")
	WebElement pBXToolTipTextDescription;
	////////////////////////////////////
	@FindBy (xpath="//label[@for='rdbACD']")
	WebElement radioButtonACD;
	@FindBy (xpath="//label[@for='rdbACD']")
	WebElement ACDText;
	@FindBy (xpath="//img[@src='Images/newImages/Help-icon.svg' and @id='a23']")
	WebElement ACDToolTip;
	@FindBy (xpath="//p[contains(text(),'A call center with standard extensions as operators')]")
	WebElement ACDinfo;
	@FindBy (xpath="//h3[contains(text(),'Department Extension')]")
	WebElement ACDToolTipTextHead;
	@FindBy (xpath="//*[contains(text(),'A Department type extension is a call center capable of routing calls to any operator (identified by Standard extension).')]")
	WebElement ACDToolTipTextDescription;
	@FindBy (xpath="//h4[contains(text(),'Display Name')]")
	WebElement displayNameTextforInformational;
	@FindBy (id="txtDispName")
	WebElement displayNameTextBox;
	@FindBy (id="a5")
	WebElement displayNameTextBoxToolTip;
	@FindBy (xpath="//h3[contains(text(),'Display Name')]")
	WebElement InformationTooltipInfoforDisplayNameTextBox;
	@FindBy (xpath="//*[contains(text(),'The name of this extension that will appear in the list on the left')]")
	WebElement InformationTooltipInformtionforDisplayNameTextBox;
	//////////////////////////////////////////////
	@FindBy (xpath="//h4[contains(text(),'Description')]")
	WebElement descriptionTextforInformational;
	@FindBy (id="txtExtGreetDesc")
	WebElement descriptionTextBox;
	@FindBy (xpath="//textarea[@placeholder='Enter a description...']")
	WebElement descriptionTextBoxTextArea;
	/////////////////////////////////////////
	@FindBy (xpath="//h4[contains(text(),'Text Back is')]")
	WebElement textBackTextforInformational;
	@FindBy (xpath="//*[@id='divTxtbkhead']/div/div[2]/div/label/div[@class='toggle btn btn-default off']")
	WebElement textBackToggleKey;
	@FindBy (xpath="//label[contains(text(),'Off')]")
	WebElement textBackToggleKey1;
	@FindBy (xpath="//h3[contains(text(),'Text-back')]")
	WebElement textBackToolTipInfo;
	@FindBy (xpath="//*[contains(text(),'You can optionally configure your extension to send an SMS text message to your caller after they hang up. (Only works if the caller is calling from a texting-enabled number, such as a cell phone)')]")
	WebElement textBackToolTipInformation;
	@FindBy (id="a6")
	WebElement textBackToolTip;
	
	public void TclickOnextBackToggleKey() throws InterruptedException
	{
		Thread.sleep(2000);
		 textBackToggleKey1.click();
	}
	public boolean textBackTextforInformational()
	{
		return textBackTextforInformational.isDisplayed();
	}
	public boolean textBackToggleKey()
	{
		return textBackToggleKey.isDisplayed();
	}
	public boolean textBackToolTip()
	{
		return textBackToolTip.isDisplayed();
	}
	public void scrollDown(int pixels) {
        jsExecutor.executeScript("window.scrollBy(0, " + pixels + ");");
    }
	public void scrollToBottom() {
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
	public boolean clickTextBackToolTip()
	{
        cookies.click();
		textBackToolTip.click();
		textBackToolTip.click();
		return textBackToolTip.isDisplayed();
	}
	
	
	
	public boolean descriptionTextforInformational()
	{
		return descriptionTextforInformational.isDisplayed();
	}
	public boolean descriptionTextBox()
	{
		return descriptionTextBox.isDisplayed();
	}
	public boolean descriptionTextBoxTextArea()
	{
		return descriptionTextBoxTextArea.isDisplayed();
	}
	public void enterTextIndescriptionTextBox()
	{
	  descriptionTextBox.sendKeys("Testing Informational Extension by automation script");
	}
	
	
	
	
	
	
	
	
	public boolean displayNameTextforInformationalExt()
	{
		return displayNameTextforInformational.isDisplayed();
	}
	public boolean displayNameTextBoxforInformationalExt()
	{
		return displayNameTextBox.isDisplayed();
	}
	public boolean displayNameTextBoxTooltip()
	{
		displayNameTextBoxToolTip.click();
		return displayNameTextBoxToolTip.isDisplayed();
	}
	public boolean InformationTooltipInfoforDisplayNameTextBoxs()
	{
		return InformationTooltipInfoforDisplayNameTextBox.isDisplayed();
	}
	public boolean InformationTooltipInformtionforDisplayNameTextBoxs()
	{
		return InformationTooltipInformtionforDisplayNameTextBox.isDisplayed();
	}
	public void enterTextondisplayNameTextBox()
	{
		displayNameTextBox.sendKeys("InformationExt@@123");
	}
	
	
	
	
	
	
	
	
	public boolean radioButtonACDext()
	{
		return radioButtonACD.isDisplayed();
	}
	public boolean ACDTexts()
	{
		return ACDText.isDisplayed();
	}
	public boolean ACDinfo()
	{
		return ACDinfo.isDisplayed();
	}
	public boolean ACDToolTip()
	{
		return ACDToolTip.isDisplayed();
	}
	public boolean ACDToolTipTextHead() throws InterruptedException
	{
		ACDToolTip.click();
		Thread.sleep(2000);
		return ACDToolTipTextHead.isDisplayed();
		
	}
	public boolean ACDToolTipTextDescriptions() throws InterruptedException
	{
		Thread.sleep(2000);
		ACDToolTip.click();
		
		return ACDToolTipTextDescription.isDisplayed();
	}
	
	
	
	
	public boolean radioButtonPBxExt()
	{
		return radioButtonPBx.isDisplayed();
	}
	public boolean pBXTexts()
	{
		return pBXText.isDisplayed();
	}
	public boolean pBXinfos()
	{
		return pBXinfo.isDisplayed();
	}
	public boolean pBXToolTips()
	{
		return pBXToolTip.isDisplayed();
	}
	public boolean pBXToolTipTextHead() throws InterruptedException
	{
		pBXToolTip.click();
		Thread.sleep(2000);
		return pBXToolTipTextHead.isDisplayed();
		
	}
	public boolean pBXToolTipTextDescription() throws InterruptedException
	{
		Thread.sleep(2000);
		pBXToolTip.click();
		
		return pBXToolTipTextDescription.isDisplayed();
	}
	
	////////////////////////////////////////
	public boolean radioButtonMessageTakingExt()
	{
		return radioButtonMessageTaking.isDisplayed();
	}
	public boolean messageTakingTexts()
	{
		return messageTakingText.isDisplayed();
	}
	public boolean messageTakingExt()
	{
		return messageTaking.isDisplayed();
	}
	public boolean messageTakingToolTips()
	{
		return messageTakingToolTip.isDisplayed();
	}
	public boolean messageTakingToolTipTextHeads() throws InterruptedException
	{
		messageTakingToolTip.click();
		Thread.sleep(2000);
		return messageTakingToolTipTextHead.isDisplayed();
		
	}
	public boolean messageTakingToolTipTextDescriptions() throws InterruptedException
	{
		Thread.sleep(2000);
		messageTakingToolTip.click();
		
		return messageTakingToolTipTextDescription.isDisplayed();
	}
	
	public boolean extensionText()
	{
		return extensionTexte.isDisplayed();
	}
	public boolean radioButtonInformation()
	{
		return radioButtonInfo.isDisplayed();
	}
	public boolean infomationalTexts()
	{
		return infomationalText.isDisplayed();
	}
	public boolean information()
	{
		return informational.isDisplayed();
	}
	public boolean infomationalToolTips()
	{
		return infomationalToolTip.isDisplayed();
	}
	public boolean infomationalToolTipTextHeads() throws InterruptedException
	{
		infomationalToolTip.click();
		Thread.sleep(2000);
		return infomationalToolTipTextHead.isDisplayed();
		
		
	}
	public boolean infomationalToolTipTextDescriptions() throws InterruptedException
	{
//		Actions act =  new Actions(driver);
//		act.moveToElement(infomationalToolTip).click().perform();
		Thread.sleep(2000);
		infomationalToolTip.click();
		return infomationalToolTipTextDescription.isDisplayed();
	}

///////////////////
	public ExtensionPage()
	{
		 this.jsExecutor = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clickExt()
	{
	 clickExtension.click();
	 extAddSymbol.click();
	}
	
	public boolean verifyExtensionText()
	{
		return extensionText.isDisplayed();
	}
	public boolean verifyImage()
	{
		return imgage.isDisplayed();
	}
	public boolean verifyAddExtensionSymbol() {
		return extAddSymbol.isDisplayed();
	}
	
	public boolean verifyAddExtText()
	{
		return addNewExtensionText.isDisplayed();
	}
	public boolean verifyText()
	{
		return manageText.isDisplayed();
	}
	public boolean verifyExtensionNumberText()
	{
		return extensionNumber.isDisplayed();
	}
	public boolean verifyExtensionNumber()
	{
		return enterExtNumber.isDisplayed();
	}
	public boolean verifyCancelButton()
	{
		return cancelButton.isDisplayed();
	}
	public boolean verifySaveButton()
	{
		return saveButton.isDisplayed();
	}
	public boolean verifyExtTextBox()
	{
		return extTextBox.isDisplayed();
	}
	public boolean verifyExtTypeText()
	{
		return extTypeText.isDisplayed();
	}
	public String verifyExtnumTextBoxValidation()
	{
		saveButton.click();
		return extnumTextBoxValidation.getText();
		
	}
	public String verifyExtnumTextBoxValidation1()
	{
		extTextBox.sendKeys("@@@");
		saveButton.click();
		return extnumTextBoxValidation1.getText();
		
	}
	public void verifyExtnumTextBoxValidation2()
	{
		extTextBox.clear();
		extTextBox.sendKeys("55");
		saveButton.click();
	
	}
	
	
	

}
