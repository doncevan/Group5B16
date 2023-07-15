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

    @And("admin navigates to admin user management page")
    public void adminNavigatesToAdminUserManagementPage() {

       //navigate to admin user management page
       CommonMethods.click(dashboardPage.adminDashboardBtn);

    }

    @When("admin enters {string} and searches employee")
    public void adminEntersAndSearchesEmployee(String username) throws InterruptedException {
        //send username and search database for user
        adminUMPage.searchUserNameField.clear();
        CommonMethods.sendText(username, adminUMPage.searchUserNameField);
        CommonMethods.click(adminUMPage.searchButton);
        Thread.sleep(3000);
        //compare username search results to given username
        String actualUserName = adminUMPage.firstUserNameUserTable.getText();
        System.out.println(actualUserName);
        Assert.assertEquals(username, actualUserName);
    }


    @Then("admin checks {string} checkbox and deletes employee record")
    public void adminChecksCheckboxAndDeletesEmployeeRecord(String username) throws InterruptedException {
        //check if checkbox is selected, select checkbox and delete record
        if(!adminUMPage.firstCheckBoxUserTable.isSelected()){
            CommonMethods.click(adminUMPage.firstCheckBoxUserTable);
            if(adminUMPage.firstCheckBoxUserTable.isSelected()){
                CommonMethods.click(adminUMPage.deleteButton);
                CommonMethods.waitForClickability(adminUMPage.deleteRecordsOkButton);
                CommonMethods.click(adminUMPage.deleteRecordsOkButton);

                //validate that user was deleted from database
                WebDriverWait driverWait = CommonMethods.getWait();
                driverWait.until(ExpectedConditions.visibilityOf(adminUMPage.searchUserNameField));
                adminUMPage.searchUserNameField.clear();
                CommonMethods.sendText(username, adminUMPage.searchUserNameField);
                CommonMethods.click(adminUMPage.searchButton);
                Thread.sleep(3000);
                String noRecordsFoundText = adminUMPage.NoRecordsFoundUserTable.getText();
                Assert.assertEquals(adminUMPage.expectedNoRecordsFound, noRecordsFoundText);
            }
        }
    }
}
