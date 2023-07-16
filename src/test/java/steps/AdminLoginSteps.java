package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

public class AdminLoginSteps extends CommonMethods {
    @Given("admin is navigated to the HRMS website")
    public void adminIsNavigatedToTheHRMSWebsite() {
        openBrowserAndNavigateToURL();
    }

    @When("admin enters valid username and password")
    public void adminEntersValidUsernameAndPassword() {
        sendText(ConfigReader.getPropertyValue("adminusername"), loginPage.usernameField);
        Log.info("Admin's username has been entered");
        sendText(ConfigReader.getPropertyValue("adminpassword"), loginPage.passwordField);
        Log.info("Admin's password has been entered");
    }

    @And("admin clicks on login button")
    public void adminClicksOnLoginButton() {
        click(loginPage.loginButton);

    }

    @Then("admin is successfuly logged in the application")
    public void adminIsSuccessfulyLoggedInTheApplication() {
        System.out.println("Admin has successfully loged into application");
    }
}
