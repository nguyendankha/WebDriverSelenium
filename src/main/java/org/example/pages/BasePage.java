package org.example.pages;

import org.example.config.ConfigurationManager;
import org.example.driver.DriverManager;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class BasePage {
    protected BasePage() {
        initElements(new AjaxElementLocatorFactory(DriverManager.getDriver(), ConfigurationManager.configuration().timeout()), this);
    }
}
