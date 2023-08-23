import java.awt.Desktop;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class EXcel {
		@Test
		public void DataCompareTest() throws Exception	
		{  
			
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
			Date today=new Date();
			String timestamp=sdf.format(today);
			System.out.println(timestamp);
			String filePath = "C:\\Users\\santhosh.kumar\\Downloads\\QualidexSam (8).xlsx";
			String filePath1;
			File f;
			String test;
			File htmlFile;
			 String s;
			 Path path;
			 String c;
			 FileWriter writer;
			String executeCell=null;
			if(filePath!=null && filePath!="") {
			File file = new File(filePath);  
			FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
			//creating Workbook instance that refers to .xlsx file  
			XSSFWorkbook wb = new XSSFWorkbook(fis); 
			
			//String sheetNo= getConfigProperty("ExcelSheetNo");
			
//			if(sheetNo == null || sheetNo == "") 
//				{
//				sheetNo = "0";
//				}
//			
//			int sheetNumber = Integer.parseInt(sheetNo);
			XSSFSheet sheet = wb.getSheetAt(0);  
			String fileName="";
			String cellValue="";
			Iterator rowIterator = sheet.rowIterator();
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
						System.out.println("length"+ec.length);
						for (String a : ec)
				            System.out.println(a);
						String testsplit =test.replace("\\", " ");
						String tc[]=testsplit.split(" ",7);
						System.out.println("length"+tc.length);
						for (String a : tc)
				            System.out.println(a);
						 filePath1 = System.getProperty("user.dir") + "\\Extract_Images\\" + ec[6].replace(".pdf", " ")+"_"+ tc[6].replace(".pdf", " ")+"_difference.html";
						// s=System.getProperty("user.dir") + "\\Extract_Images\\" +(new java.sql.Date(today.getTime()))+"-"+ ec[6].replace(".pdf", " ")+"_"+ tc[6].replace(".pdf", " ")+"_"+"_difference.html";
						 s=System.getProperty("user.dir") + "\\Extract_Images\\" +timestamp+"-"+ ec[6].replace(".pdf", " ")+"_"+ tc[6].replace(".pdf", " ")+"_"+"_difference.html";
						 System.out.println(filePath1);
						 System.out.println(s);
						  f = new File(filePath1);
						  htmlFile = new File(s);
						  if (f.createNewFile()) {  
							    System.out.println("File " + f.getName() + " is created successfully.");
							    System.out.println(f.getAbsolutePath());
							} else {  
							    System.out.println("File is already exist in the directory. so Create new file with date");  
							    
								htmlFile.createNewFile();							    
								System.out.println("File created");
								System.out.println("File " + htmlFile.getName() + " is created successfully.");
							    System.out.println(htmlFile.getAbsolutePath());
							} 
						  System.out.println("filelength"+f.length());
						  System.out.println("Timestampfile length"+htmlFile.length());
						  
						  if (f.length() == 0) {
						      System.out.println("File is empty after creating it...");
						       path = Paths.get(filePath1);
						       
						       c="JAVA IS PROGRAMMING LANGUAGE";
						       // with path , content & standard charsets
									Files.writeString(path, c.replaceAll("&para;", ""), StandardCharsets.UTF_8);
						      Desktop.getDesktop().browse(f.toURI());
						      
						    } 
						  else  {
						      System.out.println("File is not empty after creation...");
						      path = Paths.get(s);
						      c="JAVA IS one of the PROGRAMMING LANGUAGE ";
						      Files.writeString(path, c.replaceAll("&para;", ""), StandardCharsets.UTF_8);
						      Desktop.getDesktop().browse(htmlFile.toURI());
							}

						    
						
						//compareTwoFiles(test, executeCell);
						System.out.println("-------- Run Completed--------");
						break;
					}
				}
			}
			
			}}}
	    






