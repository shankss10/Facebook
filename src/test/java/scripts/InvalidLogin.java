package scripts;

import org.testng.annotations.Test;

import generic.TestBaseFB;
import pom.FacebookHomepage;
import pom.LoginErrorPage;

public class InvalidLogin extends TestBaseFB {
	
	@Test
	public void testInvalidLogin()
	{
		FacebookHomepage fb = new FacebookHomepage(driver);
		fb.getEmail("wertyirdtfyjgtfytiu@ymail.com");
		fb.getPassword("qwerttrrrr");
		fb.clickLogin();
		
		LoginErrorPage lep=new LoginErrorPage(driver);
		lep.verifyError();
	}
	
	
	

}
