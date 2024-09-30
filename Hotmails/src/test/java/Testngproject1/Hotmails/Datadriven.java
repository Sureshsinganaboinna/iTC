package Testngproject1.Hotmails;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {

	 private static XSSFWorkbook workbook;
	    private static XSSFSheet sheet;
	    private static XSSFRow row;
	    private static XSSFCell cell;
	    
	    public void setExcelFile(String excelFilePath,String sheetName) throws IOException {
	        //Create an object of File class to open xls file
	        File file =    new File(excelFilePath);
	        
	        //Create an object of FileInputStream class to read excel file
	        FileInputStream inputStream = new FileInputStream(file);
	        
	        //creating workbook instance that refers to .xls file
	        workbook=new HSSFWorkbook(inputStream);
	        
	        //creating a Sheet object
	         sheet=workbook.getSheet(sheetName);
	         
	         String pathfile = ".\\Datafiles\\Hotmails domain.xlsx";
	 		
	 		FileInputStream input = new FileInputStream(pathfile);
	 		
	 		XSSFWorkbook workbook = new XSSFWorkbook(input);
	 		
	 		XSSFSheet sheet = workbook.getSheetAt(0);

	    }
	
	
}
