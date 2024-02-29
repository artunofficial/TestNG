package com.automation.Day8_Jan_10_Xpaths;

public class Xpath_Notes {

	public static void main(String[] args) {
		
		//Relative Xpath
		//Has certain syntaxes. We have to practice those syntaxes:

		//1st Syntax – Most Basic Syntax
		//htmltag[@attribute = ‘valueofattribute’]

		//a[@class = ‘signin’]

		/*
		 * What are one condition you need to satisfy to write Relative Xpath? You can
		 * not write it to your notepad etc. 1. You need to know where to write Xpath 2.
		 * CTRL + F in your webpage 3. Write Xpath in the editor 4. Make sure it is 1 5.
		 * If it shows 0 of 0 that means your xpath is incorrect
		 */

		//2nd Syntax
		//htmltax[@attribute1 = ‘value’ and @attribute = ‘value’]
		//input[@id = ‘login’ and @name = ‘login’]
		//input[@id = 'password' and @name = 'passwd']
		//input[@name = 'proceed' and @class = 'signinbtn']

		//3rd Syntax
		//htmltax[@attribute1 = ‘value’ or@attribute = ‘value’]
		//input[@id = ‘login’ or @name = ‘login’]
		//input[@id = 'password' or @name = 'passwd']
		//input[@name = 'proceed' and @class = 'signinbtn']

		//4th Syntax (Related mostly to links)
		//htmltag[text() = ‘valueofthetext’]
		//a[text() = ‘Create Account’]

		//5th and 6th Syntax (used for links as well as other WebElements) – Popular Syntax
		//htmltag[contains(text(), ‘valueofthetext’)] – mostly used for links
		//htmltag[contains(@attribute, ‘valueofattribute’] – this is used for other WebElements
		//input[contains(@id, ‘login1’)]


	}

}
