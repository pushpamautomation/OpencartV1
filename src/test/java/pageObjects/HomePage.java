package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
		public HomePage(WebDriver driver)
		{
			super(driver);
		}
		
		@FindBy(xpath="//input[@name='username']")
		WebElement username;
		
		@FindBy(xpath="//input[@name='password']")
		WebElement password;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement btn;
		
		public void username()
		{
			username.sendKeys("Admin");
		}
		
		public void password()
		{
			password.sendKeys("admin123");
		}
		
		public void loginbtn()
		{
			btn.click();
		}
		
	}
