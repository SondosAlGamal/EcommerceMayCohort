package Pages;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class Search {
    public WebElement search_Field() {
        By searchFieldEle = By.id("small-searchterms");
        WebElement search_Field = Hooks.driver.findElement(searchFieldEle);
        return search_Field;
    }

    public WebElement search_btn()
    {
     By searchBtn= By.cssSelector("button[class=\"button-1 search-box-button\"]");
     WebElement search_btn=Hooks.driver.findElement(searchBtn);
     return search_btn;
    }
}

