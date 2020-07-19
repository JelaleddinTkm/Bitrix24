package com.BriteERP.pages;

import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

    public Login_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (name = "USER_LOGIN")
    public WebElement userName;

    @FindBy (name = "USER_PASSWORD")
    public WebElement password;

    @FindBy (className = "login-btn")
    public WebElement  loginButton;


    public void login(){
        Driver.getDriver().get("https://login2.nextbasecrm.com/");

        userName.sendKeys(ConfigurationReader.getProperties("username_hr"));
        password.sendKeys(ConfigurationReader.getProperties("password"));

        loginButton.click();
    }

}
