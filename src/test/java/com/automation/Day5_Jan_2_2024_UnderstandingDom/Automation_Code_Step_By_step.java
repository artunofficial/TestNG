package com.automation.Day5_Jan_2_2024_UnderstandingDom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Code_Step_By_step {

	// Step1 - Open the website https://www.tutorialsninja.com/demo
	// Step 2 - Clicked on MyAccount
	// Step 3 - Click on Register
	// Step 4 - Enter firstname, enter lastname, enter email, enter telephone, enter
	// password, enter confirm password
	// Check on privacy polich check box, Click on continune button, continue again
	// Registered an account

	public static void main(String[] args) {

		// Step 1 code
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

		// Step 2 - Click on MyAccount
		// To make this work we have to learn Locators in Selenium
		// There were 8 locators and even today in Selenium 4 these 8 locators are still most important locators
		
		//MOST IMPORTANT LOCATORS in SELENIUM
		//id
		//class
		//name
		//linktext - the html tag is generally a (anchor) 
		//partiallinktext
		//tagname
		//xpath
		//CssSelector
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("jesuslovesyou@aol.com");
		driver.findElement(By.id("input-password")).sendKeys("godblessyou");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();
		
	}

}
