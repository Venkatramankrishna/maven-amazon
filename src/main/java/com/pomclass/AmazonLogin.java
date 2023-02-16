package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {
	public WebDriver driver;
	@FindBy(id="ap_email")
	private WebElement username;
	
	@FindBy(id = "continue")
	private WebElement click;
	
	@FindBy(id = "ap_password")
	private WebElement password;
	
	@FindBy(id = "signInSubmit")
	private WebElement submit;


	public AmazonLogin(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
public WebElement getUsername() {
		return username;
	}
public WebElement getClick() {
		return click;
	}
public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	

	

}
