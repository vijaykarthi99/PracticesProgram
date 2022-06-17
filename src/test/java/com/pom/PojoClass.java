package com.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class PojoClass extends BaseClass {
	PojoClass l;
	BaseClass b;
	Select select;
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement txtUserName;
	@FindBy(id="password")
	private WebElement txtUserPassword;
	@FindBy(name="login")
	private WebElement login;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtUserPassword() {
		return txtUserPassword;
	}
	public WebElement getLogin() {
		return login;
	}
	
	public void loginpage(String name, String passw) {
		l=new PojoClass();
		l.enterText(getTxtUserName(), name);
		l.enterText(getTxtUserPassword(), passw);
		l.btnLogin(login);
		
	}
	public void location(WebElement locat ) {
		l.findLocator("id", "location");
		select = new Select(locat);
		select.selectByIndex(3);		
		
	}
	
	
	
	
	
	
//	l.findLocator("id", "hotels");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
