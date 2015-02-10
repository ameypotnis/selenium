package com.mycompany.app;

/**
 * Created by amey on 09/02/15.
 */

import com.codeborne.selenide.Selenide;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = "day2/src/test/resources/com/mycompany/app/google.feature"
)
public class GoogleTest {
    @BeforeClass
    public static void beforeClass() {
        System.setProperty("selenide.baseUrl", "http://www.google.com");
        System.setProperty("browser", "chrome");
        System.setProperty("webdriver.chrome.driver", "day2/src/test/resources/chromedriver");
    }
    @AfterClass
    public static void afterClass() {
        Selenide.close();
    }
}