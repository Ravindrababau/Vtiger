package PageObjectModel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceloperation {
	public static String testGetData(String Sheet1,int i, int j) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("F:\\TestData//VtigerPOM.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		String s1=w1.getSheet(Sheet1).getRow(i).getCell(j).getStringCellValue();
		return s1;
	}
	}



