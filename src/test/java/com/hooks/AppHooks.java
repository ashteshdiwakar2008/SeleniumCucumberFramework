package com.hooks;

import com.drivers.Driver;
import com.drivers.DriverManager;
import com.enums.PropertyConstants;
import com.reports.ExtentReport;
import com.utilities.PropertyUtils;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {
	
	@Before
	public void setUp() {
		Driver.initDriver(PropertyUtils.getPropertyData().get(PropertyConstants.BROWSER.getValue()));
	}
	
	@After
	public void tearDown() {
		Driver.quitDriver();
		DriverManager.unload();
	}
	
	@AfterStep
	public void captureScreens(Scenario scenario) {
		ExtentReport.createExtentTest(scenario);
	}

}
