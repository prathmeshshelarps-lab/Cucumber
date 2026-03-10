package org.example;



import org.example.Hooks;
import io.cucumber.java.en.*;
import org.example.LoginPage;

public class LoginSteps {

    LoginPage login = new LoginPage(Hooks.driver);
    
@Given("user launches the browser")
public void launch_browser() {
    System.out.println("Browser launched");
}

    @When("user opens login page")
    public void open_login()
    {
    }

    @And("user enters username and password")
    public void enter_credentials()
    {
        login.enterUsername();
        login.enterPassword();
        login.clickLogin();
    }

    @Then("user should be logged in successfully")
    public void verify_login()
    {
        System.out.println("Login successful");
    }

}