package com.constants;

public final class FrameworkConstants {
	
	private FrameworkConstants() {}

	private static final String RESOURCE_PATH = System.getProperty("user.dir");
	private static final String CONFIG_PROPERTY_PATH = RESOURCE_PATH + "\\src\\main\\resources\\config.properties";
	private static final String TEST_DATA_FILE_PATH = RESOURCE_PATH + "\\src\\main\\resources\\data\\TestData.xlsx";
	private static final String EXTENT_REPORT_PATH = RESOURCE_PATH + "\\extent-reports";
	private static final int EXPLICIT_WAIT_DURATION = 10;
	
	/**
	 * @return the configPropertyPath
	 */
	public static String getConfigPropertyPath() {
		return CONFIG_PROPERTY_PATH;
	}
	/**
	 * @return the testDataFilePath
	 */
	public static String getTestDataFilePath() {
		return TEST_DATA_FILE_PATH;
	}
	/**
	 * @return the extentReportPath
	 */
	public static String getExtentReportPath() {
		return EXTENT_REPORT_PATH;
	}
	/**
	 * @return the explicitWaitDuration
	 */
	public static int getExplicitWaitDuration() {
		return EXPLICIT_WAIT_DURATION;
	}
	
}
