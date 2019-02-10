package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class SareesPage extends BasePage
{
	
	@FindBy(linkText = "Embroidered Sarees")
	private WebElement embroidedSarees;
	
	@FindBy(linkText="Printed Sarees")
	private WebElement printedSarees;
	
	@FindBy(linkText="Chiffon Sarees")
	private WebElement chiffonSarees;
	
	public SareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}


	public void clickOnEmbroidedSarees()
	{
		verifyElementPresent(embroidedSarees);
		embroidedSarees.click();
	}
	
	public void  clickOnPrintedSarees()
	{
		verifyElementPresent(printedSarees);
		printedSarees.click();
	}
	
	public void clickOnChiffonSarees()
	{
		verifyElementPresent(chiffonSarees);
		chiffonSarees.click();
	}
}
