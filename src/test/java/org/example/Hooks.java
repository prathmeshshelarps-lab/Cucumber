package org.example;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.example.DriverFactory;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setup()
    {
        driver = DriverFactory.initDriver();
        driver.get("https://www.saucedemo.com");
    }

    @After
    public void teardown()
    {
        driver.quit();
    }

}