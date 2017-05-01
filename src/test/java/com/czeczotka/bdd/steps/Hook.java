package com.czeczotka.bdd.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

	public static WebDriver driver;
	
	public static void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "/Users/ankugupta/Downloads/chromedriver");
		driver = new ChromeDriver();
		
	}
}