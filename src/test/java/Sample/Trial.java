package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Trial {
	
	@Test
	public void Title()
	{
		String ExpectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String EText = "Search";
		SoftAssert softassert = new SoftAssert();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.ca/");
		String ActualTitle = driver.getTitle();
		softassert.assertEquals(ActualTitle, ExpectedTitle, "Title Verification failed");
		String AText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		softassert.assertEquals(AText, EText, "Text Verification failed");
		driver.close();
		softassert.assertAll();
	}
			
	
}
