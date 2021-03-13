package DataDrivenFrameworkDataGenerator;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {

	@DataProvider(name="Excel")
	public static Object [][] testDataGeneratorfromExcel() throws IOException
	{
	FileInputStream file = new FileInputStream("./TestData/Data.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet loginsheet = workbook.getSheet("login");
	int numofdata = loginsheet.getPhysicalNumberOfRows();
	Object [][] testdata = new Object [numofdata][2];
	for(int i=0;i<numofdata;i++)
	{
		XSSFRow row = loginsheet.getRow(i);
		XSSFCell Uname = row.getCell(0);
		XSSFCell Pwd = row.getCell(1);
		testdata [i][0] = Uname.getStringCellValue();
		testdata [i][1] = Pwd.getStringCellValue();		
	}
	return testdata;
	}
}
