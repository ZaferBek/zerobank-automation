package com.zerobank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryPage extends BasePage{

    @FindBy(xpath="//a[text()='Savings']")
    public WebElement savingsLink;

    @FindBy(xpath = "//a[text()='Brokerage']")
    public WebElement brokerageLink;

    @FindBy(xpath = "//a[text()='Checking']")
    public WebElement checkingLink;

    @FindBy(xpath = "//a[text()='Credit Card']")
    public WebElement creditCardLink;

    @FindBy(xpath = "//a[text()='Loan']")
    public WebElement loanLink;

    @FindBy(xpath = "//a[text()='Account Activity']")
    public WebElement accountActivityTab;

    public String getPageSubTitle() {
        //any time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
        //BrowserUtils.waitForStaleElement(pageSubTitle)
        return pageSubTitle.getText();
    }
}
