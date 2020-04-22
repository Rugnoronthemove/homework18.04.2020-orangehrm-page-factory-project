package com.orangehrmlive.demo.opensource.testsuite;

import com.orangehrmlive.demo.opensource.pages.AccountPage;
import com.orangehrmlive.demo.opensource.pages.HomePage;
import com.orangehrmlive.demo.opensource.resources.testdata.TestData;
import com.orangehrmlive.demo.opensource.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase extends TestBase {

    HomePage homePage;
    AccountPage accountPage;

    @BeforeMethod(groups = {"Regression","Smoke","Sanity"})
    public void setUp() {
        homePage = new HomePage();
        accountPage = new AccountPage();

    }

    //TestCases
    @Test (groups = {"Regression","Smoke","Sanity"}, dataProvider = "LoginCredentials",dataProviderClass = TestData.class)
    public void verifyUserCanSuccessfullyLogin(String username, String password, String welcomeAdminText) {
        //send text to username field
        homePage.clickAndSendTextToUsernameField(username);
        //send text to password field
        homePage.clickAndSendTextToPasswordField(password);
        //click on login button
        homePage.clickOnLoginBtn();
        //verify text on AccountPage
        accountPage.verifyTextWelcomeAdmin(welcomeAdminText);
    }

    @Test(groups = {"Regression","Smoke"}, dataProvider = "LogoutTest", dataProviderClass = TestData.class)
    public void verifyUserCanSuccessfullyLogout(String username, String password,String welcomeAdminText, String loginPanelText) {
        //send text to username field
        homePage.clickAndSendTextToUsernameField(username);
        //send text to password field
        homePage.clickAndSendTextToPasswordField(password);
        //click on login button
        homePage.clickOnLoginBtn();
        //verify text on AccountPage
        accountPage.verifyTextWelcomeAdmin(welcomeAdminText);
        //click on welcome admin button
        accountPage.clickOnWelcomeAdmin();
        //click on logout link
        accountPage.clickOnLogoutLink();
        //verify text on HomePage
        homePage.verifyTextLoginPanelText(loginPanelText);
    }

}
