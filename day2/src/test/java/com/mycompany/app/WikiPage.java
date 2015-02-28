package com.mycompany.app;

import org.junit.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

/**
 * Created by rahulphaltankar on 28/02/15.
 */
public class WikiPage {

    public static void shouldVerifyTitle(String title) {
        Assert.assertEquals(title, title());
    }
}
