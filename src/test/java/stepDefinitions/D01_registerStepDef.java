package stepDefinitions;

import Pages.RegisterationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D01_registerStepDef {
    WebDriver driver = null;
    RegisterationPage register = new RegisterationPage();
    @Given("user click on Register")
    public void Register()
    {
   register.registerEle().click();
    }
    @When("user write his first name")
    public void first_name()
    {
    register.fistName().sendKeys("Sondos");
    }
    @And("user write his last name")
    public void last_name()

    {
        register.lastName().sendKeys("Wael");
    }
    @And("user write his Email")
    public void email()
    {
    register.email().sendKeys("sondosssmohamedwael@gmail.com");
    }
    @And("user write his password")
    public void Pass()
    {
        register.passWord().sendKeys("Sondo$");
    }
    @And("user confirm his password")
    public void confirm_pass()
    {
        register.confirmpassWord().sendKeys("Sondo$");
    }
    @And("user click on register button")
    public void register_btn ()
    {
    register.registerButton().click();
    }
    @Then("user sign up successfully and success message is displayed")
    public void success_message()
    {
        String expectedResult ="Your registration completed";
        String actualResult= Hooks.driver.findElement(By.className("result")).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }




}
