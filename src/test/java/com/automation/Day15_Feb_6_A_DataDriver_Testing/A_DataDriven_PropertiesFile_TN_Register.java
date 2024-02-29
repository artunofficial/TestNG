package com.automation.Day15_Feb_6_A_DataDriver_Testing;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_DataDriven_PropertiesFile_TN_Register {
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	
	
	@Test
	public void readRegisterDataFromProtertiesFile() throws Exception {
		
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation\\Day15_Feb_6_A_DataDriver_Testing\\config_Register.properties");
		prop.load(ip);
	}
	
	
	public void RegisterCode() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys(prop.getProperty("telephone"));
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys(prop.getProperty("confirmPassword"));
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]")).click();
		
	}
	

	public void RegisterNoDetailsEnteredCode() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();

		driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]")).click();
		
		String actualPrivacyPolicyWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyPolicyWarningMessage = prop.getProperty("privacyPolicyWarningMessage");
		Assert.assertTrue(actualPrivacyPolicyWarningMessage.contains(expectedPrivacyPolicyWarningMessage));
		
		String actualFirstNameWarningMessage = driver.findElement(By.cssSelector("input#input-firstname+div")).getText();
		String expectedFirstNameWarningMessage = prop.getProperty("firstNameWarningMessage");
		Assert.assertTrue(actualFirstNameWarningMessage.contains(expectedFirstNameWarningMessage));
		
		String actualLastNameWarningMessage = driver.findElement(By.cssSelector("input#input-lastname+div")).getText();
		String expectedLastnameWarningMessage = prop.getProperty("lastNameWarningMessage");
		Assert.assertTrue(actualLastNameWarningMessage.contains(expectedLastnameWarningMessage));
		
		String actualEmailWarningMessage = driver.findElement(By.cssSelector("input#input-email+div")).getText();
		String expectedEmailWarningMessage = prop.getProperty("emailWarningMessage");
		Assert.assertTrue(actualEmailWarningMessage.contains(expectedEmailWarningMessage));
		
		String actualTelephoneWarningMessage = driver.findElement(By.cssSelector("input#input-telephone+div")).getText();
		String expectedTelephoneWarningMessage = prop.getProperty("telephoneWarningMessage");
		Assert.assertTrue(actualTelephoneWarningMessage.contains(expectedTelephoneWarningMessage));
		
		String actualPasswordWarningMessage = driver.findElement(By.cssSelector("input#input-password+div")).getText();
		String expectedPasswordWarningMessage = prop.getProperty("passwordWarningMessage");
		Assert.assertTrue(actualPasswordWarningMessage.contains(expectedPasswordWarningMessage));
		
	}
}
