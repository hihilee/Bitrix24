package com.crm24.pages;

import com.sun.tracing.dtrace.FunctionName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath="//input[@id='USER_REMEMBER']")
    public WebElement rememberCheckbox;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPassword;

}
