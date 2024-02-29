package com.automation.Day18_Feb_14_A_Wait_BrowserOptions;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_ChromeOption_ChromeBrowser {
	//You want to control the speed of your code
	//FASTER, SLOWER, NORMAL
	
	//You can maximize the browser
	//You want to open your code in icognito mode
	//Other things
	
	public WebDriver driver;
	public ChromeOptions options;

	
	@Test
	public void tutorialsNinjaLogin() {
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL); //6.277 Seconds
		options.setPageLoadStrategy(PageLoadStrategy.EAGER); //5.583 Seconds
		options.setPageLoadStrategy(PageLoadStrategy.NONE); //6.8 Seconds
		options.addArguments("--start-maximized");
		options.addArguments("--incognito"); //THEY MIGHT ASK THIS ON INTERVIEW
		options.setExperimentalOption("exludeSwitches", Arrays.asList("enable-automation", "disable-infobars")); 
		//This will remove the Notice "This browser using by software tester"
		
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.co,");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());	
	}
	
	//Learn Firefox also

}
