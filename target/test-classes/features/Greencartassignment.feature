Feature: Search and adding functionality in greencart shopping mart

@Ashvik
Scenario Outline: Search and add the products  order for products and proceed to checkout

Given The user is on "https://rahulshettyacademy.com/seleniumPractise/#/" Green Kart landing page1
When user searched with shortname "<Name>" and extracted the actual name of product1
And The  user adds the products in the shopping cart and  click on  proceed to checkout button                                                                                                            
Then the user checks the items in checkout page and verify whether apply promo button and place order button is enabled
Then the user enters the country and click on agree to conditions and click on proceed 
And your order has been placed message have come and redirected to home page

Examples:
|Name|
|Tom|
|Beet|
