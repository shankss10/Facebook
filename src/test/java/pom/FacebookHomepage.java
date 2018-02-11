package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePageFB;

public class FacebookHomepage extends BasePageFB {
	
	@FindBy(id="email")
	private WebElement emailBox;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginButton;
	
	public FacebookHomepage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void getEmail(String email)
	{
		emailBox.sendKeys(email);
	}
	public void getPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginButton.click();
	}

}
