package com.Cucumber;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ELCOT\\eclipse-workspace-selenium\\Maven_Project\\src\\test\\java\\com\\feature", 
glue = "com.stepdefinition" ,
monochrome = true ,
dryRun = false ,
strict = true ,
plugin = {"html:Reports/Html_Report.html",
		"pretty",
		"json:Reports/Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"})

public class Test_Runner {
public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		

		
	}

	

}