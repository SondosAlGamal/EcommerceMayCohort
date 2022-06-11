package stepDefinitions;

import Pages.ShoppingCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D09_shoppingCartStepDef {
    ShoppingCart shoppingCart=new ShoppingCart();
    @Given("user navigate to jewelry category")
    public void user_navigates()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/jewelry");

    }
    @When("user click on Flower Girl Bracelet")
    public void Flower_girl_bracelet() throws InterruptedException {
        Thread.sleep(3000);
    shoppingCart.Flower_girl_bracelet().click();
    }
    @And("user click on Add to cart 1")
    public void add_to_card1()
    {
        shoppingCart.add_to_card1().click();
    }
    @Then("success message 1 appear")
    public void success_message1()
    {
        String ExpectedResult = "The product has been added to your shopping cart";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println(" Flower Girl Bracelet:"+ ExpectedResult);
    }
    @And("user press on x button")
    public void x_button()
    {
     Hooks.driver.findElement(By.cssSelector("span[class=\"close\"]")).click();
    }


    @And("user click on Vintage Style Engagement Ring")
    public void Vintage_Style_Engagement_Ring()
    {
     shoppingCart.Vintage_Style_Engagement_Ring().click();
    }
    @And("user click on Add to cart 2")
    public void add_to_card2()
    {
    shoppingCart.add_to_card2().click();
    }
    @Then("success message 2 appear")
    public void success_message2()
    {
        String ExpectedResult = "The product has been added to your shopping cart";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("Vintage Style Engagement Ring:"+ExpectedResult );
    }




}
