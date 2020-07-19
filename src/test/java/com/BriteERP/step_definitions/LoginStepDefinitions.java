package com.BriteERP.step_definitions;

import com.BriteERP.pages.Login_Page;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    Login_Page login_page = new Login_Page();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("bitRix_url"));
    }




    @When("User logs in with credentials")
    public void user_logs_in_with_credentials() {
        login_page.login();
    }
    @Then("User should see the dashboard")
    public void user_should_see_the_dashboard() {

        String expectedTitle = "Portal";
        String actualTitle = Driver.getDriver().getTitle();


        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

}
