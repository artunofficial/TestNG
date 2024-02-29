package com.TestNG.Day12_Jan_24_A_Assertions_In_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C_Register_Assertions_Using_Assert {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}
	
	@Test(priority=1)
	public void RegisterWithoutEnteringAnyFields() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualPrivacyPolicyWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyWarningMessage = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(actualPrivacyPolicyWarningMessage, expectedPrivacyWarningMessage);
		
		String actualFirstnameWarningMessage = driver.findElement(By.cssSelector("input#input-firstname+div")).getText();
		String expectedFirstnameWarningMessage = "First Name must be between 1 and 32 characters!";
		Assert.assertTrue(actualFirstnameWarningMessage.contains(expectedFirstnameWarningMessage));
		
		String actualLastnameWarningMessage = driver.findElement(By.cssSelector("input#input-lastname+div")).getText();
		String expectedLastnameWarningMessage = "Last Name must be between 1 and 32 characters!";
		Assert.assertTrue(actualLastnameWarningMessage.contains(expectedLastnameWarningMessage));
		
		String actualEmailWarningMessage = driver.findElement(By.cssSelector("input#input-email+div")).getText();
		String expectedEmailWarningMessage = "E-Mail Address does not appear to be valid!";
		Assert.assertTrue(actualEmailWarningMessage.contains(expectedEmailWarningMessage));
		
		String actualTelephoneWarningMessage = driver.findElement(By.cssSelector("input#input-telephone+div")).getText();
		String expectedTelephoneWarningMessage = "Telephone must be between 3 and 32 characters!";
		Assert.assertTrue(actualTelephoneWarningMessage.contains(expectedTelephoneWarningMessage));
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input#input-password+div")).isDisplayed());
	}
}

