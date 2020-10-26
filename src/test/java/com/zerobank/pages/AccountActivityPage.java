package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement accountDropdown;
}

