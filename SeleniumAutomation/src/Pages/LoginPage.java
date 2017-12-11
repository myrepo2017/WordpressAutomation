package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	WebDriver driver;
	
	By userName = By.id("user_login"); 
	By password = By.xpath("//input[@id='user_pass']");
	By login = By.name("wp-submit");
	
	public LoginPage(WebDriver Driver)
	{
		
	}
}

