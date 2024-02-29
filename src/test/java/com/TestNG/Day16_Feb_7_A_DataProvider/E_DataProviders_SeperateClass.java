package com.TestNG.Day16_Feb_7_A_DataProvider;

import org.testng.annotations.DataProvider;

public class E_DataProviders_SeperateClass {
	//This class will hold only @DataProviders
	
	@DataProvider(name = "TNRegister")
	public Object[][] getTNRegisterData() {
		Object[][] data = { {"Am", "Yalayan", "amyalayan1@aol.com", "911", "amyalayan", "amyalayan"},
							{"Got", "Delgisi", "gotdelgisi1@aol.com", "911", "gotdelgisi", "gotdelgisi"},
							{"Koca", "Tassakli", "kafaharic21cm1@aol.com", "911", "kocatassak", "kocatassak"},
							{"Big", "Dick", "drbigdick1@aol.com", "911", "drbigdick", "drbigdick"}};
		return data;
		}
	
	@DataProvider(name = "TNLogin")
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
