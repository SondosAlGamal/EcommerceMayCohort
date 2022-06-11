package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.Hooks;

public class SuccessfulOrder {

    public WebElement click_on_shopping_cart()
    {
     By clickShoppingCart= By.cssSelector("a[href=\"/cart\"]");
     WebElement click_on_shopping_cart= Hooks.driver.findElement(clickShoppingCart);
     return click_on_shopping_cart;
    }
    public WebElement wrapp_gift()
    {
     By wrappGift=By.id("checkout_attribute_1");
     WebElement wrapp_gift=Hooks.driver.findElement(wrappGift);
     Select wrappedGift = new Select(wrapp_gift);
     wrappedGift.selectByVisibleText("Yes [+$10.00]");
     return wrapp_gift;
    }
    public WebElement agreement_check()
    {
     By agreementCheck=By.id("termsofservice");
     WebElement agreement_check=Hooks.driver.findElement(agreementCheck);
     return agreement_check;
    }
    public WebElement checkout_button()
    {
     By checkoutButton = By.id("checkout");
     WebElement checkout_button=Hooks.driver.findElement(checkoutButton);
     return checkout_button;
    }
//    public WebElement Email_Address()
//    {
//        By emailAddress = By.className("email");
//        WebElement Email_Address = Hooks.driver.findElement(emailAddress);
//        return Email_Address;
//    }
//    public WebElement write_pass() {
//        By writePassword = By.id("Password");
//        WebElement write_pass = Hooks.driver.findElement(writePassword);
//        return write_pass;
//
//    }
//    public  WebElement logInBtn()
//    {
//        By log_in = By.cssSelector("button[class=\"button-1 login-button\"]");
//        WebElement logInBtn = Hooks.driver.findElement(log_in);
//        return logInBtn;
//    }
//    public WebElement agreement_checkbox2() {
//        By agreement = By.id("termsofservice");
//        WebElement agreement_checkbox2 = Hooks.driver.findElement(agreement);
//        return agreement_checkbox2;}
//    public WebElement checkout_button2() {
//        By checkout = By.id("checkout");
//        WebElement checkout_button2 = Hooks.driver.findElement(checkout);
//        return checkout_button2;
//    }
//    public WebElement company_name()
//    {
//     By companyName= By.xpath("//input[@type=\"text\"]");
//     WebElement company_name=Hooks.driver.findElement(companyName);
//     return company_name;
//
//    }
    public WebElement select_country()
    {
     By selectCountry =By.id("BillingNewAddress_CountryId");
     WebElement select_country=Hooks.driver.findElement(selectCountry);
        Select selectCountryVar=new Select(select_country);
        selectCountryVar.selectByVisibleText("Egypt");
     return select_country;
    }
    public WebElement city()
    {
     By City= By.id("BillingNewAddress_City");
     WebElement city=Hooks.driver.findElement(City);
     return city;
    }
    public WebElement Address1()
    {
    By Address1Var=By.id("BillingNewAddress_Address1");
    WebElement Address1=Hooks.driver.findElement(Address1Var);
    return Address1;
    }
    public WebElement Address2()
    {
     By Address2Var=By.id("BillingNewAddress_Address2");
     WebElement Address2=Hooks.driver.findElement(Address2Var) ;
     return Address2;
    }
    public WebElement postal_code()
    {
     By postalCode= By.id("BillingNewAddress_ZipPostalCode");
     WebElement postal_code=Hooks.driver.findElement(postalCode);
     return postal_code;
    }
    public WebElement phone_number()
    {
    By phoneNumber= By.id("BillingNewAddress_PhoneNumber");
    WebElement phone_number=Hooks.driver.findElement(phoneNumber);
    return phone_number;
    }
    public WebElement fax_number()
    {
     By faxNumber= By.id("BillingNewAddress_FaxNumber");
     WebElement fax_number=Hooks.driver.findElement(faxNumber);
     return fax_number;
    }
    public WebElement continue_button()
    {
     By continueBtn=By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]");
     WebElement continue_button=Hooks.driver.findElement(continueBtn);
     return continue_button;
    }
    public WebElement shipping_by_land()
    {
     By byLand=By.id("shippingoption_0");
     WebElement shipping_by_land=Hooks.driver.findElement(byLand);
     return shipping_by_land;
    }
    public WebElement continue_button2()
    {
     By continueBtn2=By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");
     WebElement continue_button2=Hooks.driver.findElement(continueBtn2);
     return continue_button2;
    }
    public WebElement check_money_order()
    {
     By moneyOrder = By.id("paymentmethod_0");
     WebElement check_money_order=Hooks.driver.findElement(moneyOrder);
     return check_money_order;
    }
    public WebElement continue_button3()
    {
     By continueBtn3= By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
     WebElement continue_button3=Hooks.driver.findElement(continueBtn3);
     return continue_button3;
    }
    public WebElement continue_button4()  {
     By  continueBtn4= By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");
     WebElement continue_button4=Hooks.driver.findElement(continueBtn4);
     return continue_button4;

    }

//    public WebElement confirm_button() throws InterruptedException {
//        Thread.sleep(5000);
//     By confirmButton= By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");
//     WebElement confirm_button=Hooks.driver.findElement(confirmButton);
//     return confirm_button;
//    }


}
