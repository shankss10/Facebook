package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseFB implements AutoConstantFB {
	public WebDriver driver;
	
	@BeforeMethod
	public void openFacebook()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.get(FaceBookURL);
	}
	
	@AfterMethod
	public void closeFacebook()
	{
		driver.quit();
	}

}
