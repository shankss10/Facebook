package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePageFB;

public class LoginErrorPage extends BasePageFB {
	
	@FindBy(xpath="//span[.='Log in to Facebook']")
	private WebElement loginError;
	
	public LoginErrorPage (WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void verifyError()
	{
		verifyElement(loginError);
	}
	

}
