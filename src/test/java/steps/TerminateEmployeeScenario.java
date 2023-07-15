package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import Pages.LoginPage;

public class TerminateEmployeeScenario extends CommonMethods{
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
        actualURLTitle = driver.getTitle();
        Assert.assertEqual(dashboardPage.expectedURLTitle, actualURLTitle);
    }

    @And("admin navigates to admin user management page")
    public void adminNavigatesToAdminUserManagementPage() {
        
    }

    @When("admin enters {string} and searches employee")
    public void adminEntersAndSearchesEmployee(String arg0) {
    }

    @And("admin checks username checkbox and deletes employee record")
    public void adminChecksUsernameCheckboxAndDeletesEmployeeRecord() {
    }
}
