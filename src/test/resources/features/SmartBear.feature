@smartbearlogin
Feature: Order process

  Scenario: User login scenario
    Given user is on the login page
    When user logs in as a tester
    Then user should see dashboard


    Scenario: User should fill the form
      Given User should click on the Order button
      Then User should see the order form
      Then user should fill the order form
