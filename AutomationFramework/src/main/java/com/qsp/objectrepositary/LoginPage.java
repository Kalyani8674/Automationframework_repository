package com.qsp.objectrepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	private WebElement emailTextfield;

	@FindBy(id = "Password")
	private WebElement passwordTextfiled;

	@FindBy(xpath = "//input[value='Log in']")
	private WebElement loginbutton;

	public WebElement getEmailTextfield() 
	{
		return emailTextfield;
	}

	public WebElement getPasswordTextfiled() 
	{
		return passwordTextfiled;
	}

	public WebElement getLoginbutton() 
	{
		return loginbutton;
	}

}
