package org.example;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterUsername()
    {
        driver.findElement(username).sendKeys("standard_user");
    }

    public void enterPassword()
    {
        driver.findElement(password).sendKeys("secret_sauce");
    }

    public void clickLogin()
    {
        driver.findElement(loginBtn).click();
    }

}