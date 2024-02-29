package com.automation.Day8_Jan_10_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction_To_Xpaths {

	public static void main(String[] args) {
		//What is Xpath?
		//Address of a Web Element
		
		//How many types of Xpaths are there ?
		//There are 2 types
		//i. Absolute Xpath
		//ii. Relative/Dynamic/Customized Xpath

		//Which Xpath is more accurate ?
		//Absolute Xpath is more accurate
		
		//Which Xpath is safe to use in Automation ?
		//Relative Xpath
		
		//Relative Xpath-------------------------
		//Has certain syntaxes. We have to practive those syntaxes
		
		useOfXpathInCompoundedValueClass();
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("artuncagan");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Landforc3s");
		driver.findElement(By.xpath("//input[@name ='proceed']")).click();
	}
	
		public static void useOfXpathInCompoundedValueClass() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rediff.com");
			driver.findElement(By.xpath("//a[@class = 'bmailicon relative']")).click();
			
		}
		

	

}
