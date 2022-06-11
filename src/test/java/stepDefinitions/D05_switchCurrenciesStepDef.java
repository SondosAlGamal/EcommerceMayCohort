package stepDefinitions;

import Pages.SwitchCurrencies;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D05_switchCurrenciesStepDef {
    SwitchCurrencies switchCurrencies=new SwitchCurrencies();

    @Given("user press on dropdown menu and choose Euro")
    public void dropDown_2 () throws InterruptedException {
    switchCurrencies.Euro_Currency();
    }
    @Then("user choose Euro successfully")
    public void Euro_added()
    {
        String ExpectedResult = "Euro";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));

    }
    @And("user press on dropdown menu and choose US Dollar")
    public void dropDown_1() throws InterruptedException {
        switchCurrencies.US_Dollar();
    }
    @Then("user choose US Dollar successfully")
    public void US_Dollar_added()
    {
        String ExpectedResult ="US Dollar";
        String ActualResult =Hooks.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }





}
