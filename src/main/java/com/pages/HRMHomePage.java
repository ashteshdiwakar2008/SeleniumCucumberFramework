package com.pages;

import org.openqa.selenium.By;

import com.drivers.DriverManager;

import junit.framework.Assert;

public class HRMHomePage extends BasePage{
	
	
	
	
	@SuppressWarnings("deprecation")
	public static void verifyHomepageTitle() {
		
		String title = DriverManager.getDriver().getTitle();
		
		Assert.assertEquals(title, title, "Home page Title mismatch");
	}

}
