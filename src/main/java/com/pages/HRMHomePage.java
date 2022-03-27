package com.pages;

import org.openqa.selenium.By;

import com.drivers.DriverManager;

import junit.framework.Assert;

public class HRMHomePage extends BasePage{
	
	private static By link_Welcome = By.id("welcome");
	private static By Btn_Logout = By.xpath("//a[text()='Logout']");
	private static By link_QuickLaunchSection = By.xpath("//*[text()='Quick Launch']");
	private static By link_EmployeeDistributionBySubUnitSection = By.xpath("//*[text()='Employee Distribution by Subunit']");
	private static By link_PendingLeaveRequest = By.xpath("//*[text()='Pending Leave Requests']");
	
	
	public static void verifyHomePage() {
		if(!isElementPresent(link_Welcome))
			System.out.println("Not on home page");
	}
	
	public static void doLogout() {
		click(link_Welcome);
		click(Btn_Logout);
		
	}
	
	public static void isQuickLaunchSectionDisplayed() {
		if(!isElementPresent(link_QuickLaunchSection))
			System.out.println("Element not present: "+link_QuickLaunchSection);
	}
	
	public static void isEmployeeDistributionBySubUnitSectionDisplayed() {
		if(!isElementPresent(link_EmployeeDistributionBySubUnitSection))
			System.out.println("Element not present: " +link_EmployeeDistributionBySubUnitSection);
	}
	
	public static void isPendingLeaveRequestSectionDisplayed() {
		if(!isElementPresent(link_PendingLeaveRequest))
			System.out.println("Element not present: " +link_PendingLeaveRequest);
	}
	
}
