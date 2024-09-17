package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(xpath ="//span[normalize-space()='My Account']")
	WebElement MyAccountlink;
	
	@FindBy(xpath ="//a[normalize-space()='Register']")
	WebElement RegisterLink;
	
	@FindBy(linkText = "Login")   // Login link added in step5
	WebElement linkLogin;

	
	
	
	
	public void clickMyAccount() 
	
	{
		
		MyAccountlink.click();
	}
	
		
	public void clickRegister() 
	
	{
		
		RegisterLink.click();
	}
	
	
	public void clickLogin()
	{
		linkLogin.click();
	}

	
	
	
	
	
	
}
