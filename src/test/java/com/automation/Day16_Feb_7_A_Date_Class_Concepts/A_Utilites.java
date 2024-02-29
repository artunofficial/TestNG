package com.automation.Day16_Feb_7_A_Date_Class_Concepts;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A_Utilites {

	//seleniumpanda@gmail.com
	//seleniumpanda1@gmail.com
	//seleniumpanda3000@gmail.com
	
	public WebDriver driver;
	
	
	@Test(invocationCount = 10)
	public void registerCodeWithEmailStyleUpdated() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Am");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Yalayan");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys(emailTimeStamp()); //we need to take care of this
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("911");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("amyalayan");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("amyalayan");
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]")).click();
		driver.quit();
	}
	
	@Test
	public String emailTimeStamp() {
		Date date = new Date();
		System.out.println(date); //Wed Feb 07 22:15:09 EST 2024 
		
		//Wed Feb 07 22:15:09 EST 2024 - You have to replace the spaces with underscore
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_"); //Wed_Feb_07_22_23_12_EST_2024
		System.out.println(timeStamp);
		
		return "amyalayanadam" + timeStamp + "@aol.com";
	
	}
}
