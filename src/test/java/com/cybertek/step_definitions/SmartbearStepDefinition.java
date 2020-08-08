package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBearLoginPage;
import com.cybertek.pages.SmartbearOrdersPage;
import com.cybertek.pages.SmartbearafterLoginPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SmartbearStepDefinition {

SmartBearLoginPage loginPage=new SmartBearLoginPage();
SmartbearOrdersPage ordersPagepage=new SmartbearOrdersPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @When("user logs in as a tester")
    public void user_logs_in_as_a_tester() {
        loginPage.usernameBox.sendKeys("Tester");
        loginPage.passwordBox.sendKeys("test");
        loginPage.loginButton.click();
    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        String expectedtitle="Web Orders";
        String actualtitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedtitle,actualtitle);
    }

    @Given("User should click on the Order button")
    public void userShouldClickOnTheOrderButton() {
        SmartbearafterLoginPage loginPage=new SmartbearafterLoginPage();
        loginPage.OrderLink.click();
    }

    @Then("User should see the order form")
    public void userShouldSeeTheOrderForm() {
        Assert.assertTrue(ordersPagepage.OrderHeader.isDisplayed()); }

    @Then("user should fill the order form")
    public void userShouldFillTheOrderForm() {

        Select select=new Select(ordersPagepage.DropdownMenu);
        select.selectByVisibleText("FamilyAlbum");

        ordersPagepage.Quantitybox.clear();
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        ordersPagepage.Quantitybox.sendKeys("4");
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        ordersPagepage.Customernamebox.sendKeys("John Wick");
        ordersPagepage.streetBox.sendKeys("Kinzie Ave");
        ordersPagepage.citybox.sendKeys("Chicago");
        ordersPagepage.statebox.sendKeys("IL");
        ordersPagepage.zipcodebox.sendKeys("60056");
        ordersPagepage.VisaradioButton.click();
        ordersPagepage.cardNumberBox.sendKeys("1111222233334444");
        ordersPagepage.expirationdatebox.sendKeys("12/22");


    }
}
