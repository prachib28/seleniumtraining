package Day5;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelHandling {

	public static void main(String[] args) {
File excelpath=new File("C:\\Users\\Amdocs\\TraningExcel\\Data\\Data.xlsx");
        
        FileInputStream fis=new FileInputStream(excelpath);
        
        XSSFWorkbook wb=new XSSFWorkbook();
        
        XSSFSheet sheet=wb.getSheetAt(0);
        
        int rowcount=sheet.getLastRowNum();
        
        for (int i=1;i<=rowcount;i++)
        {
            int colcount=sheet.getRow(i).getLastCellNum();
            
            for (int j=0;j<colcount;j++)
            {
                System.out.print("  " +sheet.getRow(i).getCell(j).getStringCellValue());
            }
            
            System.out.println("");
        }
        
        /*
          File excelpath=new File("C:\\Users\\mbano\\Downloads\\Selenium\\Data\\Data.xlsx");
        
        FileInputStream fis=new FileInputStream(excelpath);
        
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        
        XSSFSheet sheet=wb.getSheetAt(0);
        
        int rowcount=sheet.getLastRowNum();
        
        for (int i=1;i<=rowcount;i++)
        {
            int colcount=sheet.getRow(i).getLastCellNum();
            
            for (int j=0;j<colcount;j++)
            {
                System.out.print("  " +sheet.getRow(i).getCell(j).getStringCellValue());
            }
            
            sheet.getRow(i).createCell(colcount).setCellValue("Handled");
            
            FileOutputStream fout=new FileOutputStream(excelpath);
            
            wb.write(fout);
            
            System.out.println("");
        }
         */

	}

}
