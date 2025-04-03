package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.HomePage;

public class TC01_Login {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void login()
	{
		HomePage hp = new HomePage(driver);
		hp.username();
		hp.password();
		hp.loginbtn();
		
		DashboardPage dp = new DashboardPage(driver);
		dp.search();
	}
}
