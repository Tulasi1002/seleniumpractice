package Ddt;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ddt {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream f= new FileInputStream("./excel/sheet.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		String s=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(s);
		
		

	}

}
