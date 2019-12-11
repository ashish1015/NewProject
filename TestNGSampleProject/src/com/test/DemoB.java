package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class DemoB {
	@Test
	public void run() {
		System.setProperty("webdriver.gecko.driver", "//Users//ashish.tripathi//Documents//Workspace//tools//geckodriver");
		WebDriver driver= new FirefoxDriver();
		Reporter.log("Browser is Opened now.");
		driver.manage().window().maximize();
		Reporter.log("Window Maximized");
		driver.get("https://www.google.co.in");
		Reporter.log("Google site opened");
	}
}
