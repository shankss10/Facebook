package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePageFB;

public class FBLoggedInPage extends BasePageFB {
	
	@FindBy(xpath="//div[@id='userNavigationLabel']")
	private WebElement logoutDropdown;
	
	@FindBy(xpath="(//span[@class='_54nh'])[9]")
	private WebElement logoutLink;

	
	public FBLoggedInPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickDropdown()
	{
		logoutDropdown.click();
	}
	public void logout()
	{
		logoutLink.click();
		
	}
	

}
