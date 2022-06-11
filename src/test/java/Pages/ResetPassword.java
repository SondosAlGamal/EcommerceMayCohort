package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class ResetPassword {

public WebElement forgotPassword()
{
    By ForgotPassword= By.className("forgot-password");
    WebElement forgotPassword= Hooks.driver.findElement(ForgotPassword);
    return forgotPassword;
}
public WebElement Email()
{
    By E_mail=By.id("Email");
    WebElement Email= Hooks.driver.findElement(E_mail);
    return Email;
}
public WebElement RECOVER_btn()
{
    By recoverBtn1=By.name("send-email");
    WebElement RECOVER_btn= Hooks.driver.findElement(recoverBtn1);
    return RECOVER_btn;
}
}
