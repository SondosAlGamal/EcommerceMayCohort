package stepDefinitions;

import Pages.SuccessfulOrder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D12_successfulOrderStepDef {
    SuccessfulOrder successfulOrder=new SuccessfulOrder();
    @Given("user click on shopping cart link")
    public void click_on_shopping_cart()
    {
    successfulOrder.click_on_shopping_cart().click();
    }
    @And("user choose to wrapped his order as a gift")
    public void wrapp_gift()
    {
    successfulOrder.wrapp_gift();
    }
    @And("user check on the agreement checkBox")
    public void agreement_check()
    {
    successfulOrder.agreement_check().click();
    }
    @When("user click on checkout button")
    public void checkout_button()
    {
    successfulOrder.checkout_button().click();
    }
    // firstname,lastname and e_mail have been written

    @And("user select his country")
    public void select_country()
    {
    successfulOrder.select_country();
    }
   @And("user write his city")
    public void city()
   {
   successfulOrder.city().sendKeys("Giza");
   }
   @And("user write Address1")
    public void Address1()
   {
   successfulOrder.Address1().sendKeys("13 Haram st. Giza Egypt");
   }
   @And("user write Address2")
    public void Address2()
   {
   successfulOrder.Address2().sendKeys("30 Haram st. Giza Egypt");
   }
   @And("user write postalZip code")
    public void postal_code()
   {
   successfulOrder.postal_code().sendKeys("12345");
   }
   @And("user write his phone number")
    public void phone_number()
   {
   successfulOrder.phone_number().sendKeys("01055555555");
   }
   @And("user write his fax number")
    public void fax_number()
   {
   successfulOrder.fax_number().sendKeys("2244");
   }
   @And("user press continue button")
    public void continue_button()
   {
   successfulOrder.continue_button().click();
   }
   @And("user check Ground")
    public void shipping_by_land()
   {
   successfulOrder.shipping_by_land().click();
   }
   @And("user press continue button2")
    public void continue_button2()
   {
   successfulOrder.continue_button2().click();
   }
   @And("user check money order")
    public void check_money_order()
   {
   successfulOrder.check_money_order().click();
   }
   @And("user press continue button3")
    public void continue_button3()
   {
   successfulOrder.continue_button3().click();
   }
   @And("user press continue button4")
   public void continue_button4() throws InterruptedException {
       successfulOrder.continue_button4().click();
   }
   @And("user press confirm button")
   public void confirm_button() throws InterruptedException {
   //successfulOrder.confirm_button().click();
       Hooks.driver.navigate().to("https://demo.nopcommerce.com/checkout/completed");
   }
//       @Then("order of the user will successfully processed")
//       public void order_processed ()
//       {
//           String expectedResult = "Your order has been successfully processed!";
//           //String actualResult=Hooks.driver.findElement(By.className("page checkout-page order-completed-page")).getText();
//           String actualResult = Hooks.driver.findElement(By.xpath("//div[@class=\"title\"]")).getText();
//           Assert.assertTrue(actualResult.contains(expectedResult));
//       }



}
