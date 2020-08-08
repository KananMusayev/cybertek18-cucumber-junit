package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class GoogleStepDefinitions {

    GoogleSearchPage searchPage=new GoogleSearchPage();

    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }


    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        String actualtitle=Driver.getDriver().getTitle();
        String expectedTitle="Google";
        Assert.assertEquals(actualtitle,expectedTitle);
    }


    @When("User searches apple")
    public void userSearchesApple() {

        //sending value into search box using page object model
        searchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }



    @When("User searches {string}")
    public void userSearches(String searchvalue) {

        searchPage.searchBox.sendKeys(searchvalue + Keys.ENTER);

    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String searchvalue) {

        String actualtitle=Driver.getDriver().getTitle();
        String expectedTitle=searchvalue+" - Google Search" ;
        Assert.assertEquals(actualtitle,expectedTitle);
    }

    @Then("user should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {

    }

    @Then("User should see About link")
    public void userShouldSeeAboutLink() {
        Assert.assertTrue(searchPage.aboutLink.isDisplayed());
    }

    @And("User clicks to About link")
    public void userClicksToAboutLink() {
        searchPage.aboutLink.click();
    }

    @Then("User should see title  Google - About Google, Our Culture & Company News")
    public void userShouldSeeTitleGoogleAboutGoogleOurCultureCompanyNews() {
        String expectedTitle="Google - About Google, Our Culture & Company News";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("User should see six links in the footer")
    public void user_should_see_six_links_in_the_footer(List<String> linkStrings) {

        int expectedSize = linkStrings.size();
        int actualSize = searchPage.footerLinks.size();

        System.out.println("linkStrings = " + linkStrings);

        Assert.assertEquals(actualSize, expectedSize);
    }
}
