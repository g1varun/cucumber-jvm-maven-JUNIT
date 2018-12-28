package com.czeczotka.bdd.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

	public static WebDriver driver;
	
	public static void openBrowser(){
		String Path = System.getProperty("user.dir")+"/browser/chromedriver";
		System.setProperty("webdriver.chrome.driver", Path);
		driver = new ChromeDriver();
		
	}
}