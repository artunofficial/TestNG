package com.automation.Day11_Jan_23_B_New_Browser_Window_Tab_In_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A_New_Tab_New_Window {
	
	public WebDriver driver;
	
	@Test
	public void openNewTab() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://rediff.com"); //this also means get me all the WebElements of this page
		//WebDriver will acknowledge all the WebElements to load
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://costco.com");
		//I want to naviage back to rediff
		//driver.navigate().back() - this one will go back page 
		driver.navigate().to("https://rediff.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://flipkart.com");
		driver.navigate().to("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		
		//driver.get("url"); this is opening browser
		//driver.navigate().to("url"); //this is also opening the browser
		
		
		
	}
	
	@Test
	public void howToUseClear() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("email@email.com");
		Thread.sleep(2000);
		driver.findElement(By.id("login1")).clear();
		driver.findElement(By.id("login1")).sendKeys("email1@email.com");
	}

}
