package DataDrivenFrameworkTestcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDrivenFrameworkBase.DriverInstance;
import DataDrivenFrameworkDataGenerator.DataGenerator;
import DataDrivenFrameworkPages.LoginPage;

public class ValidateLogin extends DriverInstance{
	@Test(dataProvider= "Excel", dataProviderClass=DataGenerator.class)
	public void login (String UName, String Pass) throws IOException
	{
		LoginPage lpage = new LoginPage(driver);
		lpage.EnterUsername(UName);
		lpage.EnterPwd(Pass);
		lpage.ClickLogin();
	}

	@DataProvider(name="Static")
	public Object [][] testDataGenerator()
	{
	Object [][] data = {{"UName1","Pass1"}, {"UName2","Pass2"}, {"UName3","Pass3"}};
	return data;
	}	

}
