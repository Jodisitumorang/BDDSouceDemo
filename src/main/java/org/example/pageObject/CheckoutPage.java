package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public static WebDriver webDriver;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement cartButton;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
    private WebElement removeSauceLabs;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement CheckoutButton;
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement Firstname;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement Lastname;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement Zipcode;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;
    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement summaryTotal;
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement checkoutComplete;


    public void clickCartButton(){
        cartButton.click();
    }
    public void clickRemoveButton(){
        removeSauceLabs.click();
    }
    public void clickCheckoutButton(){
        CheckoutButton.click();
    }
    public boolean verifyCheckoutStepOne(){
        boolean a = Firstname.isDisplayed();
        boolean b = Lastname.isDisplayed();
        boolean c = Zipcode.isDisplayed();
        return a && b && c;
    }
    public void inputData(String firtsname, String lastname, String zipcode){
        Firstname.sendKeys(firtsname);
        Lastname.sendKeys(lastname);
        Zipcode.sendKeys(zipcode);
    }
    public void clickContinueButton(){
        continueButton.click();
    }
    public boolean verifysummaryTotal(){
        return summaryTotal.isDisplayed();
    }
    public void clickFinishButton(){
        finishButton.click();
    }
    public boolean verifycheckoutComplete(){
        return checkoutComplete.isDisplayed();
    }


}
