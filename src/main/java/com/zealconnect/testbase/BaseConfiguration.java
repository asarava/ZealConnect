package com.zealconnect.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseConfiguration {
	
	public static Properties prop;
	public static WebDriver driver;
	public static String driverLoc;
	public static String userName;
	public static String password;	
	
	public BaseConfiguration() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\ZealConnect"
					+ "\\src\\main\\java\\com\\zealconnect\\configfile\\zealconnectconfig");
			prop.load(ip);			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String url = prop.getProperty("URL");
		driverLoc = prop.getProperty("GeckoDriverLocation");
		userName = prop.getProperty("Username");
		password = prop.getProperty("Password");
		System.setProperty("webdriver.gecko.driver", driverLoc);
		driver = new FirefoxDriver();
		driver.get(url);
	}

}
