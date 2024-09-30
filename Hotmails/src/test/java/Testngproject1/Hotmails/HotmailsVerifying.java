package Testngproject1.Hotmails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;


public class HotmailsVerifying {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty(null, null)
	//	WebDriver wd =new ChromeDriver();
		
		int k = 0;
		for(int j=0; j<10; j++)
		{
			System.setProperty("webdriver.chrome.silentOutput","true");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Documents\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");    
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 //WebDriverManager.chromedriver().setup();
		 
	      String url = "https://outlook.live.com/owa/?nlp=1";
	      driver.get(url);
		
	      driver.manage().window().maximize();
	   
	      String[] mail ={
	    		  "Coanetwork@hotmail.com"
	      };
	     // for (String string : mail
	    	  int numberOfItems = mail.length;
	    	  
	    	    for (int i=0; i<numberOfItems; i++)
	    	    {
	    	        String name = mail[i];
	    	  
	    	    
	    	        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys(name);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("Opl@12311");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type = 'button']")).click();
        Thread.sleep(1000);
        

    	 if(driver.findElements(By.xpath("//span[@title='Linda@call-mantra.com']")).size()>0)
        {
     	   driver.findElement(By.xpath("//span[@title='Linda@call-mantra.com']")).click();
     	
        }
       
         Thread.sleep(1000);
         if(driver.findElements(By.xpath("//span[@title='Linda@callmantra.net']")).size()>0)
         {
         	 driver.findElement(By.xpath("//span[@title='Linda@callmantra.net']")).click();
         	
         }
       
        Thread.sleep(1000);
//      driver.findElement(By.xpath("//span[@title='purna@callmantra.net']")).click();
//     Thread.sleep(1000);
//   
//     driver.findElement(By.xpath("//button[@aria-label = 'Reply' and @role = 'menuitem']")).click();
//     Thread.sleep(1000);
//      driver.findElement(By.xpath("//*[@id='editorParent_1']")).click();
//      Thread.sleep(1000);
//      driver.findElement(By.xpath("//*[@id='editorParent_1']")).sendKeys("Hi ,Who is the end client?");
//     Thread.sleep(1000);
//     driver.findElement(By.xpath("//button[@aria-label = 'Send']")).click();
        if(driver.findElements(By.xpath("//span[@title='varaprasad@call-mantra.com']")).size()>0)
        {
        driver.findElement(By.xpath("//span[@title='varaprasad@call-mantra.com']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//button[@aria-label = 'Reply' and @role = 'menuitem']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"editorParent_1\"]/div/div[1]")).sendKeys("Hi ,Who is the end client?");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@aria-label = 'Send']")).click();
        Thread.sleep(5000);
        }
    /*    driver.findElement(By.xpath("//span[@title='Linda@call-mantra.com']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@title='Linda@callmantra.net']")).click();
        Thread.sleep(1000);*/
//        driver.findElement(By.xpath("//span[@title='varaprasad@call-mantra.com']")).click();
//     Thread.sleep(1000);
//     
//     driver.findElement(By.xpath("//button[@aria-label = 'Reply' and @role = 'menuitem']")).click();
//     Thread.sleep(1000);
//     driver.findElement(By.xpath("//*[@id=\"editorParent_1\"]/div/div[1]")).sendKeys("Hi ,Who is the end client?");
//     Thread.sleep(1000);
//     driver.findElement(By.xpath("//button[@aria-label = 'Send']")).click();
        
        if(driver.findElements(By.xpath("//span[@title='purna@callmantra.net']")).size()>0)
        {
        driver.findElement(By.xpath("//span[@title='purna@callmantra.net']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//button[@aria-label = 'Reply' and @role = 'menuitem']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='elementToProof']")).sendKeys("Hi ,Who is the end client?");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@aria-label = 'Send']")).click();
        Thread.sleep(5000);
        System.out.println("This mail was verified----:----" + name);
        }
        Thread.sleep(5000);
       
     
         	 if(driver.findElements(By.xpath("//span[@title='Linda@call-mantra.com']")).size()>0)
             {
          	   driver.findElement(By.xpath("//span[@title='Linda@call-mantra.com']")).click();
          	   System.out.println("Linda.com---"+ k++);
             }
            
              Thread.sleep(1000);
              if(driver.findElements(By.xpath("//span[@title='Linda@callmantra.net']")).size()>0)
              {
              	 driver.findElement(By.xpath("//span[@title='Linda@callmantra.net']")).click();
              	   System.out.println("Linda.net---"+ j++);
              }
              driver.findElement(By.xpath("//button[@id = 'O365_MainLink_Me']")).click();  
    //    Thread.sleep(5000);
      //  driver.findElement(By.xpath("//button[@id = 'O365_MainLink_Me']")).click();
        
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//a[@id = 'mectrl_body_signOut']")).click();
        driver.findElement(By.xpath("//a[@aria-label = 'Sign in with a different account']")).click();
      //  driver.findElement(By.xpath("//a[@aria-label = 'Sign in with a different account']")).click();
                                                        
        Thread.sleep(1000);
      // driver.findElement(By.xpath("//a[@id = 'mectrl_body_signOut']")).click();
        
	    	    }
        
	      }
        
	}

}
