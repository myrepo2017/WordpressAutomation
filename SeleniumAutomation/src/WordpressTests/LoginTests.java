package WordpressTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Pages.LoginPage;

public class LoginTests
{
	
	
	@Test
	public void LoginTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		LoginPage loginPage = new LoginPage(driver);
		LoginPage.GoTo();
		
	}
	
	
	
	/*@Test
	public static void LaunchGoogle()
	{
		
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("user_login")).sendKeys("admin");;
	    driver.findElement(By.id("user_pass")).sendKeys("password1");
	    driver.findElement(By.id("wp-submit")).click();
	}*/
}
