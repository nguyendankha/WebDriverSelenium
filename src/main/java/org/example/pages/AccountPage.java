package org.example.pages;

import io.qameta.allure.Step;
import org.example.pages.common.NavigationPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountPage extends NavigationPage {
    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(name = "country")
    private WebElement country;

    @FindBy(name = "budget")
    private WebElement budget;

    @FindBy(css = ".check")
    private WebElement newsletter;

    @Step
    public void fillEmail(String email) {
        this.email.sendKeys(email);
    }

    @Step
    public void fillPassword(String password) {
        this.password.sendKeys(password);
    }

    @Step
    public void selectCountry(String country) {
        new Select(this.country).selectByVisibleText(country);
    }

    @Step
    public void selectBudget(String value) {
        new Select(budget).selectByVisibleText(value);
    }

    @Step
    public void clickNewsletter() {
        newsletter.click();
    }
}
