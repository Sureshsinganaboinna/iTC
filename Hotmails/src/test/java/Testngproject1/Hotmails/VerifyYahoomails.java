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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyYahoomails {
      static int k,j;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");    
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 //WebDriverManager.chromedriver().setup();
		 
	      String url = "https://login.yahoo.com";
	      driver.get(url);

	      driver.manage().window().maximize();
	      
				String pathfile = ".\\Datafiles\\Yahoo.xlsx";
				
				FileInputStream input = new FileInputStream(pathfile);
				
				XSSFWorkbook workbook = new XSSFWorkbook(input);
				
				XSSFSheet sheet = workbook.getSheetAt(0);
				
				
				int Row = sheet.getLastRowNum();
				System.out.println(Row);
				int Cell = sheet.getRow(Row).getLastCellNum();
				System.out.println(Cell);
				
				for(int i=0;i<=Row ; i++)
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
					     driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(cell1.getStringCellValue());
					        Thread.sleep(1000);
					        driver.findElement(By.xpath("//input[@name = 'signin']")).click();
					        Thread.sleep(1000);
					        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(cell.getStringCellValue());
					        Thread.sleep(1500);
					        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
					        Thread.sleep(1000);
					       if(driver.findElements(By.linkText("Remind me later")).size()>0)
					       {
					    	   driver.findElement(By.linkText("Remind me later")).click();
					       }
					        Thread.sleep(1000);
					        
					       if(driver.findElements(By.xpath("//*[contains (@id,'ybarMailLink')]")).size()>0)
					       {
					       driver.findElement(By.xpath("//*[contains (@id,'ybarMailLink')]")).click();
					       }
					        Thread.sleep(1000);
					       
					       
				         	 if(driver.findElements(By.xpath("//span[@title='linda@call-mantra.com']//strong[text()='Linda Butler']")).size()>0)
				         	 {
				         		 
				         		driver.findElement(By.xpath("//span[@title='linda@call-mantra.com']//strong[text()='Linda Butler']")).click();
				         	  Thread.sleep(1000);
				         	   System.out.println("Linda.com---"+ k++);
				         	   sheet.getRow(i).createCell(2).setCellValue(k++-1);
				         	  FileOutputStream input1 = new FileOutputStream(pathfile);
				         		workbook.write(input1);
				         	   
				         	   
				   	        driver.findElement(By.xpath("//a[@data-test-folder-name = 'Inbox']")).click();
				            }
				         	 else {
				 	        	System.out.println("Linda.com has not been received");
				 	        	  sheet.getRow(i).createCell(2).setCellValue("Linda.com has not been received");
					         	  FileOutputStream input1 = new FileOutputStream(pathfile);
					         		workbook.write(input1);
				 	        }
					        Thread.sleep(1000);
					        if(driver.findElements(By.xpath("//span[@title='linda@callmantra.net']//strong[text()='Linda Butler']")).size()>0)
				            {
				         	   driver.findElement(By.xpath("//span[@title='linda@callmantra.net']//strong[text()='Linda Butler']")).click();
				         	  Thread.sleep(1000);
				         	   System.out.println("Linda.net---"+ j++);
				         	  sheet.getRow(i).createCell(3).setCellValue(j++-1);
				         	  FileOutputStream input1 = new FileOutputStream(pathfile);
				         		workbook.write(input1);
				         	   
				   	        driver.findElement(By.xpath("//a[@data-test-folder-name = 'Inbox']")).click();
				            }
					        else {
					        	System.out.println("Linda.net has not been received");
					        	  sheet.getRow(i).createCell(3).setCellValue("Linda.net has not been received");
					         	  FileOutputStream input1 = new FileOutputStream(pathfile);
					         		workbook.write(input1);
					        }
					        Thread.sleep(1000);
				         
					     
							if(driver.findElements(By.xpath("//span[@title='varaprasad@call-mantra.com']")).size()>0)
					        {
					        driver.findElement(By.xpath("//span[@title='varaprasad@call-mantra.com']")).click();
					        Thread.sleep(1000);
					        
					        driver.findElement(By.xpath("//li[@name = 'REPLY' and @role = 'menuitem']")).click();
					        Thread.sleep(1000);
					        driver.findElement(By.xpath("//*[@id='editor-container']/div[1]/div")).sendKeys("Hi ,Who is the end client?");
					        Thread.sleep(1000);
					        driver.findElement(By.xpath("//button[@title = 'Send this email']")).click();
					        Thread.sleep(1000);
					        driver.findElement(By.xpath("//a[@data-test-folder-name = 'Inbox']")).click();
					        System.out.println("Replied from this mail-varaprasad@call-mantra.com-------------------------------------------------"+ cell1.getStringCellValue());
					        Thread.sleep(1000);
					        }

				           
				            
				           if(driver.findElements(By.xpath("//span[@title='purna@callmantra.net']")).size()>0)
				            {
					        driver.findElement(By.xpath("//span[@title='purna@callmantra.net']")).click();
					        Thread.sleep(1000);
					        driver.findElement(By.xpath("//li[@name = 'REPLY' and @role = 'menuitem']")).click();
					        Thread.sleep(1000);
					        driver.findElement(By.xpath("//*[@id='editor-container']/div[1]/div")).sendKeys("Hi ,Who is the end client?");
					        Thread.sleep(1000);
					        driver.findElement(By.xpath("//button[@title = 'Send this email']")).click();
					        Thread.sleep(1000);
					        driver.findElement(By.xpath("//a[@data-test-folder-name = 'Inbox']")).click();
					        System.out.println("Replied from this mail-purna@callmantra.net---------------------------------------------------------"+ cell1.getStringCellValue());
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

					}
	}


