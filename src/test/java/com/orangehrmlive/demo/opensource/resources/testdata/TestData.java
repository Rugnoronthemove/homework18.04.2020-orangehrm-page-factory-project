package com.orangehrmlive.demo.opensource.resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "LoginCredentials")
    public Object[][] getDataLogin() {
        return new Object[][]{
                {"Admin","admin123","Welcome Admin"}
        };
    }

    @DataProvider(name = "LogoutTest")
    public Object[][] getDataLogout() {
        return new Object[][] {
                {"Admin","admin123","Welcome Admin","LOGIN Panel"}
        };
    }

}
