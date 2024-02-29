package com.automation.Day18_Feb_14_C_Mouse_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_Keyboard_Actions {
	
	public WebDriver driver;
	
	@Test
	public void loginTutorialsNinjaKeyboard() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		WebElement passwordTextBox = driver.findElement(By.id("input-password"));
		WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		
		Actions actions = new Actions(driver);
		
		actions.click(emailTextBox).sendKeys("seleniumpanda@gmail.com").perform();
		
		actions.keyDown(emailTextBox, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions.keyDown(emailTextBox, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		actions.keyDown(emailTextBox, Keys.TAB).perform();
		actions.keyDown(passwordTextBox, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		actions.keyDown(loginButton, Keys.ENTER).perform();
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains{@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		
	}

}
