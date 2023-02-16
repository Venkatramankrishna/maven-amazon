package com.pomanager;

import org.openqa.selenium.WebDriver;

import com.pomclass.AmazonLogin;
import com.pomclass.Homepage;

public class Manager {
public WebDriver driver;

public Manager(WebDriver driver2) {
	this.driver=driver2;
}
	 private AmazonLogin al;
	 
	 private Homepage hp;

	 public AmazonLogin getAmazonLogin() {
		if(al==null) {
		al=new AmazonLogin(driver);
		}
		return al;
	}

	public Homepage getHp() {
		hp=new Homepage(driver);
		return hp;
	}

}
