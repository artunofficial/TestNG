package com.automation.Day6_Jan_2_2024_Locators_In_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja {

	public static void main(String[] args) {
		createAccount();
		loginWithTheCreatedAccount();

	}
	
	/**
	 * 
	 */
	/**
	 * 
	 */
	/**
	 * 
	 */
	public static void createAccount() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Jesus");
		driver.findElement(By.id("input-lastname")).sendKeys("Christian");
		driver.findElement(By.id("input-email")).sendKeys("jesuschristian44@earthlink.com");
		driver.findElement(By.id("input-telephone")).sendKeys("911");
		driver.findElement(By.id("input-password")).sendKeys("jesuslovesyou");
		driver.findElement(By.id("input-confirm")).sendKeys("jesuslovesyou");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Continue")).click();
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue"));
		
		
		
		
		
	}
	
	public static void loginWithTheCreatedAccount() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("jesuschristian44@earthlink.com");
		driver.findElement(By.id("input-password")).sendKeys("jesuslovesyou");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();
	}
	
}
