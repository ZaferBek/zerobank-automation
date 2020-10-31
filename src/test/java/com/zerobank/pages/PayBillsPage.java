package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage{

    @FindBy(xpath = "//a[text()='Pay Saved Payee']")
    public WebElement paySavedPayeeTab;

    @FindBy(xpath = "//a[text()='Add New Payee']")
    public WebElement addNewPayeeTab;

    @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
    public WebElement purchaseForeignCurrencyTab;

    @FindBy(xpath = "//input[@id='np_new_payee_name']")
    public WebElement payeeNameInput;

    @FindBy(xpath = "//textarea['np_new_payee_address']")
    public WebElement payeeAddressInput;

    @FindBy(xpath = "//input[@id='np_new_payee_account']")
    public WebElement payeeAccountInput;

    @FindBy(xpath = "//input[@id='np_new_payee_details']")
    public WebElement payeeDetailsInput;

    @FindBy(xpath = "//input[@id='add_new_payee']")
    public WebElement addButton;

    @FindBy(xpath = "//div[@id='alert_content']")
    public WebElement alertContent;
}
