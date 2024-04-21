#Author: Ibrahim Abir
Feature: Maison connecté

  Scenario: sorting products
    Given user is on products page
    When user sorts product by popularity
    And click on product "Xiaomi Hair Clipper"
    Then user is directed to product page "Xiaomi Hair Clipper"
