package WordpressTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTests
{
	
	
	@Test
	public void Login_Test_With_Valid_User()
	{
		System.setProperty("webdriver.chrome.driver","C:\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://localhost:5369/wp-login.php");
		
		LoginPage loginPage = new LoginPage(driver);
		
	    loginPage.LoginAs("admin").WithPassword("password1").Login();
	}
}
