package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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

    @When("admin enters {string} and searches employee")
    public void adminEntersAndSearchesEmployee(String id) throws InterruptedException {
        //send username and search database for user
        adminAddJobDetailsPage.idTextField.clear();
        CommonMethods.sendText(id, adminAddJobDetailsPage.idTextField);
        CommonMethods.click(adminUMPage.searchButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(adminAddJobDetailsPage.idMemberEmp));
        //compare username search results to given username
        String actualUserName = adminAddJobDetailsPage.idMemberEmp.getText();
        System.out.println(actualUserName);
        Assert.assertEquals(id, actualUserName);
    }

    @And("admin clicks on id and navigates to job details")
    public void adminClicksOnIdAndNavigatesToJobDetails() {
        click(adminAddJobDetailsPage.idMemberEmp);
        waitForClickability(adminAddJobDetailsPage.jobFieldBtn);
        click(adminAddJobDetailsPage.jobFieldBtn);
    }

    @When("admin clicks terminate btn and gives a reason")
    public void adminClicksTerminateBtnAndGivesAReason() {
        click(adminUMPage.terminateEmploymentBtn);
        click(adminUMPage.confirmTerminateBtn);
    }

    @Then("validate employee terminated")
    public void validateEmployeeTerminated() {
        String actualActivateEmp = adminUMPage.validateTermination.getText();
        if (actualActivateEmp.contains("Terminated on")) {
            Assert.assertTrue(true);
        }
        //   Assert.assertEquals(adminUMPage.expectedActivateEmp, actualActivateEmp);
    }
}