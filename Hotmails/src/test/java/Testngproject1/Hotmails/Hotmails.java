package Testngproject1.Hotmails;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hotmails {
	
	 private static XSSFWorkbook workbook;
	    private static XSSFSheet sheet;
	    private static XSSFRow row;
	    private static XSSFCell cell;

	public static void main(String[] args) throws IOException {
		
		String pathfile = ".\\Datafiles\\Hotmails domain.xlsx";
		
		FileInputStream input = new FileInputStream(pathfile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int Row = sheet.getLastRowNum();
		int Cell = sheet.getRow(Row).getLastCellNum();
		
		 
	
	public int getRowCountInSheet(){
	       int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	       return rowcount;
	    } 
		/*for(int i = 0 ;i<=Row; i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			for(int col = 0; col<=Cell; col++)
			{
				XSSFCell cell = row.getCell(col);
				Switch(cell.getCellType());
				{
					case ;
					row.getCell(col).getStringCellValue();
					
				}
				
			}
		}*/
		
			
		
			
		
	}
	


}
