package com.java.Day7_Jan_9_2024_ControlStatements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Switch_Statement {

	public static void main(String[] args) {
		// switch statement is a multi-way branch statement
		// switch statements defines multiple paths of execution of a program
		// if there is more data, you can use switch statement instead of "if"
		// switch statement provides better alternative than a large series of if-else
		// statement

		anotherSwitchExample();
		
		switch ("Selenium")// the variable to be tested. This variable could be an int/String/char)
		{
		case "Part1":
			String S1 = "Selenium";
			String S2 = "Java";
			System.out.println(S1 + S2);
			break;
		}

		switch ("Browser Configurate With Selenium")
		// the variable to be tested. This variable could be an int/String/char)
		{
		case "Chrome":
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com");
			break;
		case "Firefox":
			WebDriver driver1 = new FirefoxDriver();
			driver1.manage().window().maximize();
			driver1.get("https://rediff.com");
			break;
		default:
			WebDriver driver2 = new InternetExplorerDriver();
			driver2.manage().window().maximize();
			driver2.get("https://rediff.com");
		}
		} // default is also alternative, it must be there always, otherwise if other
			//switch statements dead, default required
		
		public static void anotherSwitchExample() {
			char someCharacter = 'a';
			switch (someCharacter) {
			case 'b' :
				System.out.println('b');
				break;
			case 'a' :
				System.out.println('a');
				break;
			case 'c' :
				System.out.println('c');
				break;
			default:
				System.out.println("Not in 'e' or 'b' or 'c'");
			}
		
	}

}
