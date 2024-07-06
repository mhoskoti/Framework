package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;

	public ConfigDataProvider() throws Exception {
		File src = new File("./Config/Config.properties");

		FileInputStream fis = new FileInputStream(src);

		pro = new Properties();

		pro.load(fis);
	}

	public String getDataFromConfig(String KeyToSearch)
	{
		return pro.getProperty(KeyToSearch);

	}

	public String getBrowser() {

		return pro.getProperty("Browser");

	}

	public String getStagingURL() {

		return pro.getProperty("URL");
	}

}
