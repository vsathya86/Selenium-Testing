package Sample;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CopyFileUtils extends ReportsTest{
	
	
	public static void getScreenshot() throws IOException
	{
		Date currentdate = new Date();
		String ScrShotFileName = currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(currentdate);
		System.out.println(ScrShotFileName);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//Record//" + ScrShotFileName +".png"));
		///
		
	}

}
