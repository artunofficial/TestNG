package com.TestNG.Day16_Feb_7_A_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D_MultipleTestCases_MultipleDataProviders_SameClass {

public WebDriver driver;
	
	@Test(dataProvider = "getTNLoginData", priority = 1)
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
	
	@Test(dataProvider = "getTNRegisterData", priority = 2)
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
	
	@DataProvider
	public Object[][] getTNRegisterData() {
		Object[][] data = { {"Am", "Yalayan", "amyalayan1@aol.com", "911", "amyalayan", "amyalayan"},
							{"Got", "Delgisi", "gotdelgisi1@aol.com", "911", "gotdelgisi", "gotdelgisi"},
							{"Koca", "Tassakli", "kafaharic21cm1@aol.com", "911", "kocatassak", "kocatassak"},
							{"Big", "Dick", "drbigdick1@aol.com", "911", "drbigdick", "drbigdick"}};
		return data;
		}
	
	@DataProvider
	public Object[][] getTNLoginData() {
		Object[][] data = { {"seleniumpanda@gmail.com" , "Selenium@123"},
							{"seleniumpanda1@gmail.com" , "Selenium@123"},
							{"seleniumpanda2@gmail.com" , "Selenium@123"},
							{"seleniumpanda3@gmail.com" , "Selenium@123"},
							{"seleniumpanda4@gmail.com" , "Selenium@123"},
							{"seleniumpanda5@gmail.com" , "Selenium@123"},
							{"seleniumpanda6@gmail.com" , "Selenium@123"},
							{"seleniumpanda7@gmail.com" , "Selenium@123"},
							{"seleniumpanda8@gmail.com" , "Selenium@123"},
							{"seleniumpanda9@gmail.com" , "Selenium@123"}};
							
		return data;
}
}
