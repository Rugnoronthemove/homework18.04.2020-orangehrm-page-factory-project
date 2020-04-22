package com.orangehrmlive.demo.opensource.testbase;

import com.orangehrmlive.demo.opensource.basepage.BasePage;
import com.orangehrmlive.demo.opensource.browserselector.BrowserSelector;
import com.orangehrmlive.demo.opensource.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String browser = loadProperty.getProperty("browser");
    String baseUrl = loadProperty.getProperty("baseUrl");

    @BeforeMethod(groups = {"Regression", "Smoke", "Sanity"})
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterMethod(groups = {"Regression", "Smoke", "Sanity"})
    public void closeBrowser() {
        driver.quit();
    }

}
