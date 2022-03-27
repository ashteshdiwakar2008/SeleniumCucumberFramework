package com.stepdefinitions;

import io.cucumber.java.en.Given;

public class CommonSteps {
	
	@Given("Launch HRM application")
	public void launch_hrm_application() {
		
		  System.out.println("Launched the application");
		 
	}

}
