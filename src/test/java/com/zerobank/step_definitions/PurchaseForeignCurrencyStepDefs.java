package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class PurchaseForeignCurrencyStepDefs {

    @Given("the user accesses the Purchase Foreign Currency cash tab")
    public void the_user_accesses_the_Purchase_Foreign_Currency_cash_tab() {
        new PayBillsPage().purchaseForeignCurrencyTab.click();
        BrowserUtils.waitFor(1);
    }

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> currencies) {
        PayBillsPage payBillsPage = new PayBillsPage();
        List<String> currencyOptions = BrowserUtils.getElementsText(payBillsPage.currencyOptions);
        Assert.assertTrue(currencyOptions.containsAll(currencies));
    }
    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {
        PayBillsPage payBillsPage = new PayBillsPage();
        payBillsPage.amountInput.sendKeys("200");
        payBillsPage.selectCurrencyRadioButton.indexOf(2);
        payBillsPage.calculateCostsButton.click();
        BrowserUtils.waitFor(1);
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
        Alert alert = Driver.get().switchTo().alert();
        String expectedMessage = "Please, ensure that you have filled all the required fields with valid values.";
        String actualMessage = alert.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
        alert.accept();
    }

    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {
        PayBillsPage payBillsPage = new PayBillsPage();
        Select currency = new Select(payBillsPage.currencyDropdown);
        currency.selectByVisibleText("Canada (dollar)");
        payBillsPage.selectCurrencyRadioButton.indexOf(2);
        payBillsPage.calculateCostsButton.click();
        BrowserUtils.waitFor(1);
    }

}
