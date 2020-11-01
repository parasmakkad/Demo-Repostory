package com.capsulecrm.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {

	String filepath;
	public ExcelLib(String filepath)
	{
		
		this.filepath=filepath;
	}
	public String readdata(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException
	{
		String value=null;
		File file=new File(filepath);
		FileInputStream fis=new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Cell cl = wb.getSheet(sheetname).getRow(row).getCell(cell);
		switch (cl.getCellType()) {
		case STRING:
			value=cl.getStringCellValue();
			break;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cl))
			{
				SimpleDateFormat sdf=new SimpleDateFormat("DD-MM-YYYY hh:mm:ss");
				value=sdf.format(cl.getDateCellValue());
			}
			else
			{
				
				long num =(long) cl.getNumericCellValue();
				value=""+num;
			}
			break;

		default:
			break;
		}
		return value;
		
	}
	
}
