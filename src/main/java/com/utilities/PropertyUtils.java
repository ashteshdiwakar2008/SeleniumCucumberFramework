package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Properties;

import com.constants.FrameworkConstants;

public final class PropertyUtils {

	private PropertyUtils() {}
	private static Map<String, String> propertyFileData;

	private static Properties readPropertyFile() {

		try {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(FrameworkConstants.getConfigPropertyPath());
			prop.load(fis);
			return prop;

		} catch (FileNotFoundException e) {
			throw new RuntimeException("Property file path is incorrect.");
		} catch (IOException e) {
			throw new RuntimeException("Data in property file is incorrect: ");
		}
	}

	public static Map<String, String> getPropertyData() {

		if(Objects.isNull(propertyFileData)) {
			propertyFileData = new HashMap<>();
			Properties prop = PropertyUtils.readPropertyFile();
			for(Entry entry : prop.entrySet()) {
				String key = (String) entry.getKey();
				String value = (String) entry.getValue();
				
				if(!key.isEmpty() && key != null)
					propertyFileData.put(key, value);
			}
		}
		return propertyFileData;
		
	}



}
