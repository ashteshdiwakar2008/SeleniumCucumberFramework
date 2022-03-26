package com.pages;

import org.openqa.selenium.By;

import com.drivers.DriverManager;

public class BasePage {

	public static void sendKeys(By by, String input) {

		DriverManager.getDriver().findElement(by).sendKeys(input);
	}

	public static void click(By by) {

		DriverManager.getDriver().findElement(by).click();
	}



}
