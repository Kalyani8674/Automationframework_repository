package com.qsp.genericutility;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility 
{
	Actions act;
	public WebDriverUtility(WebDriver driver) 
	{
		act = new Actions(driver);
	}
	public void doubleclick(WebElement Element)
	{
		act.doubleClick(Element).perform();
	}
	public void ClickAndHold(WebElement Element)
	{
		act.clickAndHold(Element).perform();
	}
	public void mousehover(WebElement Element)
	{
		act.moveToElement(Element).perform();
	}
	public void scrolltoElement(WebElement Element)
	{
		act.scrollToElement(Element).perform();
	}
	public void SwitchTWindow(WebDriver driver,String expectedurl)
	{
		Set<String> allwindowIds = driver.getWindowHandles();
		for(String id:allwindowIds)
		{
			String acturl = driver.switchTo().window(id).getCurrentUrl();
			if(acturl.contains(expectedurl))
			{
				break;
			}
			
		}
	}
	public void SwitchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	public Alert SwitchToAlert(WebDriver driver)
	{
		return driver.switchTo().alert();
		
	}
}
