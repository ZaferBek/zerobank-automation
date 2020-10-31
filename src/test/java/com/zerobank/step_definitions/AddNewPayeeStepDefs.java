package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class AddNewPayeeStepDefs {

    @Given("the user navigates to Pay Bills module")
    public void the_user_navigates_to_Pay_Bills_module() {
        new AccountSummaryPage().payBillsModule.click();
        BrowserUtils.waitFor(1);
    }

    @Given("the user selects Add New Payee tab")
    public void the_user_selects_Add_New_Payee_tab() {
        new PayBillsPage().addNewPayeeTab.click();
        BrowserUtils.waitFor(1);
    }

    @Given("the user creates new payee using following information")
    public void the_user_creates_new_payee_using_following_information(Map<String,String> information) {
        PayBillsPage payBillsPage = new PayBillsPage();
        payBillsPage.payeeNameInput.sendKeys(information.get("Payee Name"));
        payBillsPage.payeeAddressInput.sendKeys(information.get("Payee Address"));
        payBillsPage.payeeAccountInput.sendKeys(information.get("Account"));
        payBillsPage.payeeDetailsInput.sendKeys(information.get("Payee details"));
        payBillsPage.addButton.click();
        BrowserUtils.waitFor(1);
    }

    @Then("message {string} should be displayed")
    public void message_should_be_displayed(String message) {
        String actual = new PayBillsPage().alertContent.getText();
        String expected = "The new payee The Law Offices of Hyde, Price&Scharks was successfully created.";
        Assert.assertEquals(actual, expected);
    }


}
