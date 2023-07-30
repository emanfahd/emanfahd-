package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_login;
import org.openqa.selenium.By;

public class T01_loginFeature {
    P01_login loginPage= new P01_login();

    @When("i enter valid {string}") //@test
     public void iEnterValidUsername(String username) {
      loginPage.username().sendKeys(username);
     }

    @And("i enter valid {string}")  //@test
    public void iEnterValidPassword(String password) {
     loginPage.password().sendKeys(password);
    }

    @Then("i click on login button") //action expected
    public void iClickOnLoginButton() {
     loginPage.loginButton().click();
 }

    @And("i enter invalid {string}")
    public void iEnterInvalidPassword(String password) {
        loginPage.password().sendKeys(password);
    }
}
