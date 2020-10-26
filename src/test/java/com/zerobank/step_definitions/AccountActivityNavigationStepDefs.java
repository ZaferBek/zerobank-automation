package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigationStepDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        LoginPage loginPage = new LoginPage();
        loginPage.signinButton.click();
        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
    }

    @When("the user clicks on Savings link on the	Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        new AccountSummaryPage().savingsLink.click();
    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        Assert.assertTrue(Driver.get().getTitle().contains("Account Activity"));
    }

    @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        Select accountDropdown = new Select(accountActivityPage.accountDropdown);
        String selected = accountDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals("Savings", selected);

    }


}
