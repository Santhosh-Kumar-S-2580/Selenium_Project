package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\santhosh.kumar\\Downloads\\Book.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook xsf=new XSSFWorkbook(fis);
		XSSFSheet sht=xsf.getSheetAt(0);
		String entry=sht.getRow(1).getCell(1).getStringCellValue();
		System.out.println("The data in the box is "  + sht.getRow(1).getCell(0).getStringCellValue());
		System.out.println("The data in the box is "  + sht.getRow(1).getCell(1).getStringCellValue());
		xsf.close();
	}

}
