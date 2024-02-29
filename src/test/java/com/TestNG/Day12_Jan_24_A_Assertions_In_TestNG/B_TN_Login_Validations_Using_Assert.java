package com.TestNG.Day12_Jan_24_A_Assertions_In_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//All the warning messages or success messages - try to save it in the for of a String and then validate

public class B_TN_Login_Validations_Using_Assert {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
	}
	
	@Test(priority=1)
	public void enterValidEmailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("jesuschristian@earthlink.com");
		driver.findElement(By.id("input-password")).sendKeys("jesuslovesyou");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed()); //This is assertion.
	}
	
	@Test(priority=2)
	public void enterValidEmailInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("jesuschristian@earthlink.com");
		driver.findElement(By.id("input-password")).sendKeys("jesuslovesyou11");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText());
//		WebElement whichHoldsTheWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]"));
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).isDisplayed());
		
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
	}
	

}
