package org.example.pages.common;

import io.qameta.allure.Step;
import org.example.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationPage extends BasePage {
    @FindBy(name = "next")
    private WebElement next;

    @FindBy(name = "previous")
    private WebElement previous;

    @FindBy(name = "finish")
    private WebElement finish;

    @Step
    public void next() {
        next.click();
    }

    @Step
    public void previous() {
        previous.click();
    }

    @Step
    public void finish() {
        finish.click();
    }
}
