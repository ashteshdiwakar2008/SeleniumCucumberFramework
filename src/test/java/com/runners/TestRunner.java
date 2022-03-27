package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features" }, 
					glue = { "com.stepdefinitions", "com.hooks" }, 
					plugin = {
								"pretty", // default report and console output printing plugin
								"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },// extent report plugin for cucumber-6
					publish = true, // if false cucumber report not generated
					monochrome = false)  // if true then no color in console output
public class TestRunner {

}
