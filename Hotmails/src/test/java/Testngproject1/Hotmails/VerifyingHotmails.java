package Testngproject1.Hotmails;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingHotmails {

	static int k,j;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");    
		 WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //WebDriverManager.chromedriver().setup();
		 
	      String url = "https://outlook.live.com/owa/?nlp=1";
	      driver.get(url);

	      driver.manage().window().maximize();
	      
				String pathfile = ".\\Datafiles\\Hotmails.xlsx";
				
				FileInputStream input = new FileInputStream(pathfile);
				
				XSSFWorkbook workbook = new XSSFWorkbook(input);
				
				XSSFSheet sheet = workbook.getSheetAt(0);
				
				
				int Row = sheet.getLastRowNum();
				System.out.println(Row);
				int Cell = sheet.getRow(Row).getLastCellNum();
				System.out.println(Cell);
				
//				XSSFWorkbook workbook = new XSSFWorkbook();
//				XSSFSheet sheet1 = workbook.createSheet("Sheet4");

				

				for(int i=1;i<=Row ; i++)
			    {
					XSSFRow Row1 = sheet.getRow(i);
					System.out.println(Row1);
					//for(int t=0;t<Cell;t++)
					//{                                                                                               
					XSSFCell cell1 = Row1.getCell(0);
						cell1.setCellType(cell1.getCellType());
						cell1.getStringCellValue();
					
						System.out.println(cell1.getStringCellValue());
						XSSFCell cell = Row1.getCell(1);
						cell.setCellType(cell1.getCellType());
						cell.getStringCellValue();
					
						System.out.println(cell.getStringCellValue());
//						Thread.sleep(3000);
//						XSSFCell cell2 = Row1.getCell(t+1);
//						cell2.setCellType(cell1.getCellType());
//						cell2.getStringCellValue();
//						System.out.println(cell2.getStringCellValue());
//						Thread.sleep(3000);
			
						
						 
		    	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys(cell1.getStringCellValue());
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys(cell.getStringCellValue());
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//input[@type = 'button']")).click();
	        Thread.sleep(4000);
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,750)", "");
	        Thread.sleep(4000);
	    	 if(driver.findElements(By.xpath("//span[@title='Linda@call-mantra.com']")).size()>0)
	        {
	     	   driver.findElement(By.xpath("//span[@title='Linda@call-mantra.com']")).click();
	     	  System.out.println("Linda.com---"+ k++);
	     	  sheet.getRow(i).createCell(2).setCellValue(k++-1);
         	  FileOutputStream input1 = new FileOutputStream(pathfile);
         		workbook.write(input1);
	     	
	        }
	    	 else
	    	 {
	    		 System.out.println("Linda.com has not been received");
	        	  sheet.getRow(i).createCell(2).setCellValue("Linda.com has not been received");
	         	  FileOutputStream input1 = new FileOutputStream(pathfile);
	         		workbook.write(input1);
	    	 }
	       
	         Thread.sleep(4000);
	         if(driver.findElements(By.xpath("//span[@title='Linda@callmantra.net']")).size()>0)
	         {
	         	 driver.findElement(By.xpath("//span[@title='Linda@callmantra.net']")).click();
	         	 System.out.println("Linda.net---"+ k++);
	         	  sheet.getRow(i).createCell(3).setCellValue(k++-1);
	         	  FileOutputStream input1 = new FileOutputStream(pathfile);
	         		workbook.write(input1);
	         	
	         }
	         else
	         {
	        	 System.out.println("Linda.net has not been received");
	        	  sheet.getRow(i).createCell(3).setCellValue("Linda.net has not been received");
	         	  FileOutputStream input1 = new FileOutputStream(pathfile);
	         		workbook.write(input1);
	         }
	       
	        Thread.sleep(4000);
//	      driver.findElement(By.xpath("//span[@title='purna@callmantra.net']")).click();
//	     Thread.sleep(4000);
	//   
//	     driver.findElement(By.xpath("//button[@aria-label = 'Reply' and @role = 'menuitem']")).click();
//	     Thread.sleep(4000);
//	      driver.findElement(By.xpath("//*[@id='editorParent_1']")).click();
//	      Thread.sleep(4000);
//	      driver.findElement(By.xpath("//*[@id='editorParent_1']")).sendKeys("Hi ,Who is the end client?");
//	     Thread.sleep(4000);
//	     driver.findElement(By.xpath("//button[@aria-label = 'Send']")).click();
	        if(driver.findElements(By.xpath("//span[@title='varaprasad@call-mantra.com']")).size()>0)
	        {
	        driver.findElement(By.xpath("//span[@title='varaprasad@call-mantra.com']")).click();
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//button[@aria-label = 'Reply' and @role = 'menuitem']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"editorParent_1\"]/div/div[1]")).sendKeys("Hi ,Who is the end client?");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//button[@aria-label = 'Send']")).click();
	        System.out.println("varaprasad@call-mantra.com mail was verified----:----" );
	        Thread.sleep(5000);
	        }
	    /*    driver.findElement(By.xpath("//span[@title='Linda@call-mantra.com']")).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//span[@title='Linda@callmantra.net']")).click();
	        Thread.sleep(4000);*/
//	        driver.findElement(By.xpath("//span[@title='varaprasad@call-mantra.com']")).click();
//	     Thread.sleep(4000);
//	     
//	     driver.findElement(By.xpath("//button[@aria-label = 'Reply' and @role = 'menuitem']")).click();
//	     Thread.sleep(4000);
//	     driver.findElement(By.xpath("//*[@id=\"editorParent_1\"]/div/div[1]")).sendKeys("Hi ,Who is the end client?");
//	     Thread.sleep(4000);
//	     driver.findElement(By.xpath("//button[@aria-label = 'Send']")).click();
	        
	        if(driver.findElements(By.xpath("//span[@title='purna@callmantra.net']")).size()>0)
	        {
	        driver.findElement(By.xpath("//span[@title='purna@callmantra.net']")).click();
	        Thread.sleep(4000);
	        
	        driver.findElement(By.xpath("//button[@aria-label = 'Reply' and @role = 'menuitem']")).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//*[@class='elementToProof']")).sendKeys("Hi ,Who is the end client?");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//button[@aria-label = 'Send']")).click();
	        Thread.sleep(5000);
	        System.out.println("purna@callmantra.net mail was verified----:----" );
	        }
	        Thread.sleep(5000);
	       
	     
	         	 if(driver.findElements(By.xpath("//span[@title='Linda@call-mantra.com']")).size()>0)
	             {
	          	   driver.findElement(By.xpath("//span[@title='Linda@call-mantra.com']")).click();
	          	   
	             }
	            
	              Thread.sleep(4000);
	              if(driver.findElements(By.xpath("//span[@title='Linda@callmantra.net']")).size()>0)
	              {
	              	 driver.findElement(By.xpath("//span[@title='Linda@callmantra.net']")).click();
	              	
	              }
	              
	             
			           
	              driver.findElement(By.xpath("//button[@id = 'O365_MainLink_Me']")).click();  
	    //    Thread.sleep(5000);
	      //  driver.findElement(By.xpath("//button[@id = 'O365_MainLink_Me']")).click();
	        
	        Thread.sleep(4000);
	        //driver.findElement(By.xpath("//a[@id = 'mectrl_body_signOut']")).click();
	        driver.findElement(By.xpath("//a[@aria-label = 'Sign in with a different account']")).click();
	      //  driver.findElement(By.xpath("//a[@aria-label = 'Sign in with a different account']")).click();
	                                                        
	
	      // driver.findElement(By.xpath("//a[@id = 'mectrl_body_signOut']")).click();
	   
		    	    }
	        
		      }
	        

	

}
