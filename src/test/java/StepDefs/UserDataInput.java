package StepDefs;

import Core.Helper;
import POM.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static POM.WebElements.acceptAlertUsingJs;


public class UserDataInput {
    static WebDriver driver;
    WebElements web;
        @Given("User goto XYZ Bank Home page page")
        public void loginPage(){
            Helper hp = new Helper();
            driver = hp.chromeLaunch();
        }

        @When("User click on the Bank Manager Login")
        public void userClickOnTheBankManagerLogin() throws InterruptedException {
            web = new WebElements(driver);
            web.LoginButton();

        }

         @And("User click Add Customer button")
        public void userClickAddCustomerButton() throws InterruptedException {
        web.addCustomerTab();

    }

        @And("User input {string} and {string} and {string}")
        public void userInputFirstNameAndLastNameAndPostCode(String First, String Last, String Post) throws InterruptedException{
            web=new WebElements(driver);
            web.CustInfo(First, Last, Post);
    }

        @And("User click on the Add Customer button")
        public void userClickOnTheAddCustomerButton() throws InterruptedException {
            web.addCustomerButton();
    }

        @Then("User click on on notification")
        public void userClickOnOnNotification() throws InterruptedException{
            acceptAlertUsingJs(driver);
    }
}

