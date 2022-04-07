package com.swag.core.base;

import com.codeborne.selenide.Selenide;
import com.swag.core.allure.AllureLogger;
import com.swag.core.config.SelenideConfig;
import com.swag.core.utils.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class BaseTest extends AllureLogger {

    @BeforeMethod(alwaysRun = true, description = "Opening web browser...")
    public void setUp() {
        logInfo("Creating web driver configuration...");
        SelenideConfig.createBrowserConfig(System.getProperty("selenide.browser", "chrome"));
        logInfo("Open browser...");
        logInfo("Navigating to base url - " + Constants.URL);
        Selenide.open(Constants.URL);
        }


    @AfterMethod(alwaysRun = true, description = "Closing web browser...")
    public void tearDown() {
        Selenide.closeWebDriver();
        logInfo("Web driver closed!");
    }
}
