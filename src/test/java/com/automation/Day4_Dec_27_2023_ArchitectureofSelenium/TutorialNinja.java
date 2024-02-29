package com.automation.Day4_Dec_27_2023_ArchitectureofSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TutorialNinja {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.quit();
		
		WebDriver driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
		driver2.get("https://qafox.com/");
		driver2.quit();
		
		

	}

}
