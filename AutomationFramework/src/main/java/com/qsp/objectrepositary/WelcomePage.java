package com.qsp.objectrepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	//Initialization
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//declaration
	@FindBy(linkText = "Log in")
	private WebElement loginlink;

	@FindBy(linkText = "Register")
	private WebElement registerlink;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartlink;

	@FindBy(xpath = "//span[test()='Wishlist']")
	private WebElement Wishlistlink;

	public WebElement getLoginlink() 
	{
		return loginlink;
	}

	public WebElement getRegisterlink() 
	{
		return registerlink;
	}

	public WebElement getShoppingCartlink() 
	{
		return shoppingCartlink;
	}

	public WebElement getWishlistlink() 
	{
		return Wishlistlink;
	}


}
