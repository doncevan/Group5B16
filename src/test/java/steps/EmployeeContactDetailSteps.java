package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.Assert;
import utils.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EmployeeContactDetailSteps extends CommonMethods {

    @When("user enters valid ess username and password")
    public void userEntersValidEssUsernameAndPassword() {
        //DOMConfigurator.configure("log4j.xml");
        Configurator.initialize(null, "log4j.xml");
        Log.startTestCase("My project test case starts here");
        sendText(ConfigReader.getPropertyValue("essusername"), loginPage.usernameField);
        sendText(ConfigReader.getPropertyValue("esspassword"), loginPage.passwordField);
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        click(loginPage.loginButton);
    }

    @Then("user is successfully logged in the application")
    public void userIsSuccessfullyLoggedInTheApplication() {
        Log.info("i am on dashboard page");
    }

    @When("user clicks on My Info tab")
    public void userClicksOnMyInfoTab() {
        click(employeeContactDetailPage.myInfoBtn);
        Log.info("clicking my info btn");
    }

    @When("user clicks on contact detail")
    public void userClicksOnContactDetail() throws InterruptedException {
        click(employeeContactDetailPage.contactDetailBtn);
        Log.info("clicking on contact detail btn");
        click(employeeContactDetailPage.editBtn);
        Log.info("clicking on edit btn");
    }

    @Then("user is on contact detail page")
    public void userIsOnContactDetailPage() {
        Log.info("i am on contact detail page");
    }

    @When("user edits contact details using excel file {string} and save it")
    public void userEditsContactDetailsUsingExcelFileAndSaveIt(String sheetName) {
        List<Map<String, String>> newContactDetail =
                ExcelReader.readData(sheetName, Constants.EXCEL_READER_PATH);
        Iterator<Map<String, String>> itr = newContactDetail.iterator();
        while (itr.hasNext()) {
            //in this map,we have data from every employee
            Map<String, String> mapNewInfo = itr.next();
            sendText(mapNewInfo.get("Address Street 1"), employeeContactDetailPage.streetOneTextBox);
            sendText(mapNewInfo.get("Address Street 2"), employeeContactDetailPage.streetTwoTextBox);
            sendText(mapNewInfo.get("City"), employeeContactDetailPage.cityTextBox);
            sendText(mapNewInfo.get("State/Province"), employeeContactDetailPage.provinceTextBox);
            sendText(mapNewInfo.get("Zip/Postal Code"), employeeContactDetailPage.zipcodeTextBox);
            click(employeeContactDetailPage.countryTextBox);
            selectFromDropdown(employeeContactDetailPage.countryTextBox, "Australia");
            sendText(mapNewInfo.get("Home Telephone"), employeeContactDetailPage.homePhoneTextBox);
            sendText(mapNewInfo.get("Mobile"), employeeContactDetailPage.mobileTextBox);
            sendText(mapNewInfo.get("Work Telephone"), employeeContactDetailPage.workPhoneTextBox);
            sendText(mapNewInfo.get("Work Email"), employeeContactDetailPage.emailTextBox);
            sendText(mapNewInfo.get("Other Email"), employeeContactDetailPage.otherEmailTextBox);
            click(employeeContactDetailPage.saveBtn);
        }
    }

    @Then("user contact details should be updated successfully")
    public void userContactDetailsShouldBeUpdatedSuccessfully() {
        click(employeeContactDetailPage.editBtn);
        String actualText = employeeContactDetailPage.emailTextBox.getAttribute("value");
        Log.info("my test case ended here");
        String expectedText = "catty@gmail.com";
        Assert.assertEquals(expectedText, actualText);
    }
}