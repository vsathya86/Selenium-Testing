package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReportsTest {
	public static WebDriver driver = null;
	@Test
	public void reporterTest1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.ca/");
		System.out.println("This is Test1");
		
			}
@Test
	public void reporterTest2() {
	Reporter.log("This is Test2");
		System.out.println("This is Test2");
	}
@Test
public void reporterTest3() {
	System.out.println("This is Test3");
}
}
