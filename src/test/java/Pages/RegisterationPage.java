package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class RegisterationPage {
    public WebElement registerEle() {
        By registration = By.className("ico-register");
        WebElement registerEle = Hooks.driver.findElement(registration);
        return registerEle;
    }

    public WebElement fistName() {
        By FirstName = By.id("FirstName");
        WebElement fistName = Hooks.driver.findElement(FirstName);
        return fistName;
    }

    public WebElement lastName() {
        By LastName = By.id("LastName");
        WebElement lastName = Hooks.driver.findElement(LastName);
        return lastName;
    }

    public WebElement email() {
        By Email = By.id("Email");
        WebElement email = Hooks.driver.findElement(Email);
        return email;
    }
    public WebElement passWord()
    {
        By PassEle=By.id("Password");
        WebElement passWord=Hooks.driver.findElement(PassEle);
        return passWord;
    }
   public WebElement confirmpassWord()
   {
     By confPass=By.id("ConfirmPassword");
     WebElement confirmpassWord=Hooks.driver.findElement(confPass);
     return confirmpassWord;
   }
   public WebElement registerButton()
   {
    By regBtn=By.name("register-button");
    WebElement registerButton= Hooks.driver.findElement(regBtn);
    return registerButton;
   }
}