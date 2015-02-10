package com.mycompany.app;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by amey on 09/02/15.
 */

public final class GooglePage {
    private GooglePage() {}
    public static void open(String page) {
        Selenide.open(page);
    }

    public static void enterSearchStringAndPressEnter(String q) {
        $(By.name("q")).setValue(q).pressEnter();
    }

    public static ElementsCollection verifyResults() {
        return $$("#ires li.g");
    }
}
