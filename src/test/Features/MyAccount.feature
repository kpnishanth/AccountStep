  Feature:My Account Functionality
    @Login,@ALL
    Scenario: Register and Login Account with Valid Credentials
      Given user open the browser and navigate to "https//:www.google.com"
      Then user enter "practice automation testing"
      And user clicks on google search button
      Then user clicks "Automation Practice Site"
      Then user clicks on my account
      Then user gets ad window
      Then user closes the ad window
      Then user enters register account page with valid credentials
      And user clicks on register
      Then user enters login field with valid credentials
      And clicks on login button
      Then user clicks on sign out
      Then user closes the browser window

