package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CheckoutPage;
import org.example.pageObject.InventoryPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {
    private final WebDriver driver = Hooks.driver;
    InventoryPage inventoryPage = new InventoryPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @And("User click button shopping cart badge")
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

    @When("User input {string} as FirstName {string} as LastName {string} as ZipCode")
    public void userInputAsFirstNameAsLastNameAsZipCode(String firstName, String lastName, String zipCode) {
        checkoutPage.inputData(firstName, lastName, zipCode);
    }
    @And("User click continue button")
    public void userClickContinueButton() {
        checkoutPage.clickContinueButton();
    }

    @Then("User redirected to Checkout Overview Step Two Page")
    public void userRedirectedToCheckoutStepTwoPage() {
        Assert.assertTrue(checkoutPage.verifyCheckoutOverview());

    }

    @And("User can see Summary Total")
    public void userCanSeeSummaryTotal() {
            String expected = "Total: $8.63";
            String actual = checkoutPage.verifySummaryTotal();
        Assert.assertEquals(expected, actual);
    }
    @When("User click button Finish")
    public void userClickButtonFinish() {
        checkoutPage.clickFinishButton();
    }
    @Then("User redirected to checkout complete page")
    public void userRedirectedToCheckoutCompletePage() {
        Assert.assertTrue(checkoutPage.verifyCheckoutComplete());

    }

}


