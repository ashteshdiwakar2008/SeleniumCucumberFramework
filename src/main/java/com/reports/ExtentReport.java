package com.reports;

import com.enums.PropertyConstants;
import com.utilities.PropertyUtils;
import com.utilities.ScreenshotUtils;

import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public final class ExtentReport {
	
	private ExtentReport() {}
	
	public static void createExtentTest(Scenario scenario) {
		
		if(PropertyUtils.getPropertyData().get(PropertyConstants.PASSEDSTEPSCREENSHOT.getValue()).equalsIgnoreCase("yes") &&
				scenario.getStatus() == Status.PASSED) {
			ScreenshotUtils.addScreenshotToReport(scenario);
		} else if(PropertyUtils.getPropertyData().get(PropertyConstants.FAILEDSTEPSCREENSHOT.getValue()).equalsIgnoreCase("yes") &&
				scenario.getStatus() == Status.FAILED) {
			ScreenshotUtils.addScreenshotToReport(scenario);
		}
		
	}

}
