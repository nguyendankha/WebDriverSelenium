package org.example.driver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverManager {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // getter & setter

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver.set(driver);
    }

    public static void quit() {
        DriverManager.driver.get().quit();
        driver.remove();
    }

    public static String getDriverInfo() {
        Capabilities capabilities = ((RemoteWebDriver) DriverManager.getDriver()).getCapabilities();
        String browserName = capabilities.getBrowserName();
        String browserVersion = capabilities.getBrowserVersion();
        String browserPlatform = capabilities.getPlatformName().toString();

        return String.format("Driver Info: \n Browser Name: %s \n Browser Version: %s \n Browser Platform: %s", browserName, browserVersion, browserPlatform);
    }
}
