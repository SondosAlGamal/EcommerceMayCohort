package stepDefinitions;

import Pages.Search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class D04_searchStepDef {
    Search search=new Search();
    @When("user click on search field and write product name")
    public void selection ()
    {
        search.search_Field().click();
        search.search_Field().sendKeys("shirt");

    }

    @And("click on search button")
    public void search_button() throws InterruptedException {
     search.search_btn().click();
     Thread.sleep(3000);
    }

    @Then("user`s product will found")
    public void product1_found() {
        int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
        System.out.println(count);
        Assert.assertTrue(count>0);
        ArrayList <String>products = null;
        products = new ArrayList<String>();
        for (int x = 0 ; x < count ; x++ ){
            System.out.println(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());
            products.add(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());

        }
        System.out.println(products);


    }
    }



