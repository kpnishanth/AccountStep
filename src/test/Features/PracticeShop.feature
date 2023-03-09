Feature: Practice Automation Site Functionality
  @Shop,@ALL
  Scenario:Shop Field Functionality
    Given user opens the browser and navigate to "https://www.google.com"
    Then user enters "practice automation testing"
    Then user user clicks on google search button
    Then user clicks on "Automation Practice Site"
    Then user clicks on shop
    Then user gets ad
    Then user closes the ad
    Then user reach the shop page
    Then user clicks on mastering java script item
    Then user clicks on "Add To Basket" for the item
    Then user clicks on cart
    Then user reach the cart page and scroll down
    Then user clicks on proceed to checkout button
    Then user enters billing details field
    Then user scroll the page
    And user place the order
    Then user closes the browser







