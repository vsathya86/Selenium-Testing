package DataDrivenFrameworkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DataDrivenFrameworkUtility.Utility;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void EnterUsername(String UName) throws IOException
	{
		driver.findElement(By.id(Utility.fetchLocator("login_Username_id"))).sendKeys(UName);
	}
	public void EnterPwd(String Pass) throws IOException
	{
		driver.findElement(By.id(Utility.fetchLocator("login_Password_id"))).sendKeys(Pass);
	}
	public void ClickLogin() throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocator("login_Button_xpath"))).click();
	}

}
