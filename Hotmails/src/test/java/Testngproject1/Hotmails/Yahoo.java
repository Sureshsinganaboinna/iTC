package Testngproject1.Hotmails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");    
		 WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //WebDriverManager.chromedriver().setup();
		 
	      String url = "https://login.yahoo.com";
	      driver.get(url);

	      driver.manage().window().maximize();
	      WebDriverWait w = new WebDriverWait(driver, 60);
  	   
	      String[] mail = {"sasikiran_90@yahoo.com",
	    		  "prembabu1468@yahoo.com",
	    		  "rakshit404@yahoo.com",
	    		  "gandhiram15@yahoo.com",
	    		  "nageshbabu39@yahoo.com",
	    		  "kanthravi31@yahoo.com",
	    		  "rajarao03@yahoo.in",
	    		  "doydray@yahoo.com",
	    		  "samanthaarora60@yahoo.com",
	    		  "coa.shankar@yahoo.com",
	    		  "coa.trivita@yahoo.com",
	    		  "srikanth_coa@yahoo.com",
	    		  "coa_vara@yahoo.com",
	    		  "nareshcoa@ymail.com",
	    		  "prkanth@rocketmail.com",
	    		  
	    	};
	      
	     // for (String string : mail) {
	    	  int numberOfItems = mail.length;
	    	  
	    	    for (int i=0; i<numberOfItems; i++)
	    	    {

	    			
	    	        String name = mail[i];
	    	        System.out.println("Hello " + name);
	    	  
	    	        Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(name);
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@name = 'signin']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("india@6011");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//button[@type = 'submit']")).click();
       Thread.sleep(1000);
      if(driver.findElements(By.linkText("Remind me later")).size()>0)
      {
   	   driver.findElement(By.linkText("Remind me later")).click();
      }
       Thread.sleep(1000);
       
       driver.findElement(By.xpath("//*[contains (@id,'ybarMailLink')]")).click();
       Thread.sleep(2000);
       int lind=0;
       for(int j=0;j<=lind;j++)
       {
    	  
      if(driver.findElements(By.xpath("//ul[@role = 'list']/li["+7+j+"]//a/div/div/div[3]/span[@title='linda@callmantra.net']/strong[@id='senders.bolded_sender_label']")).size()>0);
      {
    	WebElement web =  driver.findElement(By.xpath("//ul[@role = 'list']/li["+7+j+"]//a/div/div/div[3]/span[@title='linda@callmantra.net']/strong[@id='senders.bolded_sender_label']"));
    System.out.println(web.getText());
      }
    lind++;
       }
      
    /*Thread.sleep(2000);
    WebElement web1 = driver.findElement(By.xpath("//ul[@role = 'list']/li[10]//a/div/div/div[3]/span[@title='linda@call-mantra.com']/strong[@id='senders.bolded_sender_label']"));
  System.out.println(web1.getText());*/
  
    
    
    
    	/* if(driver.findElements(By.xpath("//span[@title='linda@call-mantra.com']")).size()>0)
    	 {
    		 
    		driver.findElement(By.xpath("//span[@title='linda@call-mantra.com']")).click();
    	  Thread.sleep(1000);
   
    	   
    	   
	        driver.findElement(By.xpath("//a[@data-test-folder-name = 'Inbox']")).click();
	}*/
	    	    }}
}
