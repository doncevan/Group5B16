package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

public class EmployeeMembershipManagement extends CommonMethods {
    @Given("the employee is navigated to HRMS application")
    public void theEmployeeIsNavigatedToHRMSApplication() {
    }

    @When("the employee enters valid ess username and password")
    public void theEmployeeEntersValidEssUsernameAndPassword() {
        // DOMConfigurator.configure("log4j2.xml");
        Configurator.initialize(null, "testData/log4j2.xml");
        Log.startTestCase("My employee membership management test case starts here");
        sendText(ConfigReader.getPropertyValue("essusername"), loginPage.usernameField);
        Log.info("My username has been entered");
        sendText(ConfigReader.getPropertyValue("esspassword"), loginPage.passwordField);
        Log.info("My password has been entered");
    }

    @And("the employee clicks on login button")
    public void theEmployeeClicksOnLoginButton() {
        click(loginPage.loginButton);
    }

    @Then("the employee is successfully logged in the application")
    public void theEmployeeIsSuccessfullyLoggedInTheApplication() {
        System.out.println("The employee logged in");
    }

    @When("the employee clicks on My Info tab")
    public void theEmployeeClicksOnMyInfoTab() {
        click(employeeDetailsManagementPage.myInfoTab);
    }

    @And("the employee clicks Memberships option")
    public void theEmployeeClicksMembershipsOption() {
        click(employeeDetailsManagementPage.membershipsOption);
    }

    @And("the employee clicks Add button")
    public void theEmployeeClicksAddButton() {
        click(employeeDetailsManagementPage.addButton);
    }

    @And("the employee enters {string} and {string} and {string} and {string} and {string} and {string} in data driven format")
    public void theEmployeeEntersAndAndAndAndAndInDataDrivenFormat
            (String Membership, String SubscriptionPaidBy, String SubscriptionAmount, String Currency, String SubscriptionCommenceDate, String SubscriptionRenewalDate) {

        Select membershipSelect = new Select(employeeDetailsManagementPage.membershipDropdown);
        membershipSelect.selectByVisibleText(Membership);

        Select subscriptionPaidBySelect = new Select(employeeDetailsManagementPage.subscriptionPaidByDropdown);
        subscriptionPaidBySelect.selectByVisibleText(SubscriptionPaidBy);
        sendText(SubscriptionAmount, employeeDetailsManagementPage.subscriptionAmountField);

        Select currencySelect = new Select(employeeDetailsManagementPage.currencyDropdown);
        currencySelect.selectByVisibleText(Currency);

        click(employeeDetailsManagementPage.renewalDateField);
        sendText(SubscriptionRenewalDate, employeeDetailsManagementPage.renewalDateField);
        click(employeeDetailsManagementPage.commenceDateField);
        sendText(SubscriptionCommenceDate, employeeDetailsManagementPage.commenceDateField);
    }

    @And("the employee clicks the save button")
    public void theEmployeeClicksTheSaveButton() {
        click(employeeDetailsManagementPage.saveButton);
    }


    @Then("the system should validate that mandatory fields are filled in")
    public void theSystemShouldValidateThatMandatoryFieldsAreFilledIn() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return document.querySelector('.message.success.fadable').childNodes[0].nodeValue.trim()";
        String messageText = (String) js.executeScript(script);
        Assert.assertEquals("Successfully Saved", messageText);
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
        click(employeeDetailsManagementPage.pickAccount);
    }

    @And("the employee edits {string} and {string} and {string} and {string} and {string} and {string} in data driven format")
    public void theEmployeeEditsAndAndAndAndAndInDataDrivenFormat
            (String Membership, String SubscriptionPaidBy, String SubscriptionAmount, String Currency, String SubscriptionCommenceDate, String SubscriptionRenewalDate) {

        Select membershipSelect = new Select(employeeDetailsManagementPage.membershipDropdown);
        membershipSelect.selectByVisibleText(Membership);

        Select subscriptionPaidBySelect = new Select(employeeDetailsManagementPage.subscriptionPaidByDropdown);
        subscriptionPaidBySelect.selectByVisibleText(SubscriptionPaidBy);
        sendText(SubscriptionAmount, employeeDetailsManagementPage.subscriptionAmountField);

        Select currencySelect = new Select(employeeDetailsManagementPage.currencyDropdown);
        currencySelect.selectByVisibleText(Currency);

        click(employeeDetailsManagementPage.renewalDateField);
        sendText(SubscriptionRenewalDate, employeeDetailsManagementPage.renewalDateField);
        click(employeeDetailsManagementPage.commenceDateField);
        sendText(SubscriptionCommenceDate, employeeDetailsManagementPage.commenceDateField);
    }

    @Then("the system should update the employee's membership details")
    public void theSystemShouldUpdateTheEmployeeSMembershipDetails() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return document.querySelector('.message.success.fadable').childNodes[0].nodeValue.trim()";
        String messageText = (String) js.executeScript(script);
        Assert.assertEquals("Successfully Saved", messageText);
    }

    @When("the employee clicks on checkbox")
    public void theEmployeeClicksOnCheckbox() {
        click(employeeDetailsManagementPage.checkBox);
    }

    @And("the employee clicks on Delete button")
    public void theEmployeeClicksOnDeleteButton() {
        click(employeeDetailsManagementPage.deleteButton);
    }

    @Then("given membership account has been deleted")
    public void givenMembershipAccountHasBeenDeleted() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return document.querySelector('.message.success.fadable').childNodes[0].nodeValue.trim()";
        String messageText = (String) js.executeScript(script);
        Assert.assertEquals("Successfully Deleted", messageText);
        System.out.println("Chosen membership account was successfully deleted");
    }
}