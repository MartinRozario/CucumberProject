package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountElements {
    static WebDriver driver;

    public AccountElements(WebDriver driver){
        AccountElements.driver= driver;
    }
    By addAccountButton = By.xpath("//button[@ng-click=\"openAccount()\"]");
    By selectCustomerDropDown=By.xpath("//select[@name=\"userSelect\"]");
    By selectCustomerID=By.xpath("//option[text()=\"Martin Rozario\"]");
    By selectCurrencyDropdown=By.xpath("//select[@name=\"currency\"]");
    By selectCurrency=By.xpath("//option[@value=\"Dollar\"]");
    By clickSubmit=By.xpath("//button[@type=\"submit\"]");
    public void AAButton() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(addAccountButton).click();
}
    public void CustomerDropdown() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(selectCustomerDropDown).click();
    }
    public void CustID() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(selectCustomerID).click();
    }
    public void CurrencyDropdown() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(selectCurrencyDropdown).click();
    }
    public void Currency() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(selectCurrency).click();
    }
    public void Submit() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(clickSubmit).click();
    }
    public static void acceptAlertUsingJs() {
        driver.switchTo().alert().accept();
    }

}