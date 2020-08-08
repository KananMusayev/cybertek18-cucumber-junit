package com.cybertek.step_definitions;

import com.cybertek.pages.WikiHomePage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiStepDefinitions {
    WikiHomePage wikiHomePage=new WikiHomePage();

    @Given("User is on the Wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }


    @When("User searches {string} in the wiki search page")
    public void user_searches_in_the_wikisearch_page(String string) {
        wikiHomePage.searchBox.sendKeys(string);
        wikiHomePage.searchButton.click();
    }

    @When("User searches {string} in the Wiki search page")
    public void user_searches_in_the_wiki_search_page(String string) {
            wikiHomePage.searchBox.sendKeys(string);
            wikiHomePage.searchButton.click();
    }
    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String string) {

        String expectedTitle=string+" - Wikipedia";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }


    @Then("User should see {string}  in the main header")
    public void userShouldSeeInTheMainHeader(String expectedHeader) {
        String actualheadertext=wikiHomePage.Mainheaderaftersearch.getText();
        Assert.assertEquals(actualheadertext,expectedHeader);
    }

    @Then("User should see {string} in the image header")
    public void userShouldSeeInTheImageHeader(String expectedHeader) {
        String actuaimagelHeader=wikiHomePage.Imageheaderaftersearch.getText();
        Assert.assertEquals(expectedHeader,actuaimagelHeader);
    }
}
