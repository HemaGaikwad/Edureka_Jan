package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class HomePage extends BasePage
{
	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement signInButton;
	
	@FindBy(id="cartCount")
	private WebElement cartLink;
	
	@FindBy(name="q")
	private WebElement searchBox;
	
	@FindBy(xpath="//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']")
	private WebElement sareesLink;
	
	@FindBy(xpath="//a[@href='/jewellery/necklaces/?MID=megamenu_jewellery_seeall']")
	private WebElement jewelleryLink;
	
	@FindBy(xpath ="//i[@class='icon first_arrow hidden-xs']")
	private WebElement account;
	
	@FindBy(xpath = "//i[@class='icon logout']")
	private WebElement logoutBtn;
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnSignInButton()
	{
		try
		{
			verifyElementPresent(signInButton);
			signInButton.click();
			log.info("clicked on "+signInButton);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+signInButton+e);
		}
		

	}
	
	public void clickOnCartLink()
	{
		try {
		verifyElementPresent(cartLink);
		cartLink.click();
		log.info("Clicked on "+cartLink);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+cartLink+e);
		}
		
	}
	
	public void setValueToSearchBox(String searchvalue)
	{
		try
		{
		verifyElementPresent(searchBox);
		searchBox.sendKeys(searchvalue);
		log.info(searchvalue+"has been set to "+searchBox);
		}
		catch(Exception e)
		{
			log.error("Unable to set the value to "+searchBox+e);
		}
		
	}
	
	public void goToSareesLink()
	{
		try
		{
			verifyElementPresent(sareesLink);
			mouseHover(driver, sareesLink);
		}
		catch(Exception e)
		{
			log.error("Could not mouse hover on "+sareesLink+e);
		}
		
		
	}
	
	public void goToJewellery()
	{
		try
		{
		verifyElementPresent(jewelleryLink);
		mouseHover(driver, jewelleryLink);
		}
		catch(Exception e)
		{
			log.error("Could not mouse hover on "+jewelleryLink+e);
		}
		
	}

	public void gotoAccount()
	{
		try
		{
		verifyElementPresent(account);
		mouseHover(driver, account);
		}
		catch(Exception e)
		{
			
		}
	}
	
	public boolean clickOnLogout()
	{
		try
		{
		verifyElementPresent(logoutBtn);
		logoutBtn.click();
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
