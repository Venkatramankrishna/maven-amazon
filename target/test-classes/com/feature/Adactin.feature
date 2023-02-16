Feature: Checking the hotel booking functionality of an Adactin application
Scenario: Login functionality
Given user Must Launch The Url
When user Enter The Username In The Username Field
And user Enter The Password In The Password Field
Then user Click The Login Button And It Navigates To Search Hotel Pages


Scenario: Search functionality
When user Select The Location From Location Field
And user Select The Hotel From Hotel Field
And user Select The Room Type From Room Type Field
And user Select The Number of Rooms From Number of Rooms Field
And user Select CheckIn Date  From CheckIn Date Field
And user Select CheckOut Date  From CheckOut Date Field
And user Select Number Of Adult From Number Of Adult Field
And user Select Number Of Children From Number Of Children Field
Then user Click The Search Button And It Navigates To The Select Hotel Page


Scenario: Select functionality
When user Click The Check Box In Check Box Field
Then user Click The Continue Button And It Navigates To The Book Hotel Page


Scenario: Book hotel functionality
When user Enter First Name In First Name Field
And user Enter Last Name In Last Name Field
And user Enter Billing Address In Billing Address Field
And user Enter CCNumber In CCNumber Field
And user Select CCType From CCType Field
And user Select Expiry Date From Date Field
And user Select Expiry Year From Year Field
And user Enter Cvvno In Cvvno Field
Then user Click Book Now Button And It Navigates To Booking Confiramtion page