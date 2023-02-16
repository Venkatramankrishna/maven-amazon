package com.maven_amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		driver.manage().window().maximize();
		return driver;

	}

	public static WebDriver getUrl(String url) {
		driver.get(url);
		return driver;

	}

	public static void clickonElement(WebElement element) {
		element.click();

	}

	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);

	}
	public static WebDriver close() {
		driver.close();
		return driver;
		
	}
	public static WebDriver quit() {
		driver.quit();
		return driver;
		
	}
	public static void dropdown(WebElement element, String type, String value) {
		Select s=new Select(element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("index")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		}
		else if (type.equalsIgnoreCase("visibleText")) {
			s.selectByVisibleText(value);
		}
		
	}

}
