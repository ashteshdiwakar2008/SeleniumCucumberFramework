package com.stepdefinitions;

import com.pages.HRMHomePage;
import com.pages.HRMLoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMLoginSteps {
	
	HRMLoginPage loginPage = new HRMLoginPage();
	HRMHomePage homepage = new HRMHomePage();
	
	@When("user input username")
	public void user_input_username() {
		loginPage.inputUsername("admin");
	}

	@And("user input password")
	public void user_input_password() {
	   loginPage.inputPassword("admin123");
	}

	@And("click on login button")
	public void click_on_login_button() {
	    loginPage.clickLogin();
	}

	@Then("HRM Home Page should be displayed")
	public void hrm_home_page_should_be_displayed() {
	    homepage.verifyHomepageTitle();
	}


}
