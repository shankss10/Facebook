package scripts;

import org.testng.annotations.Test;

import generic.TestBaseFB;
import pom.FBLoggedInPage;
import pom.FacebookHomepage;

public class ValidFBLoginLogout extends TestBaseFB {
	@Test
	
	public void logintoFB() throws InterruptedException
	{
		FacebookHomepage fb=new FacebookHomepage(driver);
		fb.getEmail("shashankshuklaeee@gmail.com");
		fb.getPassword("shukla275001");
		Thread.sleep(3000);
		fb.clickLogin();
		
		Thread.sleep(3000);
		
		FBLoggedInPage lp= new FBLoggedInPage(driver);
		lp.clickDropdown();
		Thread.sleep(3000);
		lp.logout();
		
		Thread.sleep(3000);
		
		
	}

}
