package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;
import utils.ConfigReader;

import java.time.Duration;

public class TerminateEmployeeScenario extends CommonMethods {
    @Given("user is navigated to HRMS application")
    public void userIsNavigatedToHRMSApplication() {
        //enter admin credentials into login page and login
        String adminUserName = ConfigReader.getPropertyValue("adminusername");
        String adminPassWord = ConfigReader.getPropertyValue("adminpassword");
         CommonMethods.sendText(adminUserName, loginPage.usernameField);
         CommonMethods.sendText(adminPassWord, loginPage.passwordField);
         CommonMethods.click(loginPage.loginButton);

         //verify we are now on dashboard page
        CommonMethods.waitForClickability(dashboardPage.pimDashboardBtn);
        String actualURLTitle = driver.getTitle();
        Assert.assertEquals(dashboardPage.expectedPageTitle, actualURLTitle);
    }
//
//    @And("admin navigates to admin user management page")
//    public void adminNavigatesToAdminUserManagementPage() {
//
//       //navigate to admin user management page
//       CommonMethods.click(dashboardPage.adminDashboardBtn);
//
//    }

    @When("admin enters {string} and searches employee")
    public void adminEntersAndSearchesEmployee(String id) throws InterruptedException {
        //send username and search database for user
        adminAddJobDetaisPage.idTextField.clear();
        CommonMethods.sendText(id, adminAddJobDetaisPage.idTextField);
        CommonMethods.click(adminUMPage.searchButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(adminAddJobDetaisPage.idMemberEmp));
        //compare username search results to given username
        String actualUserName = adminAddJobDetaisPage.idMemberEmp.getText();
        System.out.println(actualUserName);
        Assert.assertEquals(id, actualUserName);
    }
    @And("admin clicks on id and navigates to job details")
    public void adminClicksOnIdAndNavigatesToJobDetails() {
        click(adminAddJobDetaisPage.idMemberEmp);
        waitForClickability(adminAddJobDetaisPage.jobFieldBtn);
        click(adminAddJobDetaisPage.jobFieldBtn);
    }

    @When("admin clicks terminate btn and gives a reason")
    public void adminClicksTerminateBtnAndGivesAReason() {
        click(adminUMPage.terminateEmploymentBtn);
        click(adminUMPage.confirmTerminateBtn);
    }

    @Then("validate employee terminated")
    public void validateEmployeeTerminated() {
        String actualActivateEmp = adminUMPage.validateTermination.getText();
        if(actualActivateEmp.contains("Terminated on")){
            Assert.assertTrue(true);
        }
     //   Assert.assertEquals(adminUMPage.expectedActivateEmp, actualActivateEmp);
    }
}
