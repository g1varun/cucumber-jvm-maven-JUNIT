package com.czeczotka.bdd.steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

	public class loginScript {

		@Given ("user launch browser$")
		public void openURL(){
			System.out.print("ahskjhaskj");
			Hook.openBrowser();
		}
		
		
		@Then("user opens application page$")
		public void launchapplication() throws Throwable
			{
			
			Hook.driver.get("http://newtours.demoaut.com/mercurysignon.php");
			Hook.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
		
		@Then("user enters Credentials to LogIn$")
		public void login() throws InterruptedException{
				
				WebElement username = Hook.driver.findElement(By.cssSelector("input[name='userName']"));
				username.sendKeys("a");
				
				WebElement password = Hook.driver.findElement(By.cssSelector("input[name='password']"));
				password.sendKeys("b");
				
				WebElement submit = Hook.driver.findElement(By.cssSelector("input[name='login']"));
				submit.click();
				Thread.sleep(3000);
				
				WebElement signoff = Hook.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
				signoff.click();
				Thread.sleep(3000);
		}

	
		 @When("^I enter valid data on the page$") 
		   public void enterData(DataTable table){ 
		      //Initialize data table 
		      List<List<String>> data = table.raw();
		      System.out.println(data.get(1).get(1)); 
		      
		      //Enter data
		      Hook.driver.findElement(By.name("firstname")).sendKeys(data.get(1).get(1));
		      Hook.driver.findElement(By.name("lastname")).sendKeys(data.get(2).get(1));
		      Hook.driver.findElement(By.name("reg_email__")).sendKeys(data.get(3).get(1));     
		      Hook.driver.findElement(By.name("reg_email_confirmation__")).sendKeys(data.get(4).get(1)); 
		      Hook.driver.findElement(By.name("reg_passwd__")).sendKeys(data.get(5).get(1)); 
		      
		      Select dropdownB = new Select(Hook.driver.findElement(By.name("birthday_day"))); 
		      dropdownB.selectByValue("15"); 
				
		      Select dropdownM = new Select(Hook.driver.findElement(By.name("birthday_month")));
		      dropdownM.selectByValue("6"); 
				
		      Select dropdownY = new Select(Hook.driver.findElement(By.name("birthday_year")));
		      dropdownY.selectByValue("1990"); 
				
		      Hook.driver.findElement(By.className("_58mt")).click(); 
		      // Click submit button driver.findElement(By.name("websubmit")).click(); 
		   } 
		
		
		
		
		@Then("close the browser$")
		public void close_browser() throws Throwable
		{
			Hook.driver.quit();
		}
	}