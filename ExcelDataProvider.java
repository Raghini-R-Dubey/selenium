

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelDataProvider {

	static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    public ExcelDataProvider(String path, String sheetname) throws IOException
    {
	   workbook=new XSSFWorkbook(path);
       sheet =workbook.getSheet(sheetname);
    }

    public static void main(String[]args)
    {
    	getrowcount();
    	getcolcount();
    }
    public static int getrowcount()
	{  
		int rcount=sheet.getPhysicalNumberOfRows();
		System.out.println("The total count of row ="+rcount);
		return rcount;
		
	}
    public static int getcolcount()
	{  
		int Ccount=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("The total count of column ="+Ccount);
		return Ccount;
		
	}
    public static String getData(int rownum,int colnum)
	{  
		String datausr= sheet.getRow(rownum).getCell(colnum).getStringCellValue();
	    return datausr;
	}
}
