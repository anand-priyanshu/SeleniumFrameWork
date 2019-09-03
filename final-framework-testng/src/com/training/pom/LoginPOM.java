package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath="//div[@class='mob_no_row form_gap']//input[@placeholder='Enter Your Mobile Number']")
	private WebElement userName; 
	
	@FindBy(xpath="//input[@placeholder='Enter Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='frm_btn_active sign_in']")
	private WebElement loginBtn; 
	
	
	
	public WebElement login(){
		return login;
	}
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
}
