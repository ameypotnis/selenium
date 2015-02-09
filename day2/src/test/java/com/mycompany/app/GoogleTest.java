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
        System.setProperty("browser", "phantomjs");
        System.setProperty("phantomjs.binary.path", "day2/src/test/resources/phantomjs");
    }
    @AfterClass
    public static void afterClass() {
        Selenide.close();
    }
}