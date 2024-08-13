package com.qsp.genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qsp.objectrepositary.HomePage;
import com.qsp.objectrepositary.LoginPage;
import com.qsp.objectrepositary.WelcomePage;

public class BaseClass 
{
	public static WebDriver driver;

	public FileUtility fileLib;
	public JavaUtility javalib;
	public ExcelUtility excelLib;

	public WelcomePage wp;
	public LoginPage lp;
	public HomePage hp;
	@BeforeClass
	public void launchbrowser() throws IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		fileLib = new FileUtility();
		String url = fileLib.getDataFromProperty("url");
		driver.get(url);
	}
	@BeforeMethod
	public void login() throws IOException
	{
		wp = new WelcomePage(driver);
		wp.getLoginlink().click();
		lp =  new LoginPage(driver);
		String email = fileLib.getDataFromProperty("email");
		String password = fileLib.getDataFromProperty("password");
		lp.getEmailTextfield().sendKeys(email);
		lp.getPasswordTextfiled().sendKeys(password);
		lp.getLoginbutton().click();
	}
	@AfterMethod
	public void logout()
	{
		hp = new HomePage(driver);
		hp.getLogoutlink().click();
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
}
