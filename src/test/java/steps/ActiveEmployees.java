package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

import java.util.List;

public class ActiveEmployees extends CommonMethods {

    @Given("admin is navigated to HRMS application")
    public void essIsNavigatedToHRMSApplication() {
        String adminUser = ConfigReader.getPropertyValue("adminusername");
        String adminPass = ConfigReader.getPropertyValue("adminpassword");
        sendText(adminUser, activeEmpPage.usernameField);
        sendText(adminPass, activeEmpPage.passwordField);
        click(activeEmpPage.loginButton);
    }
    @Given("admin is on the PIM page")
    public void adminIsOnThePIMPage() {
        click(activeEmpPage.viewPIM);
        click(activeEmpPage.viewEmpList);
    }

    @And("admin clicks on Employment Status and selected active")
    public void adminClicksOnEmploymentStatusAndSelectedActive() throws InterruptedException {
        click(activeEmpPage.empStatusDropDown);
        Thread.sleep(2000);
        click(activeEmpPage.selectActiveEmp);
    }

    @And("admin clicks on search button")
    public void adminClicksOnSearchButton() {
        click(activeEmpPage.searchBtn);
    }

    @When("admin stores active employees on a list or a table")
    public void adminStoresActiveEmployeesOnAListOrATable() {
        List<WebElement> allActiveEmp =  driver.findElements(By.xpath("//tbody"));
        for (WebElement activeEmp: allActiveEmp){
            String nameOfActiveEmp = activeEmp.getText();
            System.out.println(nameOfActiveEmp);
        }
    }

    @Then("admin is successfully able to view all employees on the active list")
    public void adminIsSuccessfullyAbleToViewAllEmployeesOnTheActiveList() {
        System.out.println("Admin have successfully listed all employees on a list");
    }
}
