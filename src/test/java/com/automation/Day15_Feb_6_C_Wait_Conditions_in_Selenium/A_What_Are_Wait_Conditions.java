package com.automation.Day15_Feb_6_C_Wait_Conditions_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class A_What_Are_Wait_Conditions {

	//There are 3 types of wait conditions in Selenium
	
	//1. implictWait
	//2. explicitWait
	//3. fluentWait
	
	public WebDriver driver;
	
	@Test
	public void implicitWaitUnderstanding() {
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(1000));
		
		
		driver.findElement(By.linkText("My Account")).click();
		
	}
	
	@Test
	public void explicitWaitUnderstanding() throws Exception {
		//Java has some wait conditions
		//Threads.sleep() - defined within java
		//WebDriverWait - This is the class which helps us to write Exlicit Wait conditions for Selenium
		//Step 1 - Create the Object of WebDriver Wait
		//Step 2 - The constructor of WebDriverWait() cannot be empty. You have to pass driver and Duration.ofSeconds(10)
		//Step 3 - Use the reference to call the overloaded method until and use ExpectedConditions Class to call lots of methods
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("My Account")));
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Login")).click();
		
	}
	
	
}
