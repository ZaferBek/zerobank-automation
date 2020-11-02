package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSummaryStepDefs {

    @When("the user is on Account Summary page")
    public void the_user_is_on_Account_Summary_page() {
        new AccountSummaryPage().accountSummaryTab.click();
        BrowserUtils.waitForPageToLoad(2);
    }

    @Then("page should have the title {string}")
    public void page_should_have_the_title(String pageTitle) {
        Assert.assertEquals(Driver.get().getTitle(),pageTitle);
    }

    @Then("Account Summary page should have the following account types")
    public void account_Summary_page_should_have_the_following_account_types(List<String> accountTypes) {
        List<String> actualOptions = BrowserUtils.getElementsText(new AccountSummaryPage().accountTypes);
        Assert.assertTrue(actualOptions.containsAll(accountTypes));
    }

    @Then("Credit Accounts table must have columns")
    public void credit_Accounts_table_must_have_columns(List<String> expectedColumns) {
        List<String> actualColumns = BrowserUtils.getElementsText(new AccountSummaryPage().creditAccountsColumns);
        Assert.assertTrue(actualColumns.containsAll(expectedColumns));
    }

}
