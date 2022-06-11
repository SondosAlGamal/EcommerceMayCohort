package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class LoginPage {

    public WebElement loginButton ()
    {
    By login = By.cssSelector("a[href=\"/login?returnUrl=%2F\"]");
    WebElement loginButton= Hooks.driver.findElement(login);
    return loginButton;
    }

    public WebElement mail()
    {
    By email=By.id("Email");
    WebElement mail= Hooks.driver.findElement(email);
    return mail;
    }

public WebElement password()
{
    By PasswordEle=By.name("Password");
    WebElement password= Hooks.driver.findElement(PasswordEle);
    return  password;
}
public WebElement login()
{
     By Login=By.cssSelector("button[class=\"button-1 login-button\"]");
    WebElement login=Hooks.driver.findElement(Login);
    return(login);


}




}
