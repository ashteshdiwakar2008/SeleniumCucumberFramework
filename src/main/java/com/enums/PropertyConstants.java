package com.enums;

public enum PropertyConstants {
	
	URL,
	BROWSER,
	OVERRIDEREPORTS,
	PASSEDSTEPSCREENSHOT,
	FAILEDSTEPSCREENSHOT,
	EXECUTEONREMOTEMACHINE;
	
	public String getValue() {
		return this.toString();
	}

}
