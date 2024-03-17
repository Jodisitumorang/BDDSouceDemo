package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.CheckoutPage;
import org.example.pageObject.InventoryPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps {
    private final WebDriver driver = Hooks.driver;
    InventoryPage inventoryPage = new InventoryPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @Then("User click button shopping cart badge")
    public void UserclickCartButton(){
        checkoutPage.clickCartButton();
    }

    @And("User remove Sauce Labs Bike Light from shopping cart")
    public void userRemoveFromShoppingCart() {
        checkoutPage.clickRemoveButton();
    }

    @And("User click Checkout button")
    public void userClickCheckoutButton() {
        checkoutPage.clickCheckoutButton();
    }

    @Then("User redirected to Checkout Step One Page")
    public void userRedirectedToCheckoutStepOnePage() {
        Assert.assertTrue(checkoutPage.verifyCheckoutStepOne());
    }

    @And("User input {string} as FirstName {string} as LastName {string} as ZipCode")
    public void userInputAsFirstNameAsLastNameAsZipCode(String firstname, String lastname, String zipcode) {
        checkoutPage.inputData(firstname, lastname, zipcode);
    }

    @And("User click conttinue button")
    public void userClickConttinueButton() {
        checkoutPage.clickContinueButton();
    }

    @Then("User redirected to Checkout Step Two Page")
    public void userRedirectedToCheckoutStepTwoPage() {
        Assert.assertTrue(checkoutPage.verifysummaryTotal());
    }


    @And("User click button Finish")
    public void userClickButtonFinish() {
        checkoutPage.clickFinishButton();
    }

    @Then("User redirected to checkout complete page")
    public void userRedirectedToCheckoutCompletePage() {
        Assert.assertTrue(checkoutPage.verifycheckoutComplete());

    }


}
