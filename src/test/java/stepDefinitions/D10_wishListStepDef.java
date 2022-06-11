package stepDefinitions;

import Pages.WishList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import static stepDefinitions.Hooks.driver;

public class D10_wishListStepDef {
    WishList wishList=new WishList();
    @When("user add Apple MacBook to wishlist")
    public void Apple_MacBook() {
        wishList.Apple_MacBook().click();
    }

    @And("user click on add to wishlist button")
    public void Add_To_Wishlist_1() {
        wishList.Add_To_Wishlist_1().click();
    }

    @Then("success message_1")
    public void Success_message_1() {
        String ExpectedResult = "The product has been added to your wishlist";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("Apple MacBook Pro 13-inch: The product has been added to your wishlist");
    }
    @When("user add Laptop Samsung to wishlist")

    public void Laptop_Samsung() {
        wishList.Laptop_Samsung().click();
    }
    @And("user click on add to wishlist button_2")
    public void Add_To_wishlist_2() {
        wishList.Add_To_Wishlist_2().click();
    }
    @Then("success message_2")
    public void Success_message_2() {
        String ExpectedResult = "The product has been added to your wishlist";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("Samsung Series 9 Laptop: The product has been added to your wishlist");
    }




}
