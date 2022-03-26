package com.drivers;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.constants.FrameworkConstants;
import com.enums.BrowserType;
import com.enums.PropertyConstants;
import com.utilities.PropertyUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class Driver {

	private Driver() {}
	
	public static WebDriver driver;
	
	public static void initDriver(BrowserType browser) {
		
		if(browser.getValue().equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			DriverManager.setDriver(driver);
		} else if(browser.getValue().equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			DriverManager.setDriver(driver);
		} else {
			throw new RuntimeException("Incompatible driver selected");
		}
		//DriverManager.getDriver().get(PropertyUtils.getPropertyData().get(PropertyConstants.URL.getValue()));
		DriverManager.getDriver().get("https://opensource-demo.orangehrmlive.com/");
	}
	
	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
		}
	}
}
