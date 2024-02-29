package com.automation.Day6_Jan_2_2024_Locators_In_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja_ClassAssigmentPart2 {

	public static void loginAccount1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("jesuschristian01@aol.com");
		driver.findElement(By.id("input-password")).sendKeys("jesuslovesyou");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}

	public static void loginAccount2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("jesuschristian02@aol.com");
		driver.findElement(By.id("input-password")).sendKeys("jesuslovesyou");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}

	public static void loginAccount3() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("jesuschristian03@aol.com");
		driver.findElement(By.id("input-password")).sendKeys("jesuslovesyou");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}
}
