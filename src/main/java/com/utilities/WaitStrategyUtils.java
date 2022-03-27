package com.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.constants.FrameworkConstants;
import com.drivers.DriverManager;
import com.enums.WaitStrategyOptions;

public final class WaitStrategyUtils {

	private WaitStrategyUtils() {}
	
	public static WebElement ExplicitWaitStrategy(By by, WaitStrategyOptions waitOption) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(DriverManager.getDriver());
		wait.withTimeout(Duration.ofSeconds(FrameworkConstants.getExplicitWaitDuration())).
				pollingEvery(Duration.ofSeconds(FrameworkConstants.getExplicitWaitPollingDuration())).ignoring(NoSuchElementException.class);
		
		if(waitOption.equals(WaitStrategyOptions.PRESENCE)) {
			return (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(by));
		} else if(waitOption.equals(WaitStrategyOptions.CLICKABLE)) {
			return (WebElement) wait.until(ExpectedConditions.elementToBeClickable(by));
		} else if(waitOption.equals(WaitStrategyOptions.DISPLAYED)) {
			return (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} else {
			return DriverManager.getDriver().findElement(by);
		}
	}
}
