Feature: Test google page

  Scenario: should give 10 results for a given search
    Given I open "http://www.google.com" site
    When I enter "Selenide" in the search box and press enter
    Then I should see "10" results
