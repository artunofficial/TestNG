package com.automation.Day15_Feb_6_C_Wait_Conditions_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B_Login_ExplicitWait {

	public WebDriver driver;
	public WebDriverWait wait;
	
	public void validCredentials() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("My Account")));
		driver.findElement(By.linkText("My Account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));
		
	}
	

		
		
	
}
