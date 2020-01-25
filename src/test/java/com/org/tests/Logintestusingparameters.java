package com.org.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logintestusingparameters {

	@Test
	public void steup(){
		
	//	System.setProperty("webdriver.chrome.driver","path to chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");

	}

}
