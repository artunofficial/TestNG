package com.automation.Day6_Jan_2_2024_Locators_In_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja_ClassAssigmentPart1 {

	public static void main(String[] args) {
		registerAccount1();
		TutorialsNinja_ClassAssigmentPart2.loginAccount1();
		
		registerAccount2();
		TutorialsNinja_ClassAssigmentPart2.loginAccount2();
		
		registerAccount3();
		TutorialsNinja_ClassAssigmentPart2.loginAccount3();
		
		
	}
	
	public static void registerAccount1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Jesus");
		driver.findElement(By.id("input-lastname")).sendKeys("Christian");
		driver.findElement(By.id("input-email")).sendKeys("jesuschristian01@aol.com");
		driver.findElement(By.id("input-telephone")).sendKeys("911");
		driver.findElement(By.id("input-password")).sendKeys("jesuslovesyou");
		driver.findElement(By.id("input-confirm")).sendKeys("jesuslovesyou");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
		
	}
	
	public static void registerAccount2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Jesus");
		driver.findElement(By.id("input-lastname")).sendKeys("Christian");
		driver.findElement(By.id("input-email")).sendKeys("jesuschristian02@aol.com");
		driver.findElement(By.id("input-telephone")).sendKeys("911");
		driver.findElement(By.id("input-password")).sendKeys("jesuslovesyou");
		driver.findElement(By.id("input-confirm")).sendKeys("jesuslovesyou");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}
	
	public static void registerAccount3() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Jesus");
		driver.findElement(By.id("input-lastname")).sendKeys("Christian");
		driver.findElement(By.id("input-email")).sendKeys("jesuschristian03@aol.com");
		driver.findElement(By.id("input-telephone")).sendKeys("911");
		driver.findElement(By.id("input-password")).sendKeys("jesuslovesyou");
		driver.findElement(By.id("input-confirm")).sendKeys("jesuslovesyou");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}
	
}
