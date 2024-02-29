package com.TestNG.Day10_Jan_17_Introduction_to_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo_Application_In_Automation {

	public WebDriver driver;
	
	@BeforeMethod
	public void opentheWebsite() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialsninja.com/demo/");
	}
	
	@Test(priority=1) //Priority added later to give priority to code want to run it first
	public void tryRegisterWithoutEmail() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Register')]")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Jesus");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Christian");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("911");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("jesuslovesyou");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("jesuslovesyou");
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]")).click();
		
	}
	
	@Test(priority=2)
	public void tryRegisterUnmatchPassword() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Register')]")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Jesus");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Christian");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("jesuschristianbaby@aol.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("911");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("jesuslovesyou");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("jesushatesyou");
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]")).click();
	}
	
	@Test
	public void tryRegisterWithoutClickingAgreeButton() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Register')]")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Jesus");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Christian");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("jesuschristianbaby@aol.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("911");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("jesuslovesyou");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("jesuslovesyou");
		driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]")).click();
	}
	
	@Test
	public void tryRegisterWithInvalidPhoneNumber() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Register')]")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Jesus");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Christian");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("jesuschristianbaby@aol.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("ilovepussycat");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("jesuslovesyou");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("jesuslovesyou");
		driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]")).click();
	}
	
	@Test(priority=3)
	public void tryRegisterWithoutPassword() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Register')]")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Jesus");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Christian");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("jesuschristianbaby@aol.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("911");
		driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]")).click();
	}
	
	@AfterMethod
	public void closeWebsite() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}
}
