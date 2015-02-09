package com.mycompany.app;

import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @org.junit.Test
    public void testApp() {
        open("http://www.google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();
        $$("#ires li.g").shouldHave(size(10));
    }
}
