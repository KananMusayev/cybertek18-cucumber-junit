  Feature: Etsy title verification
    Agile story: User should be able to enter search terms and see relevant results
    in the page and in the title

    Background: User is on the etsy home page
      Given User is on the Etsy home page

    Scenario: Title verification
      Then User should see title is as expected
      #expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

    @etsyWip
    Scenario: Title verification without paramaterization
      When User searches "Wooden Spoon" in the searchbox
      And User clicks the search button
      Then User should sees "Wooden Spoon" in the title

