package Testngproject1.Hotmails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practicing {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Documents\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");    
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 //WebDriverManager.chromedriver().setup();
		 
	      String url = "https://qa.coasecure.com/";
	      driver.get(url);
   //We will use Action Class to generate user event like Right-click an element in Webdriver.
//	      driver.manage().window().maximize();
//	      Actions action = new Actions(driver);
//	      WebElement element = driver.findElement(By.id("btnLogin"));
//	      action.contextClick(element).perform();
     

	}

}
