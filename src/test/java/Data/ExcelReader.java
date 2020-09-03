package Data;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	static FileInputStream fis1=null;
	static FileInputStream fis2 = null;

	public FileInputStream getFileInputStream() throws FileNotFoundException {

		//path of the excel file
		String filepath1 = System.getProperty("B0 After ICC");
		File srcFile1 = new File(filepath1);

		fis1 = new FileInputStream(srcFile1);

		return fis1;
	}
	public FileInputStream getFileInputStreamSecond() throws FileNotFoundException {

		//path of the excel file

		String filepath2 = System.getProperty("B0 Before ICC.xlsx");
		File srcFile2  = new File(filepath2);

		fis2 = new FileInputStream(srcFile2);
		return fis2;
	}
	//method for reading the excel sheet
	//array of 2 dimension to read the rows and columns

	public Object[][] getExcelData() throws IOException
	{
		fis1= getFileInputStream();
		fis2 = getFileInputStreamSecond();
		//workbook here is the excel file itself
		XSSFWorkbook wb = new XSSFWorkbook(fis1);
		XSSFWorkbook wb2 = new XSSFWorkbook(fis2);

		//read the sheet in the excel which is index 0 (sheet number one)
		XSSFSheet sheet = wb.getSheetAt(0);
		int TotalNumberofRows = sheet.getLastRowNum()+1;
		//total number of cols from the excel sheet itself
		int TotalNumberofCols= 4;
		String columnWanted = "Migration ID";		
		//array of 2 diemsnions to store the rows and cols
		String[][] arrayExcelData= new String[TotalNumberofRows][TotalNumberofCols];
		//will loop on the rows and in every row will loop over the cols to reach to the cell to get the data
		for (int i = 0; i < TotalNumberofRows; i++) {

			for (int j = 0; j < TotalNumberofCols; j++) {
				//get the row
				XSSFRow row =sheet.getRow(i);
				//get the value of the cell
				arrayExcelData[i][j]= row.getCell(j).toString();
			}
		}
		//close the stream to stop reading
		wb.close();
		return arrayExcelData;
	}
}
