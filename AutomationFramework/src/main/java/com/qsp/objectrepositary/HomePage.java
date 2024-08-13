package com.qsp.objectrepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	@FindBy(partialLinkText = "//span[test()='Shopping cart']")
	private WebElement shoppingcartlink;

	public WebElement getShoppingcartlink() 
	{
		return shoppingcartlink;
	}

	public WebElement getLogoutlink() 
	{
		return logoutlink;
	}
	
}
