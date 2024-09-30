package Testngproject1.Hotmails;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Singanaboina Suresh\\Documents\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");    
		 WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //WebDriverManager.chromedriver().setup();
		 
	      String url = "https://coasecure.com/";
	      driver.get(url);

	      driver.manage().window().maximize();
	      
				String pathfile = ".\\Datafiles\\Hotmails domain.xlsx";
				
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
				    driver.findElement(By.id("txtEmail")).clear();
				    Thread.sleep(1000);
					driver.findElement(By.id("txtEmail")).sendKeys(cell1.getStringCellValue());
                      Thread.sleep(1000);
                      driver.findElement(By.id("txtPassCode")).clear();
                      Thread.sleep(1000);
						driver.findElement(By.id("txtPassCode")).sendKeys(cell.getStringCellValue());
						Thread.sleep(1000);
						driver.findElement(By.id("btnLogin")).click();	 
					
				}

	}

}
