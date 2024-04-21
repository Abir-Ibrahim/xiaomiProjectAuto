#Author: Ibrahim Abir
Feature: add to cart a product
  
  
  Scenario: add to card verification
  Given user is on product page 
  When user add the product to cart 
  And click on shopping cart 
  Then user is directed to the cart page that contains the product selected "Mi Temperature and Humidity Monitor Pro"
  