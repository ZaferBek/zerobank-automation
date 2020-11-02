package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @And("the user press on signin button")
    public void the_user_press_on_signin_button() {
        new LoginPage().signinButton.click();
        //Driver.get().findElement(By.id("signin_button")).click();
    }

    @When("the user enter valid credentials")
    public void the_user_enter_valid_credentials() {
        new LoginPage().login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
    }

    @Then("Account Summary page should be displayed")
    public void account_Summary_page_should_be_displayed() {
        Assert.assertTrue(Driver.get().getTitle().contains("Zero - Account Summary"));
    }

    @When("the user enter wrong username")
    public void the_user_enter_wrong_username() {
        LoginPage loginPage = new LoginPage();
        String randomUsername = RandomStringUtils.randomAlphanumeric(8);
        loginPage.userLogin.sendKeys(randomUsername);
        loginPage.userPassword.sendKeys(ConfigurationReader.get("password"));
        Assert.assertNotEquals(randomUsername, ConfigurationReader.get("username"));
        loginPage.signIn.click();
    }

    @When("the user enter wrong password")
    public void the_user_enter_wrong_password() {
        LoginPage loginPage = new LoginPage();
        String randomPassword = RandomStringUtils.randomAlphanumeric(8);
        loginPage.userLogin.sendKeys(ConfigurationReader.get("username"));
        loginPage.userPassword.sendKeys(randomPassword);
        Assert.assertNotEquals(randomPassword, ConfigurationReader.get("password"));
        loginPage.signIn.click();
    }

    @Then("error message {string} is displayed")
    public void error_message_is_displayed(String loginError) {
        WebElement alertMessage = Driver.get().findElement(By.xpath("//div[@class='alert alert-error']"));
        Assert.assertTrue(alertMessage.isDisplayed());
    }
    @When("the user enter blank username")
    public void the_user_enter_blank_username() {
        new LoginPage().login(" ", ConfigurationReader.get("password"));
    }

    @When("the user enter blank password")
    public void the_user_enter_blank_password() {
        new LoginPage().login(ConfigurationReader.get("username"), " ");
    }


}
