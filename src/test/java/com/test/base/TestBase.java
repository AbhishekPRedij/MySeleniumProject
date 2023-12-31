package com.test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase{
	private WebDriver driver = null;

	public void setWebDriver(String browserName) {
		switch (browserName) {
		case "CHROME":
			driver = new ChromeDriver();
			System.out.println("ChromeDriver object created");
			break;
		case "FIREFOX":
			driver = new FirefoxDriver();
			System.out.println("FirefoxDriver object created");
			break;
		case "EDGE":
			driver = new EdgeDriver();
			System.out.println("EdgeDriver object created");
			break;
		default:
			driver = new ChromeDriver();
			System.out.println("ChromeDriver object created");
		}
	}

	public WebDriver getWebDriver() {
		return driver;
	}

	@BeforeClass
	public void beforeClass() {
		String browserName, environment;
		environment = System.getProperty("environment") == null ? "QA" : System.getProperty("environment");
		browserName = System.getProperty("browser") == null ? "CHROME" : System.getProperty("browser");
		// setWebDriver(browserName);
		System.out.println("Executing Testcases in [" + environment + "] environment");
	}
	
	
	@AfterGroups
	public void afterGroups() {
		// driver.close();
		System.out.println("Calling @AfterGroups");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod(ITestResult result) {
		// driver.close();
		System.out.println("Calling @BeforeMethod");
	}
	
	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult result) {
		// driver.close();
		System.out.println("Calling @AfterMethod");
	}
	
	@AfterClass
	public void afterClass() {
		// driver.close();
		System.out.println("Calling @AfterClass");
	}
}