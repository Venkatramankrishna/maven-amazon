package com.maven_amazon;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pomanager.Manager;
import com.properties.Objectproperty;

public class Runnerclass extends BaseClass {
	public static WebDriver  driver = browserLaunch("chrome");
	public static Manager mpom = new Manager(driver);
	
	
	public static void main(String[] args) throws IOException {
		
		getUrl(Objectproperty.Newclass().getUrl());
		inputValueElement(mpom.getAmazonLogin().getUsername(),Objectproperty.Newclass().getUsername());
		clickonElement(mpom.getAmazonLogin().getClick());
		inputValueElement(mpom.getAmazonLogin().getPassword(), Objectproperty.Newclass().getPassword());
		clickonElement(mpom.getAmazonLogin().getSubmit());
		
	}

	

	

}
