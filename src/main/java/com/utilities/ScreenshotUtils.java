package com.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.drivers.DriverManager;

import io.cucumber.java.Scenario;

public final class ScreenshotUtils {
	
	private ScreenshotUtils() {}
	
	public static void addScreenshotToReport(Scenario scenario) {
		
		byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");
		
	}

}
