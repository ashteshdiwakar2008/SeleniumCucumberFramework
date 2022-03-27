package com.stepdefinitions;

import com.pages.HRMHomePage;
import com.pages.HRMLoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMLoginSteps {
	
	@When("user input username as {string}")
	public void user_input_username_as(String username) {
		HRMLoginPage.inputUsername(username);
	}

	@And("user input password as {string}")
	public void user_input_password_as(String password) {
	   HRMLoginPage.inputPassword(password);
	}

	@And("click on login button")
	public void click_on_login_button() {
	    HRMLoginPage.clickLogin();
	}

	@Then("HRM Home Page should be displayed")
	public void hrm_home_page_should_be_displayed() {
	    HRMHomePage.verifyHomePage();
	}
	
	@Then("user should be on Login page")
	public void user_should_be_on_login_page() {
	    HRMLoginPage.verifyLoginPage();
	}


}
