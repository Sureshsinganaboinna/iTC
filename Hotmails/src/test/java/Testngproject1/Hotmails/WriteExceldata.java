package Testngproject1.Hotmails;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExceldata {
	//String pathfile = ".\\Hotmails\\Datafiles\\Book5.xlsx";
	public static void main(String[] args) throws IOException {
		
	
	//FileInputStream input = new FileInputStream(pathfile);
	
//	File file = new File(".\\Datafiles\\Hotmails.xlsx");
//	String pathfile = ".\\Datafiles\\Hotmails.xlsx";
//	FileOutputStream file = new FileOutputStream(pathfile);
//	XSSFWorkbook workbook = new XSSFWorkbook();

	String pathfile = ".\\Datafiles\\Hotmails.xlsx";
	
	FileInputStream input = new FileInputStream(pathfile);
	
	XSSFWorkbook workbook = new XSSFWorkbook(input);
	
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	//XSSFSheet sheet = workbook.getSheet("Sheet1");
//	XSSFSheet sheet = workbook.getSheetAt(1);
	//sheet.createRow(0).createCell(2).setCellValue("Pass");

	sheet.getRow(0).createCell(2).setCellValue("Pass");
	sheet.getRow(1).createCell(2).setCellValue("Pass");
	sheet.getRow(2).createCell(2).setCellValue("Pass");
//	sheet.createRow(0).createCell(1).setCellValue("Old");
//	sheet.createRow(2).createCell(2).setCellValue("Age");
	//XSSFCell cell = cell.setCellValue("Hello World!");

	FileOutputStream input1 = new FileOutputStream(pathfile);
	workbook.write(input1);
	
}
}

