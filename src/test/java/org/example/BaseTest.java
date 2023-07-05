package org.example;

import org.example.driver.BrowserFactory;
import org.example.driver.DriverManager;
import org.example.report.AllureManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static org.example.config.ConfigurationManager.configuration;

@Listeners({TestListener.class})
public class BaseTest {
    @BeforeSuite
    public void beforeSuite() {
        AllureManager.setAllureEnvironmentInformation();
    }

    @BeforeMethod(alwaysRun = true)
    @Parameters("browser")
    public void preCondition(String browser) {
        WebDriver driver = BrowserFactory.getBrowser(browser);
        DriverManager.setDriver(driver);
        DriverManager.getDriver().get(configuration().baseUrl());
    }

    @AfterMethod(alwaysRun = true)
    public void postCondition() {
        DriverManager.quit();
    }
}
