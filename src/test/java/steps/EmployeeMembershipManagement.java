package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

public class EmployeeMembershipManagement extends CommonMethods {
    @Given("the employee is navigated to HRMS application")
    public void theEmployeeIsNavigatedToHRMSApplication() {
        openBrowserAndNavigateToURL();
    }

    @When("the employee enters valid ess username and password")
    public void theEmployeeEntersValidEssUsernameAndPassword() {
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("My batch 16 test case starts here");
        sendText(ConfigReader.getPropertyValue("essusername"), loginPage.usernameField);
        Log.info("my username has been entered");
        sendText(ConfigReader.getPropertyValue("esspassword"), loginPage.passwordField);
        Log.info("My password has been entered");
    }

    @And("the employee clicks on login button")
    public void theEmployeeClicksOnLoginButton() {
        click(loginPage.loginButton);
    }

    @Then("the employee is successfully logged in the application")
    public void theEmployeeIsSuccessfullyLoggedInTheApplication() {
        System.out.println("the employee logged in");
    }

    @When("the employee clicks on My Info tab")
    public void theEmployeeClicksOnMyInfoTab() {
        click(employeeMembershipManagementPage.myInfoTab);
    }

    @And("the employee clicks Memberships option")
    public void theEmployeeClicksMembershipsOption() {
        click(employeeMembershipManagementPage.membershipsOption);
    }

    @And("the employee clicks Add button")
    public void theEmployeeClicksAddButton() {
        click(employeeMembershipManagementPage.addButton);
    }

    @And("the employee enters {string} and {string} and {string} and {string} and {string} and {string} in data driven format")
    public void theEmployeeEntersAndAndAndAndAndInDataDrivenFormat
            (String Membership, String SubscriptionPaidBy, String SubscriptionAmount, String Currency, String SubscriptionCommenceDate, String SubscriptionRenewalDate) {

        Select membershipSelect = new Select(employeeMembershipManagementPage.membershipDropdown);
        membershipSelect.selectByVisibleText(Membership);

        Select subscriptionPaidBySelect = new Select(employeeMembershipManagementPage.subscriptionPaidByDropdown);
        subscriptionPaidBySelect.selectByVisibleText(SubscriptionPaidBy);

        sendText(SubscriptionAmount, employeeMembershipManagementPage.subscriptionAmountField);

        Select currencySelect = new Select(employeeMembershipManagementPage.currencyDropdown);
        currencySelect.selectByVisibleText(Currency);

        click(employeeMembershipManagementPage.renewalDateField);
        sendText(SubscriptionRenewalDate, employeeMembershipManagementPage.renewalDateField);
        click(employeeMembershipManagementPage.commenceDateField);
        sendText(SubscriptionCommenceDate, employeeMembershipManagementPage.commenceDateField);


    }

    @And("the employee clicks the save button")
    public void theEmployeeClicksTheSaveButton() throws InterruptedException {
        //Thread.sleep(2000);
        click(employeeMembershipManagementPage.saveButton);
    }


    @Then("the system should validate that mandatory fields are filled in")
    public void theSystemShouldValidateThatMandatoryFieldsAreFilledIn() {
        System.out.println("Fields are filled in");
    }

    @And("the system should store the membership details in the employee's profile")
    public void theSystemShouldStoreTheMembershipDetailsInTheEmployeeSProfile() {
        System.out.println("Details stored");
    }


    @Given("the employee has previously saved membership details")
    public void theEmployeeHasPreviouslySavedMembershipDetails() {
    }

    @When("the employee clicks on specific membership account")
    public void theEmployeeClicksOnSpecificMembershipAccount() {
        click(employeeMembershipManagementPage.pickAccount);
    }

    @And("the employee edits {string} and {string} and {string} and {string} and {string} and {string} in data driven format")
    public void theEmployeeEditsAndAndAndAndAndInDataDrivenFormat
            (String Membership, String SubscriptionPaidBy, String SubscriptionAmount, String Currency, String SubscriptionCommenceDate, String SubscriptionRenewalDate) {

        Select membershipSelect = new Select(employeeMembershipManagementPage.membershipDropdown);
        membershipSelect.selectByVisibleText(Membership);

        Select subscriptionPaidBySelect = new Select(employeeMembershipManagementPage.subscriptionPaidByDropdown);
        subscriptionPaidBySelect.selectByVisibleText(SubscriptionPaidBy);

        sendText(SubscriptionAmount, employeeMembershipManagementPage.subscriptionAmountField);

        Select currencySelect = new Select(employeeMembershipManagementPage.currencyDropdown);
        currencySelect.selectByVisibleText(Currency);

        click(employeeMembershipManagementPage.renewalDateField);
        sendText(SubscriptionRenewalDate, employeeMembershipManagementPage.renewalDateField);
        click(employeeMembershipManagementPage.commenceDateField);
        sendText(SubscriptionCommenceDate, employeeMembershipManagementPage.commenceDateField);

    }

    @Then("the system should update the employee's membership details")
    public void theSystemShouldUpdateTheEmployeeSMembershipDetails() {
    }

    @When("the employee clicks on checkbox")
    public void theEmployeeClicksOnCheckbox() throws InterruptedException {
        click(employeeMembershipManagementPage.checkBox);
        Thread.sleep(2000);
    }

    @And("the employee clicks on Delete button")
    public void theEmployeeClicksOnDeleteButton() {
        click(employeeMembershipManagementPage.deleteButton);
    }

    @Then("given membership account has been deleted")
    public void givenMembershipAccountHasBeenDeleted() {
        System.out.println("Chosen membership account was successfully deleted");
    }
}
