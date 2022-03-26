package com.hooks;

import com.drivers.Driver;
import com.drivers.DriverManager;
import com.enums.BrowserType;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {
	
	@Before
	public void setUp() {
		Driver.initDriver(BrowserType.CHROME);
	}
	
	@After
	public void tearDown() {
		Driver.quitDriver();
		DriverManager.unload();
	}

}
