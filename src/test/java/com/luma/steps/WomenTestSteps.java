package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.Woman_Jackets_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WomenTestSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I mouse hover on Women menu$")
    public void iMouseHoverOnWomenMenu() {
        new HomePage().mouseHoverOnWomenMenu();
    }

    @And("^I mouse hover on Tops$")
    public void iMouseHoverOnTops() {
        new HomePage().mouseHoverOnTops();
    }

    @And("^I click on Jackets$")
    public void iClickOnJackets() {
        new HomePage().clickOnJackets();
    }

    @And("^I select sort By filter \"([^\"]*)\"$")
    public void iSelectSortByFilter(String filterName) {
        new Woman_Jackets_Page().selectProductNameFilter(filterName);
    }

    @Then("^Products names displayed in Alphabetical Order$")
    public void productsNamesDisplayedInAlphabeticalOrder() {
        new Woman_Jackets_Page().verifyProductDisplayedInAlphabaticalOrder();
    }

    @Then("^Products price displayed in Low to High order$")
    public void productsPriceDisplayedInLowToHighOrder() {
        new Woman_Jackets_Page().verifyProductDisplayedPriceFromLowToHigh();
    }

}
