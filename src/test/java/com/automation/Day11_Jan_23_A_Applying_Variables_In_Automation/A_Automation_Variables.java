package com.automation.Day11_Jan_23_A_Applying_Variables_In_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A_Automation_Variables {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void launchUrl() {
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("My Account")).click();
		
	}
	
	@Test(priority=1)
	public void loginTest1() {
		driver.findElement(By.id("input-email")).sendKeys("email@email.com");
	}
	
	@Test(priority=2)
	public void loginTest2() {
		
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
}
