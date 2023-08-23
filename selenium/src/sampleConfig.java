import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sampleConfig {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filePath = "C:\\Users\\santhosh.kumar\\Downloads\\QualidexSam (9).xlsx";
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
		
//		if(sheetNo == null || sheetNo == "") 
//			{
//			sheetNo = "0";
//			}
//		
//		int sheetNumber = Integer.parseInt(sheetNo);
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
					 

					    
					
					//compareTwoFiles(test, executeCell);
					System.out.println("-------- Run Completed--------");
					break;
				}
			}
		}
		
		}}
    



	}


