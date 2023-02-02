package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Helper;

public class BaseTest {

	Properties prop;
	WebDriver driver;
	@Before
	public void openBrowser() throws IOException {
		prop = Helper.readProfFile("/Users/rainnyrin/BTC07312021M/Maven_Project");
		String b = prop.getProperty("browser");
		
		if(b.equals("chrome")) {
			driver= new ChromeDriver();
			System.out.println("open browser");
		}
		else if(b.equals("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("open browser");
		}
	}
}
