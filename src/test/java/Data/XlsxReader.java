package Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
public class XlsxReader {

	public static void main(String[] args) throws FileNotFoundException, IOException, InvalidFormatException {
	    File file = new File("/Users/adelgamal/eclipse-workspace/TestATAF/B0 Before ICC.xlsx");
	    Workbook workbook = WorkbookFactory.create(new FileInputStream(file));
	    Sheet sheet = workbook.getSheetAt(0);
	    int column_index_1 = 0;
	    
	    Row row = sheet.getRow(0);
	    for (Cell cell : row) {
	        // Column header names.
	        switch (cell.getStringCellValue()) {
	            case "Migration ID":
	                column_index_1 = cell.getColumnIndex();
	                break;
	           // case "3rd Column":
	            //    column_index_2 = cell.getColumnIndex();
	            //    break;
	            //case "forth Column":
	              //  column_index_3 = cell.getColumnIndex();
	                //break;
	        }
	    }

	    for (Row r : sheet) {
	        if (r.getRowNum()==0) continue;//hearders
	        Cell c_1 = r.getCell(column_index_1);
	       // Cell c_2 = r.getCell(column_index_2);
	        //Cell c_3 = r.getCell(column_index_3);
	        if (c_1 != null && c_1.getCellType() != Cell.CELL_TYPE_BLANK)
	                //&&c_2 != null && c_2.getCellType() != Cell.CELL_TYPE_BLANK
	                //&&c_3 != null && c_3.getCellType() != Cell.CELL_TYPE_BLANK) {
	            System.out.print("  "+c_1 + "   " +"\n");
	        }
	    }
	

}

