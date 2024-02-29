package com.TestNG.Day16_Feb_7_A_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class F_TestCases_SeperateClass {
	//This class will hold only Test Cases
public WebDriver driver;
	
	@Test(dataProvider = "TNLogin", priority = 1, dataProviderClass = E_DataProviders_SeperateClass.class)
	public void loginTest(String email, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.input.btn-primary")).click();
		driver.quit();
		
	}
	
	@Test(dataProvider = "TNRegister", priority = 2, dataProviderClass = E_DataProviders_SeperateClass.class)
	public void registerTest(String firstName, String lastName, String email, String telephone, String password, String confirmPassword) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys(telephone);
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys(confirmPassword);
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]")).click();
		driver.quit();
	}
}
