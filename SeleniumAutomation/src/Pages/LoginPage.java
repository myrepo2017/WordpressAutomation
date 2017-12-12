package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	WebDriver driver;
	
	By userName = By.id("user_login"); 
	By password = By.xpath("//input[@id='user_pass']");
	By login = By.name("wp-submit");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginCommand LoginAs(String uName)
	{
		return new LoginCommand(uName);
	}
	
	public class LoginCommand
	{
		private String uName;
		private String pass;
		
		public LoginCommand(String uName)
		{
			this.uName = uName;
		}
		
		public LoginCommand WithPassword(String pass)
		{
			this.pass = pass;
			return this;
		}
		
		public void Login()
		{
			driver.findElement(userName).sendKeys(uName);
			driver.findElement(password).sendKeys(pass);
			driver.findElement(login).click();
		}
	}
}

