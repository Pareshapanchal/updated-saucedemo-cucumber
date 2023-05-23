package com.saucedemo.www.steps;

import com.saucedemo.www.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {

        Assert.assertEquals(new LoginPage().getActualLogoText(),"Swag Labs","Logo is not displayed");
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username) {
        new LoginPage().enterUserName(username);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfuly$")
    public void iShouldLoginSuccessfuly() {
        Assert.assertEquals(new LoginPage().getActualProductlogo(),"Products","'Products' title not displayed");
        Assert.assertEquals(new LoginPage().getNumberOfProductsDisplayed(),6,"Products not displayed");
    }

    @Then("^I should see errorMessage$")
    public void iShouldSeeErrorMessage() {
        String expectedErrorMessage ="Epic sadface: Username and password do not match any user in this service";
        boolean message = new LoginPage().getActualErrorMessage().contains(expectedErrorMessage.trim());
        System.out.println(message);
        System.out.println(new LoginPage().getActualErrorMessage());
        Assert.assertTrue(message);
    }

}
