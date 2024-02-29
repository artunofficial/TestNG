package com.automation.Day8_Jan_10_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja {

	public static void main(String[] args) {
		loginTNUsingXpath(); 
		registerTNUsingXpath();

	}

	public static void loginTNUsingXpath() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("jesuschristian01@aol.com");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("jesuslovesyou");
		driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]")).click();
	}
	
	public static void registerTNUsingXpath() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Register')]")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Jesus");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Christian");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("jesuschristianbaby@aol.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("911");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("jesuslovesyou");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("jesuslovesyou");
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]")).click();
	}
}
