Feature: to test login functionality

  Scenario: Check loginis successful with valid credentials
    Given User is on login page
    When user enters usernsame and password
    And clicks on login button
    Then user is navigated to the home page

 