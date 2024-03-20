@Login-Checkout
  Feature: Login-Checkout
    As a user i want checkout one item product

  Scenario: Login, Adding 2 item to cart, Remove 1 item from to cart and then finish the checkout process
    Given User open the web sauce demo
    When User input "standard_user" as userName and "secret_sauce" as password and click login
    Then User already on dashboard page
    When User sort product by "Price (low to high)"
    And User add to click add to cart item "Sauce Labs Onesie"
    And User add to click add to cart item "Sauce Labs Bike Light"
    And User click button shopping cart badge
    And User remove Sauce Labs Bike Light from shopping cart
    And User click Checkout button
    Then User redirected to Checkout Step One Page
    When User input "Jodi" as FirstName "Ganteng" as LastName "170845" as ZipCode
    And User click continue button
    Then User redirected to Checkout Overview Step Two Page
    And User can see Summary Total
    When User click button Finish
    Then User redirected to checkout complete page

#    1.sendKeys input
#    2.click button
#    3.isDisplay memastikan tampilan
















