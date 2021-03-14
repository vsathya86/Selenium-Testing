package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trial2 {
	public static WebDriver driver = null;
	@Test
	public void Titleprint()
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.ebay.ca/");
	String ActualTitle = driver.getTitle();
    System.out.println(ActualTitle);
    
    driver.close();
    }
}
