package stepDefinitions;

import Pages.DifferentTags;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;

public class D08_differentTagsStepDef {
    DifferentTags diffTags= new DifferentTags();

    @Given("user navigate to computer category page")
    public void user_navigates()
    {
     Hooks.driver.navigate().to("https://demo.nopcommerce.com/computers");
    }
    @And("user select cool from popular tags")
    public void select_cool() throws InterruptedException {
       diffTags.select_cool();
    }
    @Then("cool products appear successfully")
    public void cool_products_appear_successfully() throws InterruptedException {
        int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
        System.out.println(count);
        Assert.assertTrue(count > 0);
        ArrayList<String> products = null;
        products = new ArrayList<String>();
        for (int x = 0; x < count; x++) {
            System.out.println(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());
            products.add(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());

        }
        Thread.sleep(3000);
        }

        @And("user select digital from popular tags")
        public void select_digital () {
            diffTags.select_digital();
        }
        @Then("digital products appear successfully")
        public void digital_products_appear_successfully() throws InterruptedException {
            int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
            System.out.println(count);
            Assert.assertTrue(count > 0);
            ArrayList<String> products = null;
            products = new ArrayList<String>();
            for (int x = 0; x < count; x++) {
                System.out.println(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());
                products.add(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());

            }
            Thread.sleep(3000);
        }

        @And("user select game from popular tags")
        public void select_game ()  {
            diffTags.select_game();
        }
        @Then("game products appear successfully")

        public void game_products_appear_successfully() {
            int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
            System.out.println(count);
            Assert.assertTrue(count > 0);
            ArrayList<String> products = null;
            products = new ArrayList<String>();
            for (int x = 0; x < count; x++) {
                System.out.println(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());
                products.add(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());

            }
        }

    }

