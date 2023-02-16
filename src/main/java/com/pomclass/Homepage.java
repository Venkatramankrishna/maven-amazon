package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
	
	public Homepage(WebDriver drive) {
		this.driver=drive;
		PageFactory.initElements(driver, this);
		}
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchbox;
	
	@FindBy(id = "nav-search-submit-button")
	private WebElement submit;
	
	@FindBy(xpath = "//img[@src='https://m.media-amazon.com/images/I/91BSflfKpJL._AC_UY218_.jpg']")
	private WebElement tecno;
	
	@FindBy(id = "add-to-cart-button")
	private WebElement cartbtn;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getTecno() {
		return tecno;
	}

	public WebElement getCartbtn() {
		return cartbtn;
	}
	
	
	

}
