package Testngproject1.Hotmails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multipletabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int k = 0;
		int j= 0;
	
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");    
		 WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //WebDriverManager.chromedriver().setup();
		 
	      String url = "https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1687365059&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d3f70a67f-f4a9-708d-374a-fc715180b5fa&id=292841&aadredir=1&whr=hotmail.com&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015";
	      driver.get(url);

	      driver.manage().window().maximize();
	      WebDriverWait w = new WebDriverWait(driver, 60);
   	   
	      String[] mail = {
	    		  "pallapraveen123@hotmail.com","yaswanthyashu123@hotmail.com","rameshandugula123@hotmail.com","ramanamv123@hotmail.com","leelacoa123@hotmail.com","swamisana123@hotmail.com","priyankacoa123@hotmail.com","vasundaracoa123@hotmail.com","nikhilcoa123@hotmail.com","sureshqa123@hotmail.com","leeladeveloper123@hotmail.com","chinna_palla@hotmail.com","varaprasad_neerukattu123@hotmail.com"
	    	};
	      
	     // for (String string : mail) {
	    	  int numberOfItems = mail.length;
	    	  
	    	    for (int i=0; i<numberOfItems; i++)
	    	    {

	    			
	    	        String name = mail[i];
	    	        System.out.println("Hello " + name);
	    	  
	    	    
	    	        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys(name);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("coa@1122");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type = 'button']")).click();
        Thread.sleep(3000);

        if(driver.findElements(By.xpath("//*[text()='purna; Purna COA']")).size()>0)
        {
        driver.findElement(By.xpath("//*[text()='purna; Purna COA']")).click();//*[text()='Varaprasad COA']
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("//button[@aria-label = 'Reply' and @role = 'menuitem']")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id=\"editorParent_1\"]/div/div[1]")).sendKeys("Hi ,Who is the end client?");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//button[@aria-label = 'Send']")).click();
      
        }
          if(driver.findElements(By.xpath("//*[text()='varaprasad; Varaprasad COA']")).size()>0) {
        
        driver.findElement(By.xpath("//*[text()='varaprasad; Varaprasad COA']")).click();
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("//button[@aria-label = 'Reply' and @role = 'menuitem']")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@class='elementToProof']")).sendKeys("Hi ,Who is the end client?");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//button[@aria-label = 'Send']")).click();
        }
        
        if(driver.findElements(By.xpath("//*[text()='varaprasad' and @title = 'varaprasad@Call-Mantra.com']")).size()>0)
        {
           driver.findElement(By.xpath("//*[text()='varaprasad' and @title = 'varaprasad@Call-Mantra.com']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//button[@aria-label = 'Reply' and @role = 'menuitem']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"editorParent_1\"]/div/div[1]")).sendKeys("Hi ,Who is the end client?");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@aria-label = 'Send']")).click();
        
        }
       if(driver.findElements(By.xpath("//*[text()='purna' and @title = 'purna@CallMantra.net']")).size()>0)
       {
       driver.findElement(By.xpath("//*[text()='purna' and @title = 'purna@CallMantra.net']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//button[@aria-label = 'Reply' and @role = 'menuitem']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='elementToProof']")).sendKeys("Hi ,Who is the end client?");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@aria-label = 'Send']")).click();
      
       }
     
        //alertIsPresent() condition applied
       
      //  driver.switchTo().alert().dismiss();
 
         Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id = 'O365_MainLink_Me']")).click();
        //    Thread.sleep(5000);
          //  driver.findElement(By.xpath("//button[@id = 'O365_MainLink_Me']")).click();
            
            Thread.sleep(5000);
            //driver.findElement(By.xpath("//a[@id = 'mectrl_body_signOut']")).click();
          /*   if(driver.findElements(By.xpath("//a[@aria-label = 'Sign in with a different account']")).size()>0)
           {
        	   driver.findElement(By.xpath("//a[@aria-label = 'Sign in with a different account']")).click();
        	   driver.switchTo().alert().accept();
        	   
           }*/
           driver.findElement(By.xpath("//a[@aria-label = 'Sign in with a different account']")).click();
           
           System.out.println("This mail was verified----:----" + name);
//        driver.findElement(By.xpath("//a[@aria-label = 'Sign in with a different account']")).click();
//        Thread.sleep(1000);
          //driver.switchTo().alert().dismiss();

        /*driver.findElement(By.xpath("//button[@id = 'O365_MainLink_Me']")).click();
        Thread.sleep(1000);
       
      
        driver.findElement(By.xpath("//a[@id = 'mectrl_body_signOut']")).click();
        Thread.sleep(1000);*/
	    	    }
        
	      }
        
	}


