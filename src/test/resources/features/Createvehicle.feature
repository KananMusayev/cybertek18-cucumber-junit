@vehicle
Feature: Create vehicle
  As a user , i want to be able to create vehicles

  Scenario: Create a vehicle
    Given user is on the landing page
    When User logs in with "storemanager85" and "UserUser123" credentials
    Then user navigates to "Fleet" and "Vehicles"
    And user clicks on create car button
    Then User enters vehicle information:
      | Licence Plate | Driver | Location       | Model Year |
      | test plates   | SDET   | Washington D.C | 2020       |