package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import stepDefinitions.Hooks;

public class DifferentTags {
    Actions actionProvider = new Actions(Hooks.driver);
    public WebElement select_cool() throws InterruptedException {
     By selectCool= By.cssSelector("a[href=\"/cool\"]");
     WebElement select_cool= Hooks.driver.findElement(selectCool);
     actionProvider.moveToElement(select_cool).click().build().perform();

     return select_cool;
    }
    public WebElement select_digital() {
        By selectDigital= By.cssSelector("a[href=\"/digital\"]");
        WebElement select_digital= Hooks.driver.findElement(selectDigital);
        actionProvider.moveToElement(select_digital).click().build().perform();

        return select_digital;
    }
    public WebElement select_game()  {
        By selectGame= By.cssSelector("a[href=\"/game\"]");
        WebElement select_game= Hooks.driver.findElement(selectGame);
        actionProvider.moveToElement(select_game).click().build().perform();

        return select_game;
    }

}
