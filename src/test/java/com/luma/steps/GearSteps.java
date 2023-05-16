package com.luma.steps;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.OverNightDuffle;
import com.luma.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearSteps {
    @When("^I mouse hover on Gear MenU$")
    public void iMouseHoverOnGearMenU() {
        new HomePage().mouseHoverOnGearMenu();
    }

    @And("^I click on Bags$")
    public void iClickOnBags() {
        new HomePage().clickOnBags();
    }

    @And("^I click on Product Name Overnight duffle$")
    public void iClickOnProductNameOvernightDuffle() {
        new GearPage().clickOnProductGear();
    }

    @And("^message verify the text \"([^\"]*)\"$")
    public void messageVerifyTheText(String expectedMessage) {
       Assert.assertEquals(new OverNightDuffle().getOverNightDuffelText(),expectedMessage);
    }

    @And("^I update the QTY \"([^\"]*)\"$")
    public void iUpdateTheQTY(String newQty)  {
        new OverNightDuffle().changeQuantityTo3(newQty);
    }

    @And("^I click on ADD to Cart Button$")
    public void iClickOnADDToCartButton() {
        new OverNightDuffle().clickOnAddToCart();
    }

    @And("^verify the text \"([^\"]*)\"$")
    public void verifyTheText(String expectedMessage)  {
        Assert.assertEquals(new OverNightDuffle().getAddToCartText(),expectedMessage);
    }

    @And("^I click on Shopping Cart link$")
    public void iClickOnShoppingCartLink() {
        new OverNightDuffle().clickOnShoppingCart();
    }

    @And("^I verify text \"([^\"]*)\"$")
    public void iVerifyText(String expected)  {
        Assert.assertEquals(new ShoppingCartPage().getOverNightDuffeleText(),expected);
    }

    @And("^I verify the quantity \"([^\"]*)\"$")
    public void iVerifyTheQuantity(String updateQty)  {
        Assert.assertEquals(new ShoppingCartPage().getQty(),updateQty);
    }

    @And("^I verify the product Price \"([^\"]*)\"$")
    public void iVerifyTheProductPrice(String expectedprice)  {
        Assert.assertEquals(new ShoppingCartPage().getUpdatedProductPrice(),expectedprice);

    }
    @And("^I update the quantity \"([^\"]*)\"$")
    public void iUpdateTheQuantity(String expectedqty)  {
        new ShoppingCartPage().changeQtyOfOverNightDuffle(expectedqty);
    }

    @And("^I click on update shopping cart button$")
    public void iClickOnUpdateShoppingCartButton() {
        new ShoppingCartPage().clickOnUpdateShoppingCart();
    }

    @Then("^I should be able to add product on cart successfully$")
    public void iShouldBeAbleToAddProductOnCartSuccessfully() {
    }


    @And("^I  product price \"([^\"]*)\"$")
    public void iProductPrice(String latest){
        Assert.assertEquals(new ShoppingCartPage().getProductPrice(),latest);
    }
}
