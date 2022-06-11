package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import stepDefinitions.Hooks;

public class FilterWithColor {
    Actions actionProvider = new Actions(Hooks.driver);

    public WebElement Apparel_subcategory() {
        By ApparelCategory = By.cssSelector("a[href=\"/apparel\"]");
        WebElement Apparel_subcategory = Hooks.driver.findElement(ApparelCategory);
        actionProvider.moveToElement(Apparel_subcategory).build().perform();
        return Apparel_subcategory;
    }
    public WebElement shoesCategory() {
        By ShoesCategory = By.cssSelector("a[href=\"/shoes\"]");
        WebElement shoesCategory = Hooks.driver.findElement(ShoesCategory);
        actionProvider.moveToElement(shoesCategory).build().perform();
        return shoesCategory;

    }
    public WebElement Filter_Color()
    {
     By filtercolor=By.id("attribute-option-15");
     WebElement Filter_Color=Hooks.driver.findElement(filtercolor);
     return Filter_Color;

    }
}
