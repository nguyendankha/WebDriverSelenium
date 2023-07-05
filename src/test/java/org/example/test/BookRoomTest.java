package org.example.test;

import org.example.BaseTest;
import org.example.model.Booking;
import org.example.model.RoomType;
import org.example.pages.AccountPage;
import org.example.pages.BasePage;
import org.example.pages.RoomPage;
import org.testng.annotations.Test;

public class BookRoomTest extends BaseTest {
    @Test(description = "Book a room test")
    public void bookARoomTest() {
        RoomType roomType = new RoomType();
        Booking bookingInformation = new Booking("abc@a.com", "Belgium", "123456", "500", false, roomType, "abc");
        AccountPage accountPage = new AccountPage();
        accountPage.fillEmail("abc@a.com");
        accountPage.fillPassword("123456");
        accountPage.selectCountry("Belgium");
        accountPage.selectBudget("500");
        accountPage.clickNewsletter();
        accountPage.next();

        RoomPage roomPage = new RoomPage();
        roomPage.selectRoomType(roomType.getValue());
        roomPage.next();

    }

}
