package com.pages;

import org.openqa.selenium.By;

public final class HRMLoginPage extends BasePage{

	private static By txtbox_Username = By.id("txtUsername");
	private static By txtbox_Password = By.id("txtPassword");
	private static By btn_Login = By.id("btnLogin");
	
	public static void verifyLoginPage() {
		if(!isElementPresent(btn_Login))
			System.out.println("Not on Login page");
	}
	
	public static void inputUsername(String username) {
		sendKeys(txtbox_Username, username);
	}
	
	public static void inputPassword(String password) {
		sendKeys(txtbox_Password, password);
	}
	
	public static void clickLogin() {
		click(btn_Login);
	}

}
