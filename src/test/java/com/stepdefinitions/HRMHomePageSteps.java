package com.stepdefinitions;

import com.pages.HRMHomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HRMHomePageSteps {

	@Then("Home page title should be {string}")
	public void home_page_title_should_be(String expectedTitle) {
	    Assert.assertEquals(expectedTitle, HRMHomePage.getPageTitle());
	}
	
	@When("user click logout button")
	public void user_click_logout_button() {
	    HRMHomePage.doLogout();
	}
	
	@Then("Quick Launch section should be displayed")
	public void quick_launch_section_should_be_displayed() {
	    HRMHomePage.isQuickLaunchSectionDisplayed();
	}

	@Then("Employee Distribution By Subunit section should be displayed")
	public void employee_distribution_by_subunit_section_should_be_displayed() {
	    HRMHomePage.isEmployeeDistributionBySubUnitSectionDisplayed();
	}

	@Then("Pending leave request section should be displayed")
	public void pending_leave_request_section_should_be_displayed() {
	    HRMHomePage.isPendingLeaveRequestSectionDisplayed();
	}
}
