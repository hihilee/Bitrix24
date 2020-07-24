package com.crm24.step_definitions;

import com.crm24.pages.LoginPage;
import com.crm24.pages.StreamPage;
import com.crm24.utilities.ConfigurationReader;
import com.crm24.utilities.Driver;
import io.cucumber.core.options.CurlOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.safari.SafariTechPreviewDriverInfo;
import sun.awt.ConstrainableGraphics;
import sun.security.krb5.Config;

public class loginStepDefinitions {


    @Given("User is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @When("User have valid credentials")
    public void user_have_valid_credentials() throws Exception {
        LoginPage loginPage=new LoginPage();

        loginPage.userNameBox.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();
        Thread.sleep(2000);

    }

    @Then("User should see CRM24 logo.")
    public void user_should_see_crm24_logo() {
        StreamPage streamPage=new StreamPage();
        Assert.assertTrue(streamPage.logo.isDisplayed());

    }
}
