package stepDefinitions;

import Pages.ResetPassword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D03_resetPassStepDef {
   ResetPassword reset=new ResetPassword();

    @And("user click on Forgot password")
    public void click_forgot_pass()
    {
       reset.forgotPassword().click();
    }
    @When("user write his e_mail")
    public void write_email()
    {
       reset.Email().sendKeys("sondosssmohamedwael@gmail.com");
    }
    @And("press RECOVER button")
    public void RECOVER_button()
    {
     reset.RECOVER_btn().click();
    }
    @Then("a message is displayed to the user")
    public void displayed_message()
    {
        String expectedResult ="Email with instructions has been sent to you.";
        String actualResult= Hooks.driver.findElement(By.className("content")).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
