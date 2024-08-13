package com.qsp.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public String getStringDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resouces/Excel.xlsx");
		Workbook WorkBook =WorkbookFactory.create(fis);
		return WorkBook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();

	}
	public double getNumberDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resouces/Excel.xlsx");
		Workbook WorkBook =WorkbookFactory.create(fis);
		return WorkBook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();

	}
	public boolean getbooleanDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resouces/Excel.xlsx");
		Workbook WorkBook =WorkbookFactory.create(fis);
		return WorkBook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();

	}
}
