package com.automation.Day6_Jan_2_2024_Locators_In_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Signin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		//Step 1 - We need to click on Sign in Link
		driver.findElement(By.className("signin")).click();
		//Step 2 - Enter Username
		driver.findElement(By.id("login1")).sendKeys("homa_rahimi@rediffmail.com");
		//Step 3 - Enter password
		driver.findElement(By.id("password")).sendKeys("Winter2021?");
		//Step 4 - Click Sign In button
		driver.findElement(By.className("signinbtn")).click();
		//Step 5 - Click logout
		driver.findElement(By.className("rd_logout")).click();
		
	}

}
