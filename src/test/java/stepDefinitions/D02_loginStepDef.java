package stepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class D02_loginStepDef {
    WebDriver driver = null;
    LoginPage log = new LoginPage();


    @Given("user navigates to login page")
    public void user_navigates() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @And("user click on login")
    public void click_login()
    {

        log.loginButton().click();
    }

    @When("user enter his Email")
    public void valid_Email() {
        log.mail().sendKeys("sondosssmohamedwael@gmail.com");
    }

    @And("user enter valid password")
    public void valid_password() {
        log.password().sendKeys("Sondo$");
    }

    @And("user click on login button")
    public void login_button() {
       log.login().click();

    }

    @Then("user could login successfully")
    public void login_successfully() throws InterruptedException {

        Thread.sleep(3000);
        Assert.assertFalse(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/login?returnUrl=%2F"));

    }
}


