package com.automation.Day6_Jan_2_2024_Locators_In_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_HeaderLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		
		//driver.findElement(By.className("vdicon")).click();
		//driver.findElement(By.className("moneyicon relative")).click();
		//Why we cant use compounded values directly (2 values), when there is space; thats compounded
		//driver.findElement(By.className("bmailicon relative")).click();
	
			
			//Create Account - Text of the link
			//Create Acc - Partio text of the link
			
			//driver.findElement(By.partialLinkText("Create Acc")).click();
			
			//driver.findElement(By.linkText("Investors")).click();
			//driver.findElement(By.partialLinkText("Investor")).click();
			
			//driver.findElement(By.linkText("Advertise with us")).click();
			//driver.findElement(By.partialLinkText("Advertise with")).click();
			
			//driver.findElement(By.linkText("Privacy")).click();
			//driver.findElement(By.partialLinkText("Privac")).click();
		
			//driver.findElement(By.linkText("Rediff Labs")).click();
			//driver.quit();
			
			//driver.findElement(By.partialLinkText("Rediff Lab")).click();
			//driver.quit();
			
			driver.findElement(By.partialLinkText("Feedba")).click();
			driver.quit();
			
			
		}
		
	}


