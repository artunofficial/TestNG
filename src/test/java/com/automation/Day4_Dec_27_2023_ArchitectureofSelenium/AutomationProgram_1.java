package com.automation.Day4_Dec_27_2023_ArchitectureofSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationProgram_1 {

	public static void main(String[] args) {
		// We are using WebDriver to code in Selenium Automation
		//WebDriver is very important
		//Java is sensitive language
		
		
		WebDriver driver = new ChromeDriver();
		
		//CTRL + SHIFT + O       |  USE THIS SHORTCUT AFTER EVERY PACKAGE
		//Shortcut for packages in the pom.xml 
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		//!!!!USE THE SHORTCUT AFTER TYPE THIS PACKAGE CODE or CODES!!!!
		
		
		driver.manage().window().maximize();
		driver.get("https://costco.com/");
		driver.quit();
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://bestbuy.com");
		driver1.quit();
		
		WebDriver driver2 = new EdgeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://rediff.com");
		driver2.quit();
		
		
		
	}

}
