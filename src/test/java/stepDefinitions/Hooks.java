package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
  //Define before and after annotation for your driver

    public static WebDriver driver=null;

@Before
    public void openBrowser()
{
    //1-should be the first step in your code
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\EcommerceMayCohort\\src\\main\\resources\\chromedriver.exe");
    //2-new object
    driver=new ChromeDriver();
    //3-cofiguration to the driver
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    //4-navigate to the url
    driver.navigate().to("https://demo.nopcommerce.com/");

}
@After
    public void quitDriver()
{
    driver.quit();
}

}
