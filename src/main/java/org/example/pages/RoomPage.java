package org.example.pages;

import io.qameta.allure.Step;
import org.example.driver.DriverManager;
import org.example.pages.common.NavigationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoomPage extends NavigationPage {

    @Step
    public void selectRoomType(String room) {
        DriverManager.getDriver().findElement(By.xpath("//h6[text()='" + room + "']")).click();
    }
}
