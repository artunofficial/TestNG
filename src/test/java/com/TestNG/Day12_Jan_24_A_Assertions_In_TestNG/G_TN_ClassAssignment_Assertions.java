package com.TestNG.Day12_Jan_24_A_Assertions_In_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class G_TN_ClassAssignment_Assertions {
	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	
	
	@BeforeMethod
	public void registerAssertions() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}
	
	@Test(priority=1)
	public void registerWithNoInputs() {
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
		
		String actualPasswordWarningMessage = driver.findElement(By.cssSelector("input#input-password+div")).getText();
		String expectedPasswordWarningMessage = "Password must be between 4 and 20 characters!";
		Assert.assertTrue(actualPasswordWarningMessage.contains(expectedPasswordWarningMessage));
		
		
	}
	
	@Test(priority=2)
	public void registerWithMandatoryDetails() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Wendy");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Patties");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("hungrygabi@mcdo.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("911");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("feedmedaddy");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("feedmedaddy");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	
	@Test(priority=3)
	public void registerWithAllDetails() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Wendy");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Patties");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("hungrygabi1@mcdo.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("911");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("feedmedaddy");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("feedmedaddy");
		driver.findElement(By.xpath("//input[@name ='newsletter' and @value='1'"));
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	
	@Test(priority=4)
	public void registerWithExistingEmail() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Wendy");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Patties");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("hungrygabi1@mcdo.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("911");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("feedmedaddy");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("feedmedaddy");
		driver.findElement(By.xpath("//input[@name ='newsletter' and @value='1'"));
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualExistingEmailWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedExistingEmailWarningMessage = "Warning: E-Mail Address is already registered!";
		Assert.assertTrue(actualExistingEmailWarningMessage.contains(expectedExistingEmailWarningMessage));
		
	}
	
	@Test(priority=5)
	public void registerWithWrongConfirmPassword() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda112212@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123456");
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value='1']")).click();
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input#input-confirm+div")).isDisplayed());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
