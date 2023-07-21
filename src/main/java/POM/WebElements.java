package POM;
//import com.sun.xml.internal.ws.resources.UtilMessages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebElements {
    static WebDriver driver;
    public WebElements(WebDriver driver){
        WebElements.driver = driver;
        WebElements.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    By bankManagerLoginButton = By.xpath("//button[@ng-click=\"manager()\"]");
    By addCustomerTab = By.xpath("//button[@ng-class=\"btnClass1\"]");
    By firstName = By.xpath("//input[@ng-model=\"fName\"]");
    By lastName = By.xpath("//input[@ng-model=\"lName\"]");
    By postCode = By.xpath("//input[@ng-model=\"postCd\"]");
    By addCustomerButton = By.xpath("//button[@class=\"btn btn-default\"]");
    public void LoginButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(bankManagerLoginButton).click();
    }
    public void addCustomerTab() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(addCustomerTab).click();
        Thread.sleep(2000);
    }

    public void CustInfo(String First,String Last, String Post) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(firstName).sendKeys(First);
        driver.findElement(lastName).sendKeys(Last);
        driver.findElement(postCode).sendKeys(Post);
    }
    public void addCustomerButton() throws InterruptedException{

        Thread.sleep(2000);
        driver.findElement(addCustomerButton).click();
        Thread.sleep(2000);
    }
    public static void acceptAlertUsingJs(WebDriver args) throws InterruptedException {
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }

}