package org.example.report;

import com.github.automatedowl.tools.AllureEnvironmentWriter;
import com.google.common.collect.ImmutableMap;
import io.qameta.allure.Attachment;
import org.example.driver.DriverManager;
import org.openqa.selenium.TakesScreenshot;

import java.util.HashMap;
import java.util.Map;

import static org.example.config.ConfigurationManager.configuration;
import static org.openqa.selenium.OutputType.BYTES;

public class AllureManager {
    private AllureManager() {
    }

//    public static void setAllureEnvironmentInformation() {
//        HashMap<String, String> basicInfo = new HashMap<>(Map.of(
//                "Test URL", configuration().baseUrl(),
//                "Global timeout", String.valueOf(configuration().timeout()),
//                "Local browser", configuration().browser()
//        ));
//        AllureEnvironmentWriter.allureEnvironmentWriter(ImmutableMap.copyOf(basicInfo));
//    }

    @Attachment(value = "Failed test screenshot", type = "image/png")
    public static byte[] takeScreenshotToAttachOnAllureReport() {
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(BYTES);
    }

    @Attachment(value = "Browser information", type = "text/plain")
    public static String addBrowserInformationOnAllureReport() {
        return DriverManager.getDriverInfo();
    }
}
