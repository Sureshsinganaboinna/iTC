package Testngproject1.Hotmails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReplayingYahooMails {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int k = 0;
		int j = 0;
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");    
			 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 //WebDriverManager.chromedriver().setup();
			 
		      String url = "https://login.yahoo.com";
		      driver.get(url);

		      driver.manage().window().maximize();
		      WebDriverWait w = new WebDriverWait(driver, 60);
	   	   
		      String[] mail = {
		    		
		    		
		    		  "rakshit404@yahoo.com",
		    		  "gandhiram15@yahoo.com",
		    		  "nageshbabu39@yahoo.com",
		    		  "kanthravi31@yahoo.com",
		    		  "rajarao03@yahoo.in",
		    		  "doydray@yahoo.com",

		    		  
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
	        int vara = 0;
            for(int v = 0;v>=vara;v++)
            {
            if(driver.findElements(By.xpath("//*[text()='Varaprasad, me, varaprasad']")).size()>0)
            {
	        driver.findElement(By.xpath("//*[text()='Varaprasad, me, varaprasad']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//li[@name = 'REPLY' and @role = 'menuitem']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id='editor-container']/div[1]/div")).sendKeys("Hi ,Who is the end client?");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[@title = 'Send this email']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//a[@data-test-folder-name = 'Inbox']")).click();
	        System.out.println("Replied from this mail-varaprasad@call-mantra.com-------------------------------------------------"+ name);
	        Thread.sleep(1000);
	        vara++;
            }
            }
            Thread.sleep(2000);
	        int purna = 0;
	        for(int s=0;s>=purna ;s++)
	        {
	        if(driver.findElements(By.xpath("//*[text()='Purna, me, purna']")).size()>0)
	        {
	        driver.findElement(By.xpath("//*[text()='Purna, me, purna']")).click();
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath("//li[@name = 'REPLY' and @role = 'menuitem']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id='editor-container']/div[1]/div")).sendKeys("Hi ,Who is the end client?");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[@title = 'Send this email']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//a[@data-test-folder-name = 'Inbox']")).click();
	        System.out.println("Replied from this mail-purna@callmantra.net---------------------------------------------------------"+ name);
	        Thread.sleep(1000);
	        purna++;
	        }
	        }
        
            driver.findElement(By.xpath("//*[contains (@id,'ybarAccountMenuOpener')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[contains (text(), 'Sign out')]")).click();
	        Thread.sleep(1000);
	       
	       
	        Thread.sleep(1000);
	        if(driver.findElements(By.xpath("//a[@id = 'ymail']")).size()>0)
		       {
		    	   driver.findElement(By.xpath("//a[@id = 'ymail']")).click();
		       }
	        Thread.sleep(1000);
	       if(driver.findElements(By.xpath("//*[contains (@data-redirect-params, 'pspid=[[pspid]]&activity=ybar-signin')]")).size()>0)
	       {
	       driver.findElement(By.xpath("//*[contains (@data-redirect-params, 'pspid=[[pspid]]&activity=ybar-signin')]")).click();
	       }
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//label[@class = 'icon-vertical-ellipsis svg-bg']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[@data-action = 'remove-account']")).click();
	      
	}

}}
