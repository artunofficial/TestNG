package com.automation.Day9_Jan_16_.CssSelectorcopy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLoging_CssSelectors {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a[class = signin]")).click();
		driver.findElement(By.cssSelector("input[id=login1]")).sendKeys("artuncagan");
	}

}
