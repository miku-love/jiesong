package com.jiesong.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesUtil {
	
	String path = "/param.properties";
	
	public PropertiesUtil() {
		// TODO Auto-generated constructor stub
	}
	
	public String getValue(String key){
		Properties prop = new Properties();
		InputStream in = getClass().getResourceAsStream(path);
		String result = null;
		try {
			prop.load(in);
			result = prop.getProperty(key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
