package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class ShoppingCart {
    public WebElement Flower_girl_bracelet()
    {
        By flowerBracelet= By.xpath("//a[@href=\"/flower-girl-bracelet\"]");
        WebElement Flower_girl_bracelet= Hooks.driver.findElement(flowerBracelet);
        return Flower_girl_bracelet;
    }
    public WebElement add_to_card1()
    {
     By addToCard1=By.id("add-to-cart-button-41");
     WebElement add_to_card1=Hooks.driver.findElement(addToCard1);
     return add_to_card1;
    }

    public WebElement Vintage_Style_Engagement_Ring()
    {
        By engagementRing=By.xpath("//a[@href=\"/vintage-style-engagement-ring\"]");
        WebElement Vintage_Style_Engagement_Ring=Hooks.driver.findElement(engagementRing);
        return Vintage_Style_Engagement_Ring;
    }
    public WebElement add_to_card2()
    {
     By addToCard2=By.id("add-to-cart-button-42");
     WebElement add_to_card2=Hooks.driver.findElement(addToCard2);
     return add_to_card2;
    }

}
