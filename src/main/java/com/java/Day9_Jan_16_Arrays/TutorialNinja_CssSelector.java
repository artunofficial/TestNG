package com.java.Day9_Jan_16_Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialNinja_CssSelector {

	public static void main(String[] args) {
		LoginTutorial();
		RegisterTutorial();
		}
	
		public static void LoginTutorial() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>ul>li+li>a")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("jesuschristian@aol.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("jesuslovesyou");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}

		public static void RegisterTutorial() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
			driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>ul.dropdown-menu.dropdown-menu-right>li:nth-child(1)>a")).click();
			driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Jesus");
			driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Christian");
			driver.findElement(By.cssSelector("input#input-email")).sendKeys("jesuschristiancss@aol.com");
			driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("911");
			driver.findElement(By.cssSelector("input#input-password")).sendKeys("jesuslovesyou");
			driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("jesuslovesyou");
			driver.findElement(By.cssSelector("a.agree+input")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		}
}
