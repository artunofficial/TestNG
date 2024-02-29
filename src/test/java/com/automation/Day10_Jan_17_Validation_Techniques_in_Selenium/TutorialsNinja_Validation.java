package com.automation.Day10_Jan_17_Validation_Techniques_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja_Validation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		//Title of the page  - this is first validation we need to do
		String actualTitle = driver.getTitle(); //We know that the title is a String
		System.out.println(actualTitle); // this will print the title of this webpage
		
		String expectedTitle = "Your Store";
//		
//		//CurrentUrl we moved here from below
		String actualCurrentUrl = driver.getCurrentUrl();
		System.out.println(actualCurrentUrl);
		String expectedCurrentUrl = "https://tutorialsninja.com/demo/";

		
		if(expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl)) {
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
		}else {
			System.out.println("The title and current url are incorrect");
		}
		
		//let's validate the login page
		String actualLoginPageTitle = driver.getTitle();
		System.out.println(actualLoginPageTitle);
		String expectedLoginPageTitle = "Account Login";
		
		String actualLoginPageCurrentUrl = driver.getCurrentUrl();
		System.out.println(actualLoginPageCurrentUrl);
		String expectedLoginPageCurrentUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";
		
		if(actualLoginPageTitle.equals(expectedLoginPageTitle) && actualLoginPageCurrentUrl.equals(expectedLoginPageCurrentUrl)) {
			driver.findElement(By.id("input-email")).sendKeys("jesuschristian@aol.com");
			driver.findElement(By.id("input-password")).sendKeys("jesuslovesyou");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		}else {
			System.out.println("The title and curren url of Login Page are incorrect");
		}
	}
	

}
