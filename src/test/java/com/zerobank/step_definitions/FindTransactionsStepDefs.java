package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class FindTransactionsStepDefs {

    @Given("the user clicks on Account Activity tab")
    public void the_user_clicks_on_Account_Activity_tab() {
       new AccountSummaryPage().accountActivityTab.click();
    }

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() throws InterruptedException {
        new AccountActivityPage().findTransactions.click();
        BrowserUtils.waitFor(1);
    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String fromdate, String todate) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        accountActivityPage.fromDate.clear();
        accountActivityPage.toDate.clear();
        accountActivityPage.fromDate.sendKeys(fromdate);
        accountActivityPage.toDate.sendKeys(todate);
    }

    @When("clicks search")
    public void clicks_search() {
        new AccountActivityPage().findButton.click();
        BrowserUtils.waitFor(1);
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String fromdate, String todate) throws ParseException {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        Date fromDate = new SimpleDateFormat("yyyy-MM-dd").parse(fromdate);
        Date toDate = new SimpleDateFormat("yyyy-MM-dd").parse(todate);

        List<WebElement> tarnsDates = accountActivityPage.transactionDates;
        for (WebElement date: tarnsDates) {
            Date tableDate = new SimpleDateFormat("yyyy-MM-dd").parse(date.getText());
            Assert.assertTrue(tableDate.equals(fromDate)|| tableDate.equals(toDate)||(tableDate.after(fromDate)&&tableDate.before(toDate)));
        }
    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() throws ParseException {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        List<WebElement> transDates = accountActivityPage.transactionDates;
        for (int i = 0; i < transDates.size()-1; i++) {
            Date recentDate = new SimpleDateFormat("yyyy-MM-dd").parse(transDates.get(i).getText());
            Date previousDate = new SimpleDateFormat("yyyy-MM-dd").parse(transDates.get(i+1).getText());
            Assert.assertTrue(recentDate.after(previousDate));
        }
    }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String date) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        List<WebElement> transDates = accountActivityPage.transactionDates;
        for (WebElement transDate: transDates) {
            Assert.assertNotEquals(transDate.getText(), date);
        }
    }

    @When("the user enters description {string}")
    public void the_user_enters_description(String transactionType) {
        new AccountActivityPage().description.clear();
        new AccountActivityPage().description.sendKeys(transactionType);
    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String transactionType) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        List<WebElement> descriptions = accountActivityPage.transactionDescriptions;
        for (WebElement description: descriptions) {
        Assert.assertTrue(description.getText().contains(transactionType));
        }
    }

    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String str) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        List<WebElement> transDescriptions = accountActivityPage.transactionDescriptions;
        for (WebElement transaction: transDescriptions) {
            Assert.assertFalse(transaction.getText().contains(str));
        }
    }

    @Then("results table should show at least one result under Deposit")
    public void results_table_should_show_at_least_one_result_under_Deposit() {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        List<WebElement> deposits = accountActivityPage.deposit;
        boolean displayed = false;
        for (WebElement deposit: deposits) {
           if(deposit.isDisplayed()){
               displayed=true;
           }
        }
        Assert.assertTrue(true);
    }

    @Then("results table should show at least one result under Withdrawal")
    public void results_table_should_show_at_least_one_result_under_Withdrawal() {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        List<WebElement> withdrawals = accountActivityPage.withdrawal;
        boolean displayed = false;
        for (WebElement withdrawal: withdrawals) {
            if(withdrawal.isDisplayed()){
                displayed=true;
            }
        }
        Assert.assertTrue(true);
    }

    @When("user selects type {string}")
    public void user_selects_type(String str) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        Select type = new Select(accountActivityPage.typeDropdown);
        type.selectByVisibleText(str);
        accountActivityPage.findButton.click();
        BrowserUtils.waitFor(1);
    }

    @Then("results table should show no result under Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal() {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        List<WebElement> withdrawals = accountActivityPage.withdrawal;
        for (WebElement withdrawal: withdrawals) {
            Assert.assertTrue(withdrawal.getText().isEmpty());
        }
    }

    @Then("results table should show no result under Deposit")
    public void results_table_should_show_no_result_under_Deposit() {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        List<WebElement> deposits = accountActivityPage.deposit;
        for (WebElement deposit: deposits) {
            Assert.assertTrue(deposit.getText().isEmpty());
        }
    }


}
