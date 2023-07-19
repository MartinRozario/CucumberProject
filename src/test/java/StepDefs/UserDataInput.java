package StepDefs;

import Core.Helper;
import POM.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

import static POM.WebElements.*;

public class UserDataInput {
    WebDriver driver;
    WebElements web;
        @Given("User goto XYZ Bank Home page page")
    public void loginPage() {
            ChromeOptions options = new ChromeOptions(); //
            Map<String, Object> prefs = new HashMap<>();
            Map<java.lang.String, Map<java.lang.String, Integer>> profile = new HashMap<>();
            Map<String, Integer> contentSettings;
            contentSettings = new HashMap<>();
            contentSettings.put("notifications", 2);
            contentSettings.put("geolocation", 2);
            profile.put("managed_default_content_settings", contentSettings);
            prefs.put("profile", profile);
            options.setExperimentalOption("prefs", prefs);
            options.addArguments("--remote-allow-origins=*");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);

            driver.get("https://globalsqa.com/angularJs-protractor/BankingProject/#/login");
            driver.manage().window().maximize();
        }

    @When("User click on the Bank Manager Login")
    public void userClickOnTheBankManagerLogin() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@ng-click=\"manager()\"]")).click();
            Thread.sleep(2000);

    }

    @And("User click Add Customer button")
    public void userClickAddCustomerButton() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@ng-click=\"addCust()\"]")).click();;
        Thread.sleep(2000);
    }

    @And("User input {string} and {string} and {string}")
    public void userInputFirstNameAndLastNameAndPostCode(String First, String Last, String Post) throws InterruptedException{
            web=new WebElements(driver);
            web.CustInfo(First, Last, Post);
    }

    @And("User click on the Add Customer button")
    public void userClickOnTheAddCustomerButton() throws InterruptedException {
            Thread.sleep(2000);
            web.addCustomerButton();
    }

    @Then("User click on on notification")
    public void userClickOnOnNotification() throws InterruptedException{
            Thread.sleep(2000);
            acceptAlertUsingJs(driver);
    }
}

