package com.automationpractice.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.automationpractice.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;


//	<-- to read the config file --> //

	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/riyas/eclipse-workspace/"
					+ "MySeleniumLoginTest/src/main/java/com/automationpractice/qa/" + "config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

//	initialization //

	public static void initialization() {

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/riyas/Downloads/chromedriver");
		 driver = new ChromeDriver();

		}

		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/riyas/Downloads/geckodriver");
		 driver = new FirefoxDriver();

		}
		
		
		driver.get("http://automationpractice.com/index.php");
	}
}
