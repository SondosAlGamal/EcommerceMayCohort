package stepDefinitions;

import Pages.DifferentCategories;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;

public class D06_differentCategoriesStepDef {
    DifferentCategories differentCategories =new DifferentCategories();
    @When("user select on Computers Categories")
    public void Computers_Categories() throws InterruptedException {
     differentCategories.computersCategories();
    }
    @And("user select on Electronics Categories")
    public void Electronics_Categories() throws InterruptedException {
    differentCategories.electronicsCategories();
    Thread.sleep(3000);
    }
    @And("hover to Cell phones subcategory")
    public void Cell_Phones()
    {
     differentCategories.cell_Phones();
    }
    @Then("Cell phones appears successfully")
    public void cell_phones_appears_successfully()
    {
        int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
        System.out.println(count);
        Assert.assertTrue(count>0);
        ArrayList<String> products = null;
        products = new ArrayList<String>();
        for (int x = 0 ; x < count ; x++ ){
            System.out.println(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());
            products.add(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());

        }
        System.out.println(products);


        //Hooks.driver.findElement(By.cssSelector("img=[alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]"));
    }
}
