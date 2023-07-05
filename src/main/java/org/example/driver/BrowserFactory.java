package org.example.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.data.BrowserData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {
    public static WebDriver getBrowser(String browserName) {
        System.out.println("Browser name: " + browserName.toUpperCase());
        switch (browserName.toUpperCase()) {
            case "CHROME":
                System.out.println("switch case chrome");
                return createChromeDriver();
            case "FIREFOX":
                return createFirefoxDriver();
            default:
                throw new IllegalArgumentException("Invalid browser: " + browserName);
        }
    }

    private static WebDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(BrowserData.START_MAXIMIZED);
        chromeOptions.addArguments(BrowserData.DISABLE_INFO_BARS);
        chromeOptions.addArguments(BrowserData.DISABLE_NOTIFICATION);
        return new ChromeDriver();
    }

    private static WebDriver createFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments(BrowserData.START_MAXIMIZED);
        firefoxOptions.addArguments(BrowserData.DISABLE_INFO_BARS);
        firefoxOptions.addArguments(BrowserData.DISABLE_NOTIFICATION);
        return new FirefoxDriver(firefoxOptions);
    }

}
