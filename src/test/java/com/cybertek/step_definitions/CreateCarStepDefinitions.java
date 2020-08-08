package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;

import java.util.List;
import java.util.Map;

public class CreateCarStepDefinitions {

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("djnslf");

    }

    @When("User logs in with {string} and {string} credentials")
    public void user_logs_in_with_and_credentials(String string, String string2) {
        System.out.println("djnslf");

    }
    @Then("user navigates to {string} and {string}")
    public void user_navigates_to_and(String string, String string2) {
        System.out.println("djnslf");

    }
    @Then("user clicks on create car button")
    public void user_clicks_on_create_car_button() {
        System.out.println("djnslf");
    }
    @Then("User enters vehicle information:")
    public void user_enters_vehicle_information(List<Map<String ,String >> dataTable) {
        System.out.println("sjfnsjlf");
    }


}
