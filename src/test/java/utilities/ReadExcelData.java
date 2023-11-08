package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadExcelData {

	@DataProvider(name="Signupdata")
	public String[][] getData(Method m) throws EncryptedDocumentException, IOException 
	{
		String excelSheetName = m.getName();
		File f = new File (System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\SignupTest.xlsx"); // Get file details 
		FileInputStream fis = new FileInputStream (f); //streamline the file details 
		Workbook wb = WorkbookFactory.create(fis); // get workbook details 
		Sheet sheetName = wb.getSheet(excelSheetName); // get sheet details 
		
		int totalRows = sheetName.getLastRowNum(); // find total number of rowsa 
		System.out.println(totalRows);
		Row rowcells = sheetName.getRow(0); // read excel row number 0
		int coloumnnum = rowcells.getLastCellNum(); // find total number of cells
		System.out.println(coloumnnum);
		
		DataFormatter format = new DataFormatter();
		
		String testData[][] = new String[totalRows][coloumnnum]; // create two dimensional array
		for(int i = 1;i<=totalRows;i++) { // i used for iterating through rows  
			for(int j =0;j<coloumnnum;j++) { // j used for iterating through coloumns
				testData[i-1][j] = format.formatCellValue(sheetName.getRow(i).getCell(j)); //
				System.out.println(testData[i-1][j]);
			}
		}
		return testData;
	}

}


//code to Read Data from  Excel 

//public class ReadExcelData {
//
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		ReadExcelData R = new ReadExcelData();
//		R.getData("SignupSheet");
//	}
//	
//	public String[][] getData(String excelSheetName ) throws EncryptedDocumentException, IOException {
//		File f = new File (System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\SignupTest.xlsx"); // Get file details 
//		FileInputStream fis = new FileInputStream (f); //streamline the file details 
//		Workbook wb = WorkbookFactory.create(fis); // get workbook details 
//		Sheet sheetName = wb.getSheet(excelSheetName); // get sheet details 
//		
//		int totalRows = sheetName.getLastRowNum(); // find total number of rowsa 
//		System.out.println(totalRows);
//		Row rowcells = sheetName.getRow(0); // read excel row number 0
//		int coloumnnum = rowcells.getLastCellNum(); // find total number of cells
//		System.out.println(coloumnnum);
//		
//		DataFormatter format = new DataFormatter();
//		
//		String testData[][] = new String[totalRows][coloumnnum]; // create two dimensional array
//		for(int i = 1;i<=totalRows;i++) { // i used for iterating through rows  
//			for(int j =0;j<coloumnnum;j++) { // j used for iterating through coloumns
//				testData[i-1][j] = format.formatCellValue(sheetName.getRow(i).getCell(j)); //
//				System.out.println(testData[i-1][j]);
//			}
//		}
//		return testData;
//	}
//
//}