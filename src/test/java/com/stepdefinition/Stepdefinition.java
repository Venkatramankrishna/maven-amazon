package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Cucumber.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	public static WebDriver driver = Test_Runner.driver;
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
		
	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("venkat07");
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Abcd@1234");
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Pages$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Pages() throws Throwable {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@When("^user Select The Location From Location Field$")
	public void user_Select_The_Location_From_Location_Field() throws Throwable {
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(6);
	}

	@When("^user Select The Hotel From Hotel Field$")
	public void user_Select_The_Hotel_From_Hotel_Field() throws Throwable {
		WebElement hotels= driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByVisibleText("Hotel Sunshine");
	}

	@When("^user Select The Room Type From Room Type Field$")
	public void user_Select_The_Room_Type_From_Room_Type_Field() throws Throwable {
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(roomtype);
		s2.selectByValue("Deluxe");
	}

	@When("^user Select The Number of Rooms From Number of Rooms Field$")
	public void user_Select_The_Number_of_Rooms_From_Number_of_Rooms_Field() throws Throwable {
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(roomno);
		s3.selectByIndex(1);
	}

	@When("^user Select CheckIn Date  From CheckIn Date Field$")
	public void user_Select_CheckIn_Date_From_CheckIn_Date_Field() throws Throwable {
		WebElement in = driver.findElement(By.id("datepick_in"));
		in.sendKeys("10/02/2023");
	}

	@When("^user Select CheckOut Date  From CheckOut Date Field$")
	public void user_Select_CheckOut_Date_From_CheckOut_Date_Field() throws Throwable {
		WebElement out = driver.findElement(By.id("datepick_out"));
		out.sendKeys("12/02/2023");
	}

	@When("^user Select Number Of Adult From Number Of Adult Field$")
	public void user_Select_Number_Of_Adult_From_Number_Of_Adult_Field() throws Throwable {
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultroom);
		s4.selectByIndex(1);
	}

	@When("^user Select Number Of Children From Number Of Children Field$")
	public void user_Select_Number_Of_Children_From_Number_Of_Children_Field() throws Throwable {
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select s5 =new Select(childroom);
		s5.selectByIndex(0);
	}

	@Then("^user Click The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
	}

	@When("^user Click The Check Box In Check Box Field$")
	public void user_Click_The_Check_Box_In_Check_Box_Field() throws Throwable {
		WebElement button = driver.findElement(By.id("radiobutton_0"));
		button.click();
	}

	@Then("^user Click The Continue Button And It Navigates To The Book Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page() throws Throwable {
		WebElement b2 = driver.findElement(By.id("continue"));
		b2.click();
	}

	@When("^user Enter First Name In First Name Field$")
	public void user_Enter_First_Name_In_First_Name_Field() throws Throwable {
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Venkat");
	}

	@When("^user Enter Last Name In Last Name Field$")
	public void user_Enter_Last_Name_In_Last_Name_Field() throws Throwable {
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("K");
	}

	@When("^user Enter Billing Address In Billing Address Field$")
	public void user_Enter_Billing_Address_In_Billing_Address_Field() throws Throwable {
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("no.1 doctor colony, chrompet");
	}

	@When("^user Enter CCNumber In CCNumber Field$")
	public void user_Enter_CCNumber_In_CCNumber_Field() throws Throwable {
		WebElement cardnumber = driver.findElement(By.id("cc_num"));
		cardnumber.sendKeys("1234567898765432");
	}

	@When("^user Select CCType From CCType Field$")
	public void user_Select_CCType_From_CCType_Field() throws Throwable {
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cardtype);
		s6.selectByIndex(3);
	}

	@When("^user Select Expiry Date From Date Field$")
	public void user_Select_Expiry_Date_From_Date_Field() throws Throwable {
		WebElement exp_month = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(exp_month);
		s7.selectByIndex(7);
	}

	@When("^user Select Expiry Year From Year Field$")
	public void user_Select_Expiry_Year_From_Year_Field() throws Throwable {
		WebElement exp_year = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(exp_year);
		s8.selectByIndex(7);
	}

	@When("^user Enter Cvvno In Cvvno Field$")
	public void user_Enter_Cvvno_In_Cvvno_Field() throws Throwable {
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("789");
	}

	@Then("^user Click Book Now Button And It Navigates To Booking Confiramtion page$")
	public void user_Click_Book_Now_Button_And_It_Navigates_To_Booking_Confiramtion_page() throws Throwable {
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
	}


	
	
	}






