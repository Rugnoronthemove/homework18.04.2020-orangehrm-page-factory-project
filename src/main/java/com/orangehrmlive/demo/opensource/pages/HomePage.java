package com.orangehrmlive.demo.opensource.pages;

import com.orangehrmlive.demo.opensource.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(css = "input#txtUsername")
    WebElement _usernameField;

    @FindBy(css = "input#txtPassword")
    WebElement _passwordField;

    @FindBy(css = "input.button")
    WebElement _loginBtn;

    @FindBy(css = "div#logInPanelHeading")
    WebElement _loginPanelText;

    public void clickAndSendTextToUsernameField(String userName) {
        Reporter.log(" Enter email:"+userName+" into the field " +_usernameField.toString()+"<br>");
        sendTextToElement(_usernameField,userName);
        log.info(" Enter email:"+userName+" into the field " +_usernameField.toString());
    }

    public void clickAndSendTextToPasswordField(String passwd) {
        Reporter.log(" Enter password:"+passwd+" into the field "+_passwordField.toString()+"<br>");
        sendTextToElement(_passwordField,passwd);
        log.info(" Enter password:"+passwd+" into the field "+_passwordField.toString());
    }

    public void clickOnLoginBtn() {
        Reporter.log(" Click on login button "+_loginBtn.toString()+"<br>");
        clickOnElement(_loginBtn);
        log.info(" Click on login button "+_loginBtn.toString());
    }

    public void verifyTextLoginPanelText(String logPanelText) {
        Reporter.log(" Verify text: "+logPanelText+" is displayed " +_loginPanelText.toString()+"<br>");
        verifyTextAssertMethod(_loginPanelText,logPanelText);
        log.info(" Verify text: "+logPanelText+" is displayed " +_loginPanelText.toString());
    }

}
