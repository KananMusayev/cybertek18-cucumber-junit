Feature: Search
  Agile Story: As a user i should be able search when i am on Google search page

  @scenariooutline
  Scenario Outline: Google title verification after search
    Given User is on the google search page
    When User searches "<search value>"
    Then user should see "<expected title>" in the title

    Examples: Search values i want to search in Google
      | search value | expected title |
      | apple        | apple          |
      | kiwi         | kiwi           |
      | orange       | orange         |
