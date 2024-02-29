package com.automation.Day15_Feb_6_B_Applying_OOPs_In_Automation;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E_TestBase {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	
	public E_TestBase() throws Exception {
		prop = new Properties();
//		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation\\Day15_Feb_6_B_Applying_OOPs_In_Automation\\config.properties");
		//ORIJINALI // deki
		ip = new FileInputStream("C:\\Users\\artun\\eclipse-workspace\\MAVEN_PROJECT1_WEBDRIVERMANAGER\\src\\test\\java\\com\\automation\\Day15_Feb_6_B_Applying_OOPs_In_Automation\\config.properties");
	    prop.load(ip);
	}
	
	public WebDriver initalizeBrowserAndOpenApplication(String browserName) {
		
		if(browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equals("Edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("None of the browser matches");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(400));
		driver.get(prop.getProperty("url"));
		
		return driver;
		
	}

}
