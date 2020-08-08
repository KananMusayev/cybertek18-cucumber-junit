Feature: Search
  Agile Story: As a user i should be able search when i am on Google search page

  Background: User should be on google search page
    Given User is on the google search page

  Scenario: Google default title verification
    Then User should see title is Google

  Scenario: Google title verification after search
    When User searches apple
    Then user should see apple in the title

        #OPTION+ENTER helps to generate step definitions

  Scenario: Google title verification after search
    When User searches "broccoli"
    Then user should see "broccoli" in the title

  @wip #work in progress
  Scenario: Google-About - link page title verification
    Then User should see About link
    And User clicks to About link
    Then User should see title  Google - About Google, Our Culture & Company News



  @googleTable
  Scenario: Google search page footer links verification
    Then User should see six links in the footer
      | Advertising      |
      | Business         |
      | How Search Works |
      | Privacy          |
      | Terms            |
      | Settings         |