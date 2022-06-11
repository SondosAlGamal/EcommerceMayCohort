package stepDefinitions;

import Pages.CompareList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D11_compareListStepDef {
    CompareList compareList=new CompareList();
    @When("user add Apple MacBook to compare list")
    public void Apple_MacBook() {
        compareList.Apple_MacBook().click();
    }

    @And("user click on add to compare list button")
    public void Add_To_compare_List_1() {
        compareList.Add_To_compare_List_1().click();
    }

    @Then("success message1")
    public void Success_message1() {
        String ExpectedResult = "The product has been added to your product comparison";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("Apple MacBook Pro 13-inch: The product has been added to your product comparison");
    }
    @When("user add Laptop Samsung to compare list")

    public void Laptop_Samsung() {
        compareList.Laptop_Samsung().click();
    }
    @And("user click on add to compare list button_2")
    public void Add_To_compare_List_2() {
        compareList.Add_To_compare_List_2().click();
    }
    @Then("success message2")
    public void Success_message2() {
        String ExpectedResult = "The product has been added to your product comparison";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("Samsung Series 9 NP900X4C-A06US 15-Inch Ultrabook: The product has been added to your product comparison");
    }


}

