@loginWithBackground
Feature: Login Feature
  CBT-25:
  As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.
  #this is how u comment in future file

  #BEFORE ANNOTATION
  Background: Backstory is that user is on the login page
    Given User is on the login page

  Scenario: Librarian login scenario
    When User logs in as a librarian
    Then User should see dashboard
   #AFTER ANNOTATION RUNS HERE

  Scenario: Student login scenario
    When User logs in as a student
    Then User should see dashboard
   #AFTER ANNOTATION RUNS HERE


  @db
  Scenario: Admin login scenario
    When User logs in as admin
    Then User should see dashboard

  #AFTER ANNOTATION RUNS HERE
