Feature: Search and place the order for products

@Test1
Scenario Outline: Search the experience for product search in homepage and offeres page
Given The user is on "https://rahulshettyacademy.com/seleniumPractise/#/" Green Kart landing page
When user searched with shortname "<Name>" and extracted the actual name of product 
Then The user searched with same short name in offers page to check if "<Name>" exists

Examples:
|Name|
|Tom|
|St|

@makemytrip1
Scenario: Guest login to make my trip website
Given The user is on "https://www.makemytrip.com/" website
When The user clicks on country dropdown and select the country as India
And The User click on hindi checkbox and appply button
Then the whole page appears in hindi language

@makemytrip2
Scenario: The user was able to update profile in makemytrip website
Given The user is on "https://www.makemytrip.com/" website1
When The user clicks on login or create accountand enter mobile number and enter mobile number










