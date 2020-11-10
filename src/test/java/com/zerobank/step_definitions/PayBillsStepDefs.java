package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
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

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PayBillsStepDefs {

    @Given("the user navigates to Pay Bills module")
    public void the_user_navigates_to_Pay_Bills_module() {
        new AccountSummaryPage().payBillsModule.click();
        BrowserUtils.waitForPageToLoad(1);
    }

    @Given("the user selects Add New Payee tab")
    public void the_user_selects_Add_New_Payee_tab() {
        new PayBillsPage().addNewPayeeTab.click();
        BrowserUtils.waitForPageToLoad(1);
    }

    @Given("the user creates new payee using following information")
    public void the_user_creates_new_payee_using_following_information(Map<String,String> information) {
        PayBillsPage payBillsPage = new PayBillsPage();
        payBillsPage.payeeNameInput.sendKeys(information.get("Payee Name"));
        payBillsPage.payeeAddressInput.sendKeys(information.get("Payee Address"));
        payBillsPage.payeeAccountInput.sendKeys(information.get("Account"));
        payBillsPage.payeeDetailsInput.sendKeys(information.get("Payee details"));
        payBillsPage.addButton.click();
        BrowserUtils.waitForPageToLoad(1);
    }

    @Then("message {string} should be displayed")
    public void message_should_be_displayed(String message) {
        String actual = new PayBillsPage().alertContent.getText();
        String expected = "The new payee The Law Offices of Hyde, Price&Scharks was successfully created.";
        Assert.assertEquals(actual, expected);
    }

    @When("user completes a successful Pay operation")
    public void user_completes_a_successful_Pay_operation() {
        PayBillsPage payBillsPage = new PayBillsPage();
        Random random = new Random();

        List<WebElement> payeeOptions = payBillsPage.payeeOptions;
        int list = random.nextInt(payeeOptions.size());
        payeeOptions.get(list).click();

        List<WebElement> accountOptions = payBillsPage.accountOptions;
        int accList = random.nextInt(accountOptions.size());
        accountOptions.get(accList).click();

        int amount = random.nextInt(10000);
        payBillsPage.sp_amountInput.sendKeys(""+amount);

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        payBillsPage.dateInput.sendKeys(dateFormat.format(date));

        payBillsPage.descriptionInput.sendKeys("Payment");
        payBillsPage.payButton.click();

        BrowserUtils.waitForPageToLoad(1);
    }

    @Then("{string} should be displayed")
    public void should_be_displayed(String string) {
        PayBillsPage payBillsPage = new PayBillsPage();
        Assert.assertTrue(payBillsPage.successMessage.isDisplayed());
        Assert.assertEquals(payBillsPage.successMessage.getText(), string);
    }

    @When("the user tries to make a payment without entering the amount")
    public void the_user_tries_to_make_a_payment_without_entering_the_amount() {
        PayBillsPage payBillsPage = new PayBillsPage();
        Random random = new Random();

        List<WebElement> payeeOptions = payBillsPage.payeeOptions;
        int list = random.nextInt(payeeOptions.size());
        payeeOptions.get(list).click();

        List<WebElement> accountOptions = payBillsPage.accountOptions;
        int accList = random.nextInt(accountOptions.size());
        accountOptions.get(accList).click();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        payBillsPage.dateInput.sendKeys(dateFormat.format(date));

        payBillsPage.descriptionInput.sendKeys("Payment");
        payBillsPage.payButton.click();

        BrowserUtils.waitFor(1);
    }

    @Then("{string} popup message should be displayed")
    public void popup_message_should_be_displayed(String string) {
        //Alert alert = Driver.get().switchTo().alert();
        //Assert.assertEquals(alert.getText(), string);
        //alert.dismiss();
    }

    @When("the user tries to make a payment without entering the date")
    public void the_user_tries_to_make_a_payment_without_entering_the_date() {
        PayBillsPage payBillsPage = new PayBillsPage();
        Random random = new Random();

        List<WebElement> payeeOptions = payBillsPage.payeeOptions;
        int list = random.nextInt(payeeOptions.size());
        payeeOptions.get(list).click();

        List<WebElement> accountOptions = payBillsPage.accountOptions;
        int accList = random.nextInt(accountOptions.size());
        accountOptions.get(accList).click();

        int amount = random.nextInt(10000);
        payBillsPage.sp_amountInput.sendKeys(""+amount);

        payBillsPage.descriptionInput.sendKeys("Payment");
        payBillsPage.payButton.click();

        BrowserUtils.waitForPageToLoad(1);
    }


}
