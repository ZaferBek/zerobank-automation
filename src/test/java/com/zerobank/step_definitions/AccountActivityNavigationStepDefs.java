package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigationStepDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        LoginPage loginPage = new LoginPage();
        loginPage.signinButton.click();
        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
        BrowserUtils.waitFor(1);
    }

    @When("the user clicks on Savings link on the Account Summary page")
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
    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
        new AccountSummaryPage().brokerageLink.click();
    }

    @Then("Account dropdown should have Brokerage selected")
    public void account_dropdown_should_have_Brokerage_selected() {
        Select accountDropdown = new Select(new AccountActivityPage().accountDropdown);
        String selected = accountDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals("Brokerage", selected);
    }

    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
        new AccountSummaryPage().checkingLink.click();
    }

    @Then("Account dropdown should have Checking selected")
    public void account_dropdown_should_have_Checking_selected() {
        Select accountDropdown = new Select(new AccountActivityPage().accountDropdown);
        String selected = accountDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals("Checking", selected);
    }

    @When("the user clicks on Credit Card link on the Account Summary page")
    public void the_user_clicks_on_Credit_Card_link_on_the_Account_Summary_page() {
        new AccountSummaryPage().creditCardLink.click();
    }

    @Then("Account dropdown should have Credit Card selected")
    public void account_dropdown_should_have_Credit_Card_selected() {
        Select accountDropdown = new Select(new AccountActivityPage().accountDropdown);
        String selected = accountDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals("Credit Card", selected);
    }
    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        new AccountSummaryPage().loanLink.click();
    }

    @Then("Account dropdown should have Loan selected")
    public void account_dropdown_should_have_Loan_selected() {
        Select accountDropdown = new Select(new AccountActivityPage().accountDropdown);
        String selected = accountDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals("Loan", selected);
    }


}
