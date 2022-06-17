package com.pom;

import org.openqa.selenium.WebElement;



public class Access extends PojoClass{

	
	public static void main(String[] args) {
		
		BaseClass bc = new BaseClass();
		bc.browserLaunch();
		bc.launchURL("http://adactinhotelapp.com/");
//		WebElement Locator = bc.findLocator("id", "username");
//		bc.sendKeys(Locator, "vijaymani");
//		WebElement locator2 = bc.findLocator("id", "password");
//		bc.sendKeys(locator2, "123456789@1");
//		WebElement locator3 = bc.findLocator("name", "login");
//		bc.btnLogin(locator3);
//		
		PojoClass po = new PojoClass();
		po.loginpage("vijaymaniG", "vidhun14#");
		
		
		
		
	}
}
