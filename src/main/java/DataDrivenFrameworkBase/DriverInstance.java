package DataDrivenFrameworkBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import DataDrivenFrameworkUtility.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInstance {
	public WebDriver driver;
	
	@BeforeMethod
	public void InitiateDriverInstance() throws IOException 
	{
		if(Utility.fetchProperty("browsername").equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(Utility.fetchProperty("browsername").equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(Utility.fetchProperty("browsername").equals("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.get("https://www.facebook.com");
			
	}
	
	@AfterMethod
	public void CloseDriverInstance() 
	{
		driver.quit();
	}

}
