package com.craftsvilla.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pompages.CartPage;
import com.craftsvilla.pompages.EmbroidedSareesPage;
import com.craftsvilla.pompages.HomePage;
import com.craftsvilla.pompages.ProductDescriptionPage;
import com.craftsvilla.pompages.SareesPage;

public class EmbroidedSareesScripts extends BaseTest
{
	
	HomePage homepage = null;
	SareesPage sareespage = null;
	EmbroidedSareesPage embroidedsarees = null;
	ProductDescriptionPage proddescpage = null;
	CartPage cartpage = null;
	
	
	@Test
	public void tc_01_buyProductFromEmbroidedSarees()
	{
		homepage = new HomePage(driver);
		sareespage = new SareesPage(driver);
		embroidedsarees = new EmbroidedSareesPage(driver);
		proddescpage = new ProductDescriptionPage(driver);
		cartpage = new CartPage(driver);
		
		try
		{
			homepage.goToSareesLink();
			sareespage.clickOnEmbroidedSarees();
			embroidedsarees.goToProduct1538759448();
			proddescpage.clickOnBuyNow();
			Assert.fail();
			cartpage.setEmail("your_email");
			cartpage.setFirstName("Steve");
			cartpage.setMobile("9098765443345");
			
			log.info("tc_01_buyProductFromEmbroidedSarees has been executed successfully");
			
		}
		catch(Exception e)
		{
			log.error("tc_01_buyProductFromEmbroidedSarees failed. "+e);
		}
	}

}
