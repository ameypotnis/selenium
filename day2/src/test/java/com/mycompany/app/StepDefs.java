package com.mycompany.app;

import com.codeborne.selenide.ElementsCollection;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.CollectionCondition.size;

public class StepDefs {

    @Given("^I open \"([^\"]*)\" site$")
    public void I_open_site(String site) throws Throwable {
        GooglePage.open(site);
    }

    @When("^I enter \"([^\"]*)\" in the search box and press enter$")
    public void I_enter_in_the_search_box_and_press_enter(String q) throws Throwable {
        GooglePage.enterSearchStringAndPressEnter(q);
    }

    @Then("^I should see \"([^\"]*)\" results$")
    public void I_should_see_results(String count) throws Throwable {
        ElementsCollection elements = GooglePage.verifyResults();
        elements.shouldHave(size(Integer.parseInt(count)));
    }

    @Then("^I should land on \"([^\"]*)\" site$")
    public void I_should_land_on_site(String title) throws Throwable {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
        WikiPage.shouldVerifyTitle(title);
    }
}