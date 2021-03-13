package Sample;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners extends CopyFileUtils implements ITestListener{

	
	public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
		Reporter.log("Method is -"+ result.getName());		
		System.setProperty("org.uncommons.reportng.title", "Sample test Report");
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href= \"C:\\Users\\ShankarSathya\\eclipse-workspace\\SeleniumTesting\\screenshot\\Sun-Mar-07-16-58-04-EST-2021.png\">Test Result </a>");
		System.out.println("Test Start");
		}

		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			Reporter.log("Status of exection is -"+ result.getStatus());
		}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test failed");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("<a href= \"C:\\Users\\ShankarSathya\\eclipse-workspace\\SeleniumTesting\\screenshot\\Sun-Mar-07-16-58-04-EST-2021.png\">Test Result </a>");
	}

	
}
