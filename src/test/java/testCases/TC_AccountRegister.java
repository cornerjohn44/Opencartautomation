package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.AccountRegister;
import pageObjects.HomePage;


public class TC_AccountRegister extends BaseClass{

	
	
	@Test(groups={"Regression","Master"})
	public void verifyaccountregister()
	
	{
		
		logger.info("***** Starting TC001_AccountRegistrationTest  ****");
		
		try {
		HomePage hp = new HomePage(driver);
		
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount Link.. ");
		
		hp.clickRegister();
		logger.info("Clicked on Register Link.. ");
		
		
		AccountRegister regpage = new AccountRegister(driver);
		logger.info("Providing customer details...");
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		regpage.setTelephone(randomeNumber());
			
		String password=randomeAlphaNumberic();
			
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		logger.info("Validating expected message..");
			
		String confmsg = regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		
		catch (Exception e)
		{
			logger.error("Test failed" + e.getMessage());
			Assert.fail("Test failed" + e.getMessage());
		}
		
		finally
		{
			logger.info("***** Finished TC001_AccountRegistrationTest *****");
			
		}
		
		
		
	}
	
	
	
}
