#Author: Abir Ibrahim

Feature: xiaomi homepage

  Scenario: homepage menus verification
    Given user is on homepage
    When user moushover on menu "Smart Home"
    And user click on submenu "TV & Media"
    Then user is directed to submenu page "TV & Media"

  