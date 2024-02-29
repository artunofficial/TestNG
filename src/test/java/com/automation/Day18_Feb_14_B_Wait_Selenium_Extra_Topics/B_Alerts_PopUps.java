package com.automation.Day18_Feb_14_B_Wait_Selenium_Extra_Topics;

import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class B_Alerts_PopUps {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test
	public void handlingAlertOrPopUps() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		//Alert will popup
		
		Alert alert = driver.switchTo().alert();
		//Alert is an Interface | THIS IS IMPORTANT INTERVIEW QUESTION
		//What is the text inside the Alert:
		System.out.println("The text inside the Alert window :" + alert.getText());
		//Either you accept the alert or dismiss the alert 
		alert.accept();
		//alert.dismiss(); this is if there is cross to dismiss the alert
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		
	}

}
