package com.cybertek.step_definitions;

import com.cybertek.pages.EtsyHomePage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDefinitions {

//Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone


    EtsyHomePage etsyHomePage=new EtsyHomePage();


    @Then("User should see title is as expected")
    public void user_should_see_title_is_as_expected() {

        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Given("User is on the Etsy home page")
    public void userIsOnTheEtsyHomePage() {
        Driver.getDriver().get("https://www.etsy.com");

    }

    @When("User searches {string} in the searchbox")
    public void userSearchesInTheSearchbox(String enteredvalue) {
        etsyHomePage.searchbox.sendKeys(enteredvalue);
    }

    @And("User clicks the search button")
    public void userClicksTheSearchButton() {
        etsyHomePage.searchbutton.click();
    }

    @Then("User should sees {string} in the title")
    public void userShouldSeesInTheTitle(String enteredvalue) {
        String expectedTitle="Wooden spoon | Etsy";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }
}
