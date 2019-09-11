package com.ibm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestWebappPOM {

	WebDriver driver;

	public TestWebappPOM(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By name=By.name("uname");
	By pwd=By.name("psw");
	By login=By.xpath("//*[text()='Login']");
	By text=By.xpath("//body//h3");
	
	
	public void enterName(String name){
		
		driver.findElement(this.name).sendKeys(name);
		
		}
	public void enterPassword(String password){
		
		driver.findElement(pwd).sendKeys(password);
	}
	
	public void login(){
		
		driver.findElement(login).click();
	}
	
	
	public String text(){
		
	String res=	driver.findElement(text).getText();
	return res;
	}
	
	
	
	
}
