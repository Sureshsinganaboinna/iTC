package com.itc.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.itc.qa.base.BaseTest;
import com.itc.qa.pages.ExtensionPage;
import com.itc.qa.pages.LoginPage;

public class ExtensionPageTestCases extends BaseTest {
	LoginPage loginPage;
	ExtensionPage extensionPage;
	
	public ExtensionPageTestCases()
	{
		super();
	}
	 @BeforeSuite
		public void setup()
		{
			initilazation();
			loginPage = new LoginPage();
			loginPage.login(prop.getProperty("username"), prop.getProperty("passcode"));
			extensionPage = new ExtensionPage();
			
		}
	 @Test (priority = 1)
		public void verifyTex()
		{
		 extensionPage.clickExt();
		 
		}
	 @Test (priority = 2)
	public void verifyText()
	{
		Assert.assertTrue(extensionPage.verifyExtensionText());
	}
	 @Test(priority = 3)
		public void verifyText1()
		{
		 Assert.assertTrue(extensionPage.verifyImage());
		}
	 @Test(priority = 4)
		public void verifyText2()
		{
		 Assert.assertTrue(extensionPage.verifyImage());
		}
	 @Test(priority = 5)
		public void verifyText3()
		{
		 Assert.assertTrue(extensionPage.verifyAddExtensionSymbol());
		}
	 @Test(priority = 6)
		public void verifyText4()
		{
		 Assert.assertTrue(extensionPage.verifyAddExtText());
		}
	 @Test(priority = 7)
		public void verifyText5()
		{
		 Assert.assertTrue(extensionPage.verifyText());
		}
	 @Test(priority = 8)
		public void verifyText6()
		{
		 Assert.assertTrue(extensionPage.verifyExtensionNumberText());
		}
	 @Test(priority = 9)
		public void verifyText7()
		{
		 Assert.assertTrue(extensionPage.verifyExtensionNumber());
		}
	 @Test(priority = 10)
		public void verifyText8()
		{
		 Assert.assertTrue(extensionPage.verifyCancelButton());
		}
	 @Test(priority = 11)
		public void verifyText9()
		{
		 Assert.assertTrue(extensionPage.verifySaveButton());
		}
	 @Test(priority = 12)
		public void verifyText10()
		{
		 Assert.assertTrue(extensionPage.verifyExtTextBox());
		}
	 @Test(priority = 13)
		public void verifyText11()
		{
		 Assert.assertTrue(extensionPage.verifyExtTypeText());
		}
	 @Test(priority = 14)
		public void verifyValidationofExtension()
		{
		 String validationText = extensionPage.verifyExtnumTextBoxValidation();
	        String actualText = "Extension number is required.";
	        Assert.assertEquals(validationText, actualText, "Invalid Extension number Text box Validation");
		}
	 @Test(priority = 15)
		public void verifyValidationofExtension1()
		{
		 String validationText = extensionPage.verifyExtnumTextBoxValidation1();
	        String actualText = "Enter values ranging from 1 to 9999.";
	        Assert.assertEquals(validationText, actualText, "Invalid Extension number Text box Validation");
		}
	 @Test(priority = 16)
		public void verifyEnterTextIntoTextBox()
		{
		 extensionPage.verifyExtnumTextBoxValidation2();
	       
		}
	 @Test(priority = 17)
		public void extensionTexte()
		{
		 Assert.assertTrue(extensionPage.extensionText());
	       
		}
	 @Test(priority = 18)
		public void radioButtonInfo()
		{
		 Assert.assertTrue(extensionPage.radioButtonInformation());
	       
		}
	 @Test(priority = 19)
		public void infomationalText()
		{
		 Assert.assertTrue(extensionPage.infomationalTexts());
	       
		}
	 @Test(priority = 20)
		public void infomationalToolTip()
		{
		 Assert.assertTrue(extensionPage.infomationalToolTips());
	       
		}
	 @Test(priority = 21)
		public void infomationalToolTipTextHead() throws InterruptedException
		{
		 Assert.assertTrue(extensionPage.infomationalToolTipTextHeads());
	       
		}
	 @Test(priority = 22)
		public void infomationalToolTipTextDescription() throws InterruptedException
		{
		 Assert.assertTrue(extensionPage.infomationalToolTipTextDescriptions());
	       
		}
@Test(priority = 23)
	public void radioButtonMassageTaking()
	{
	 Assert.assertTrue(extensionPage.radioButtonMessageTakingExt());
      
	}
@Test(priority = 24)
	public void messageTakingText()
	{
	 Assert.assertTrue(extensionPage.messageTakingTexts());
      
	}
@Test(priority = 25)
	public void messageTakingToolTip()
	{
	 Assert.assertTrue(extensionPage.messageTakingToolTips());
      
	}	
@Test(priority = 26)
	public void messageTakingToolTipTextHead() throws InterruptedException
	{
	 Assert.assertTrue(extensionPage.messageTakingToolTipTextHeads());
      
	}
@Test(priority = 27)
	public void messageTakingToolTipTextDescription() throws InterruptedException
	{
	 Assert.assertTrue(extensionPage.messageTakingToolTipTextDescriptions());
      
	}
	 ////////////////
@Test(priority = 28)
public void radioButtonPBxExts()
{
 Assert.assertTrue(extensionPage.radioButtonPBxExt());
  
}
@Test(priority = 29)
public void pBXTextss()
{
 Assert.assertTrue(extensionPage.pBXTexts());
  
}
@Test(priority = 30)
public void pBXinfoss()
{
 Assert.assertTrue(extensionPage.pBXinfos());
  
}	
@Test(priority = 31)
public void pBXToolTipss()
{
 Assert.assertTrue(extensionPage.pBXToolTips());
  
}	
@Test(priority = 32)
public void pBXToolTipTextHeads() throws InterruptedException
{
 Assert.assertTrue(extensionPage.pBXToolTipTextHead());
  
}
@Test(priority = 33)
public void pBXToolTipTextDescriptions() throws InterruptedException
{
 Assert.assertTrue(extensionPage.pBXToolTipTextDescription());
  
}
@Test(priority = 34)
public void messageTakingexts()
{
 Assert.assertTrue(extensionPage.messageTakingExt());
  
}
@Test(priority = 35)
public void informationalexts()
{
 Assert.assertTrue(extensionPage.information());
  
}
////////////////
@Test(priority = 36)
public void radioButtonACDexts()
{
Assert.assertTrue(extensionPage.radioButtonACDext());

}
@Test(priority = 37)
public void ACDTextss()
{
Assert.assertTrue(extensionPage.ACDTexts());

}
@Test(priority = 38)
public void ACDinfo()
{
Assert.assertTrue(extensionPage.ACDinfo());

}	
@Test(priority = 39)
public void ACDToolTips()
{
Assert.assertTrue(extensionPage.ACDToolTip());

}	
@Test(priority = 40)
public void ACDToolTipTextHead() throws InterruptedException
{
Assert.assertTrue(extensionPage.ACDToolTipTextHead());

}
@Test(priority = 41)
public void ACDToolTipTextDescriptions() throws InterruptedException
{
Assert.assertTrue(extensionPage.ACDToolTipTextDescriptions());

}
@Test(priority = 42)
public void displayNameTextforInformationalExt()
{
Assert.assertTrue(extensionPage.displayNameTextforInformationalExt());

}
@Test(priority = 43)
public void displayNameTextBoxforInformationalExt()
{
Assert.assertTrue(extensionPage.displayNameTextBoxforInformationalExt());

}	
@Test(priority = 44)
public void displayNameTextBoxTooltip()
{
Assert.assertTrue(extensionPage.displayNameTextBoxTooltip());

}	
@Test(priority = 45)
public void InformationTooltipInfoforDisplayNameTextBoxs()
{
Assert.assertTrue(extensionPage.displayNameTextBoxTooltip());

}	
@Test(priority = 46)
public void enterTextondisplayNameTextBox()
{
extensionPage.enterTextondisplayNameTextBox();

}	
@Test(priority = 47)
public void descriptionTextforInformational()
{
Assert.assertTrue(extensionPage.descriptionTextforInformational());

}	
@Test(priority = 48)
public void descriptionTextBox()
{
Assert.assertTrue(extensionPage.descriptionTextBox());

}	
@Test(priority = 49)
public void descriptionTextBoxTextArea()
{
Assert.assertTrue(extensionPage.descriptionTextBoxTextArea());

}	
@Test(priority = 50)
public void enterTextIndescriptionTextBox()
{
	extensionPage.scrollDown(1500);
	//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1500)");
extensionPage.enterTextIndescriptionTextBox();
}
@Test(priority = 51)
public void textBackTextforInformational()
{
Assert.assertTrue(extensionPage.descriptionTextforInformational());

}	
@Test(priority = 52)
public void textBackToggleKey()
{
	extensionPage.scrollDown(1500);
	// ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1500)");
Assert.assertTrue(extensionPage.textBackToggleKey());

}	
@Test(priority = 53)
public void textBackToolTip()
{
	
Assert.assertTrue(extensionPage.textBackToolTip());
}
@Test(priority = 54)
public void testScrollToBottom()
{
	extensionPage.scrollDown(1500);
   // ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1500)");
}

@Test(priority = 55)
public void clickTextBackToolTip()
{
	
Assert.assertTrue(extensionPage.clickTextBackToolTip());
} 
@Test(priority = 56)
public void TclickOnextBackToggleKey() throws InterruptedException
{
extensionPage.TclickOnextBackToggleKey();
extensionPage.scrollDown(1500);
} 




}
