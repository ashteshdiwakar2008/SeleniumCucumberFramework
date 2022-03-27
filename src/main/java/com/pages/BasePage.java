package com.pages;

import org.openqa.selenium.By;

import com.drivers.DriverManager;
import com.enums.WaitStrategyOptions;
import com.utilities.WaitStrategyUtils;

public class BasePage {
	
	public static boolean isElementPresent(By by) {
		return WaitStrategyUtils.ExplicitWaitStrategy(by, WaitStrategyOptions.DISPLAYED).isDisplayed();
	}
	
	public static String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}

	public static void sendKeys(By by, String input) {
		WaitStrategyUtils.ExplicitWaitStrategy(by, WaitStrategyOptions.DISPLAYED).sendKeys(input);
	}

	public static void click(By by) {
		WaitStrategyUtils.ExplicitWaitStrategy(by, WaitStrategyOptions.CLICKABLE).click();
	}



}
