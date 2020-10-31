package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement accountDropdown;

    @FindBy (xpath = "//a[text()='Find Transactions']")
    public WebElement findTransactions;

    @FindBy(xpath = "//a[text()='Show Transactions']")
    public WebElement showTransactions;

    @FindBy(xpath = "//*[@id='aa_description']")
    public WebElement description;

    @FindBy(xpath = "//input[@id='aa_fromDate']")
    public WebElement fromDate;

    @FindBy(xpath = "//input[@id='aa_toDate']")
    public WebElement toDate;

    @FindBy(xpath = "//input[@id='aa_fromAmount']")
    public WebElement fromAmount;

    @FindBy (xpath = "//input[@id='aa_toAmount']")
    public WebElement toAmount;

    @FindBy (xpath = "//select[@id='aa_type']")
    public WebElement typeDropdown;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement findButton;

    @FindBy (xpath = "//div[@id='filtered_transactions_for_account']//../td[1]")
    public List<WebElement> transactionDates;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//../td[2]")
    public List<WebElement> transactionDescriptions;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//../td[3]")
    public List<WebElement> deposit;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//../td[4]")
    public List<WebElement> withdrawal;

}

