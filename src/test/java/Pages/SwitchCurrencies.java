package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.Hooks;

public class SwitchCurrencies {

    public WebElement Euro_Currency() throws InterruptedException {
        By Euro1= By.id("customerCurrency");
        WebElement Euro_Currency= Hooks.driver.findElement(Euro1);
        Select selectObject2 = new Select(Euro_Currency);
        selectObject2.selectByVisibleText("Euro");
        Thread.sleep(3000);
        return Euro_Currency;

    }
    public WebElement US_Dollar() throws InterruptedException {
        By USDollar= By.id("customerCurrency");
        WebElement US_Dollar= Hooks.driver.findElement( USDollar);
        Select selectObject1 = new Select(US_Dollar);
        selectObject1.selectByVisibleText("US Dollar");
        Thread.sleep(3000);
        return US_Dollar;
    }

}
