package com.TestNG.Day12_Jan_24_A_Assertions_In_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class D_Failures_In_TestNG_Using_Assert {

	// Which one is more powerful ? enabled = false or alwaysRun = True
	// Enabled = false is more powerful.
	// AlwaysRun = True is make it run it no matter what. If you want to run your
	// Failured code run. You have to use it.

	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();

	}

	@Test(priority = 1)
	public void loginWithValidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("jesuschristian@earthlink.com");
		driver.findElement(By.id("input-password")).sendKeys("jesuslovesyou");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());

	}

	@Test(priority = 2)
	public void loginWithValidEmailInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("jesuschristian@earthlink.com");
		driver.findElement(By.id("input-password")).sendKeys("jesuslovesyou1");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";

	}

	@Test(priority = 3)
	public void loginWithInvalidEmailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("jesuschristian1@earthlink.com");
		driver.findElement(By.id("input-password")).sendKeys("jesuslovesyou");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.fail("Deliberate Failure"); //After this line all the codes will not run because it's FAILED or False
	}
	//After 4th one will be skipped bec of the failure but 6th one will run
	@Test(priority = 4, alwaysRun = true, dependsOnMethods = { "loginWithValidCredentials",
			"loginWithValidEmailInvalidPassword", "loginWithInvalidEmailValidPassword" })
	public void logingWithNoCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("jesuschristian1@earthlink.com");
		driver.findElement(By.id("input-password")).sendKeys("jesuslovesyou");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	}

	@Test(priority = 5)
	public void loginWithCorrectCredentials() {

	}
}
