package com.mycompany.app;

import org.junit.Before;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Before
    public void setUp() {
        System.setProperty("selenide.baseUrl", "http://www.google.com");
       // System.setProperty("browser", "chrome");
        //System.setProperty("webdriver.chrome.driver", "day2/src/test/resources/chromedriver");
       System.setProperty("browser", "phantomjs");
        System.setProperty("phantomjs.binary.path", "day2/src/test/resources/phantomjs");
    }

    @org.junit.Test
    public void testApp() {
        open("http://www.google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();
        $$("#ires li.g").shouldHave(size(10));
    }
}


