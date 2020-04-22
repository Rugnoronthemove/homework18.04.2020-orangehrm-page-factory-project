package com.orangehrmlive.demo.opensource.pages;

import com.orangehrmlive.demo.opensource.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @FindBy(css = "a.panelTrigger")
    WebElement _welcomeAdmin;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement _logoutLink;


    public void verifyTextWelcomeAdmin(String welText) {
        Reporter.log(" Verify text: "+welText+" is displayed " +_welcomeAdmin.toString()+"<br>");
        verifyTextAssertMethod(_welcomeAdmin,welText);
        log.info(" Verify text: "+welText+" is displayed " +_welcomeAdmin.toString());
    }

    public void clickOnWelcomeAdmin() {
        Reporter.log(" Click on welcome admin button " +_welcomeAdmin.toString()+"<br>");
        clickOnElement(_welcomeAdmin);
        log.info(" Click on welcome admin button " +_welcomeAdmin.toString());
    }

    public void clickOnLogoutLink() {
        Reporter.log(" Click on logout link "+_logoutLink.toString()+"<br>");
        clickOnElement(_logoutLink);
        log.info(" Click on logout link "+_logoutLink.toString());
    }

}
