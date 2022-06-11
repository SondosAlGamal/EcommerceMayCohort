package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import stepDefinitions.Hooks;

public class DifferentCategories {
    Actions actionProvider = new Actions(Hooks.driver);
    public WebElement computersCategories() throws InterruptedException {
     By ComputersCategoriesEle= By.cssSelector("a[href=\"/computers\"]");
     WebElement computersCategories= Hooks.driver.findElement(ComputersCategoriesEle);
     actionProvider.moveToElement(computersCategories).click().build().perform();
        Thread.sleep(1000);
     return computersCategories;
    }
    public WebElement electronicsCategories() throws InterruptedException {
     By ElectronicsCategoriesEle=By.cssSelector("a[href=\"/electronics\"]");
     WebElement electronicsCategories= Hooks.driver.findElement(ElectronicsCategoriesEle);
     actionProvider.moveToElement(electronicsCategories).build().perform();
     Thread.sleep(3000);
     return electronicsCategories;
    }
    public WebElement cell_Phones()
    {
     By cellPhonesEle=By.cssSelector("a[href=\"/cell-phones\"]");
     WebElement cell_Phones=Hooks.driver.findElement(cellPhonesEle) ;
     actionProvider.moveToElement(cell_Phones).click().build().perform();
     return cell_Phones;
    }

}
