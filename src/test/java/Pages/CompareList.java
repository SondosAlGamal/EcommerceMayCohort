package Pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class CompareList {
    public WebElement Apple_MacBook() {
        By MacBook = By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]");
        WebElement Apple_MacBook = Hooks.driver.findElement(MacBook);
        return Apple_MacBook;
    }
    public WebElement Add_To_compare_List_1() {
        By compare_1 = By.cssSelector("div div[class=\"compare-products\"]");
        WebElement Add_To_compare_List_1 = Hooks.driver.findElement(compare_1);
        return Add_To_compare_List_1;
    }
    public WebElement Laptop_Samsung() {
        By Samsung = By.cssSelector("a[href=\"/samsung-series-9-np900x4c-premium-ultrabook\"]");
        WebElement Laptop_Samsung = Hooks.driver.findElement(Samsung);
        return Laptop_Samsung;
    }
    public WebElement Add_To_compare_List_2() {
        By compare_2 = By.cssSelector("div div[class=\"compare-products\"]");
        WebElement Add_To_compare_List_2 = Hooks.driver.findElement(compare_2);
        return Add_To_compare_List_2;
    }

}
