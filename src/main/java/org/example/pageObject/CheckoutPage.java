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
    private WebElement checkoutButton;
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement zipCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement checkoutOverview;
    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement summaryTotal;

    //div[@class='summary_info_label summary_total_label']
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement checkoutComplete;



////    1.sendKeys = input data
//    2.click   = tombol
//    3.isDisplays = memastikan tampilan

    public void clickCartButton(){
        cartButton.click();
    }
    public void clickRemoveButton(){
        removeSauceLabs.click();
    }
    public void clickCheckoutButton(){
        checkoutButton.click();
    }
    public boolean verifyCheckoutStepOne(){
        boolean a = firstName.isDisplayed();
        boolean b = lastName.isDisplayed();
        boolean c = zipCode.isDisplayed();
        return a && b && c;
    }
    public void inputData(String inputFirstName, String inputLastName, String inputZipCode){
        firstName.sendKeys(inputFirstName);
        lastName.sendKeys(inputLastName);
        zipCode.sendKeys(inputZipCode);
    }
    public void clickContinueButton(){
        continueButton.click();
    }
    public boolean verifyCheckoutOverview(){
        return checkoutOverview.isDisplayed();
    }
    public String verifySummaryTotal(){
        return summaryTotal.getText();
    }

    public void clickFinishButton(){
        finishButton.click();
    }
    public boolean verifyCheckoutComplete(){
        return checkoutComplete.isDisplayed();
    }


}
