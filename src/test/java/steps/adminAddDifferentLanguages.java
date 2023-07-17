package steps;

import Pages.DashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;
import utils.ConfigReader;

public class adminAddDifferentLanguages extends CommonMethods {
    @Given("Admin logged in")
    public void admin_logged_in() {
        sendText(ConfigReader.getPropertyValue("username"), loginPage.usernameField);
        sendText(ConfigReader.getPropertyValue("password"), loginPage.passwordField);
        click(loginPage.loginButton);
    }
    @When("Admin navigates to qualification")
    public void admin_navigates_to_qualification() throws InterruptedException {
        click(DashboardPage.dashboardPage.AdminMenuBtn);
        Thread.sleep(2000);
        click(dashboardPage.adminQualificationBtn);
    }
    @When("Select languages")
    public void select_languages() throws InterruptedException {
        click(dashboardPage.languagesBtn);


    }
    @Then("Admin can add any language")
    public void admin_can_add_any_language() throws InterruptedException {
        click(dashboardPage.addBtn);
        Thread.sleep(2000);
        sendText(ConfigReader.getPropertyValue("Languages"),dashboardPage.nameBtn);
        click(dashboardPage.saveBtn);
    }


}
