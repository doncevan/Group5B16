package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

public class EmployeeContactDetails extends CommonMethods {
    @Given("the employee navigated on HRMS site")
    public void theEmployeeNavigatedOnHRMSSite() {
    }

    @When("employee enters valid username and password")
    public void employeeEntersValidUsernameAndPassword() {
        //DOMConfigurator.configure("log4j.xml");
        Configurator.initialize(null, "log4j.xml");
        Log.startTestCase("The employee's contact details update test case starts here");
        sendText(ConfigReader.getPropertyValue("essusername"), loginPage.usernameField);
        Log.info("Username has been entered");
        sendText(ConfigReader.getPropertyValue("esspassword"), loginPage.passwordField);
        Log.info("Password has been entered");
    }

    @And("employee clicks on login button")
    public void employeeClicksOnLoginButton() { click(loginPage.loginButton);
    }

    @Then("employee has successfully navigated to HRMS site")
    public void employeeHasSuccessfullyNavigatedToHRMSSite() {
        System.out.println("The employee logged in");
    }

    @When("employee clicks on My Info tab")
    public void employeeClicksOnMyInfoTab() { click(employeeDetailsManagementPage.myInfoTab);
    }

    @And("employee clicks on Edit button")
    public void employeeClicksOnEditButton() {
        click(employeeDetailsManagementPage.editButton);
    }

    @And("employee edits firstName")
    public void employeeEditsFirstName() {
        sendText("Abraham", employeeDetailsManagementPage.firstName);
    }

    @And("employee edits middleName")
    public void employeeEditsMiddleName() {
        sendText("John", employeeDetailsManagementPage.middleName);
    }

    @And("employee edits lastName")
    public void employeeEditsLastName() {
        sendText("Lennon", employeeDetailsManagementPage.lastName);
    }

    @And("employee edits gender")
    public void employeeEditsGender() {
        click(employeeDetailsManagementPage.gender);
    }

    @And("employee edits nationality")
    public void employeeEditsNationality() {
        selectFromDropdown(employeeDetailsManagementPage.nationality, "American");
    }

    @And("employee edits maritalStatus")
    public void employeeEditsMaritalStatus() {
        selectFromDropdown(employeeDetailsManagementPage.maritalStatus, "Single");
    }

    @And("employee clicks on Save button")
    public void employeeClicksOnSaveButton() {
        click(employeeDetailsManagementPage.Save);
    }

    @Then("employees personal information should be saved")
    public void employeesPersonalInformationShouldBeSaved() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return document.querySelector('.message.success.fadable').childNodes[0].nodeValue.trim()";
        String messageText = (String) js.executeScript(script);
        Assert.assertEquals("Successfully Saved", messageText);
        System.out.println("The employee successfully updated personal information");
    }
}
