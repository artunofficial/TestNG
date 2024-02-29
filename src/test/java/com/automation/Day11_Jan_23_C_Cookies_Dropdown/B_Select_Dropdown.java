package com.automation.Day11_Jan_23_C_Cookies_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class B_Select_Dropdown {
	public WebDriver driver;
	public Select select;
	
	@Test
	public void facebookDateOfBirthDropdown() throws Exception {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Artun");
		driver.findElement(By.name("lastname")).sendKeys("Cagan");
		
		//June 10 2020
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jun");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("10");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("2020");
		
	}
}
