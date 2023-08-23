import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class sampleEx {
	@Test
	public void DataCompareTest() throws Exception	
	{  
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
		Date today=new Date();
		String timestamp=sdf.format(today);
		System.out.println(timestamp);
		//String filePath = "C:\\Users\\santhosh.kumar\\Downloads\\QualidexSam (12).xlsx";
		String filePath1;
		File f;
		String test;
		File htmlFile;
		 String s;
		 Path path;
		 String c;
		 int k=0;
		 FileWriter writer;
		 String filePath = getConfigProperty("ExcelFilePath");
		String executeCell=null;
		if(filePath!=null && filePath!="") {
		File file = new File(filePath);  
		FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
		//creating Workbook instance that refers to .xlsx file  
		XSSFWorkbook wb = new XSSFWorkbook(fis); 
		
		String sheetNo= getConfigProperty("ExcelSheetNo");
		
		if(sheetNo == null || sheetNo == "") 
			{
			sheetNo = "0";
			}
		
		int sheetNumber = Integer.parseInt(sheetNo);
		XSSFSheet sheet = wb.getSheetAt(0);  
		String fileName="";
		String cellValue="";
		Iterator rowIterator = sheet.rowIterator();
		PropertiesConfiguration properties = new PropertiesConfiguration("./Config/TestConfiguration.properties");
		//Properties properties = new Properties();
		//properties.load(new FileInputStream("./Config/TestConfiguration.properties"));
		
	
		for (Row row : sheet) {
			try {
				executeCell = row.getCell(1).getStringCellValue();
			}catch (Exception e) {
			}			
			
			if (executeCell.equals("Y") ) {
				for (int i=2; i<row.getLastCellNum(); i++)
				{
					executeCell = row.getCell(i).getStringCellValue();
				 test = row.getCell(0).getStringCellValue();
					System.out.println(executeCell);
					System.out.println(test);
					
					
					String exsplit =executeCell.replace("\\", " ");
					String ec[]=exsplit.split(" ",7);
//					System.out.println("length"+ec.length);
//					for (String a : ec)
//			            System.out.println(a);
					String testsplit =test.replace("\\", " ");
					String tc[]=testsplit.split(" ",7);
//					System.out.println("length"+tc.length);
//					for (String a : tc)
//			            System.out.println(a);
					System.out.println("ITREATION "+ (k+1));
					properties.setProperty("File_1.pdf", ec[6]);
					properties.setProperty("File_2.pdf", tc[6]);
					properties.save();
					System.out.println("Properties of FILE1 Updated AS :"+properties.getProperty("File_1.pdf"));
					System.out.println("Properties of FILE2 Updated AS :"+properties.getProperty("File_2.pdf"));
					System.out.println("-------- Run Completed--------");
					break;
				}
			}
		}
		
		}}

public static String getConfigProperty(String keyword) {
	Properties properties = new Properties();
	try {
		properties.load(new FileInputStream("./Config/TestConfiguration.properties"));
		
	} catch (FileNotFoundException e) {
		
		Reporter.log("File Not Found Exception thrown while getting value of " + keyword
				+ " from Test Configuration file");
	} catch (IOException e) {
		Reporter.log("IO Exception thrown while getting value of " + keyword + " from Test Configuration file");
	}
	System.out.println(
			"Getting value of " + keyword + " from Test Configuration file : " + properties.getProperty(keyword));
	return properties.getProperty(keyword);
}}
