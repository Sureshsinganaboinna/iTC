package com.itc.qa.base;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.itc.qa.util.TestUtil;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseTest()
	{
		try
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Spring\\eclipse-workspace\\ItcBackofficeTest\\src\\main\\java\\com\\itc\\qa\\config\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void initilazation()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			  ChromeOptions options = new ChromeOptions();
	          options.addArguments("--use-fake-ui-for-media-stream");
	          options.addArguments("--disable-notifications");
	          System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
			    //  driver = new ChromeDriver();
				// WebDriverManager.chromedriver().setup();
			      driver = new ChromeDriver(options);
			     
			 driver.manage().window().maximize();
			 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITY_LOAD, TimeUnit.SECONDS);
			 driver.get(prop.getProperty("url"));
		
		}
		
	}
	

}
