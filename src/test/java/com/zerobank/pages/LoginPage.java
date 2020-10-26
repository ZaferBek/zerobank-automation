package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement userLogin;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement userPassword;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement signIn;


    public void login(String userNameStr, String passwordStr) {
        userLogin.sendKeys(userNameStr);
        userPassword.sendKeys(passwordStr);
        signIn.click();
    }

}
