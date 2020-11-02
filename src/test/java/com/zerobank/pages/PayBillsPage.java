package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(xpath = "//select[@id='pc_currency']")
    public WebElement currencyDropdown;

    @FindBy(xpath = "//select[@id='pc_currency']/option")
    public List<WebElement> currencyOptions;

    @FindBy(xpath = "//input[@id='pc_amount']")
    public WebElement amountInput;

    @FindBy(xpath = "//label[@class='radio inline']")
    public List<WebElement> selectCurrencyRadioButton;

    @FindBy (xpath = "//input[@id='pc_calculate_costs']")
    public WebElement calculateCostsButton;
}
