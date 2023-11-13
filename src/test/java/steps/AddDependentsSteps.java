package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

public class AddDependentsSteps extends CommonMethods {

    @Given("user is logged into the HRMS system application")
    public void user_is_logged_into_the_hrms_system_application() {
        String adminUserName = ConfigReader.getPropertyValue("adminusername");
        String adminPassWord = ConfigReader.getPropertyValue("adminpassword");
        CommonMethods.sendText(adminUserName, loginPage.usernameField);
        CommonMethods.sendText(adminPassWord, loginPage.passwordField);
        CommonMethods.click(loginPage.loginButton);
    }

    @Then("user clicks on PIM option and Employee list option")
    public void user_clicks_on_pim_option_and_employee_list_option() {
        click(dashboardPage.pimDashboardBtn);

    }

    @Then("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        sendText("86628A", addDepPage.idTextField);
    }

    @Then("user clicks on search button")
    public void user_clicks_on_search_button() {
        click(addDepPage.searchButton);
    }

    @Then("user selects the employee file")
    public void user_selects_the_employee_file() {
        WebElement selectFile = driver.findElement(By.xpath("//form[@id='frmList_ohrmListComponent']//table/tbody/tr/td/a"));
        selectFile.click();
    }

    @Then("user navigates to the dependents section")
    public void user_navigates_to_the_dependents_section() {
        WebElement dependentsButton = driver.findElement(By.xpath("//a[normalize-space()='Dependents']"));
        dependentsButton.click();


    }

    @Then("user click on Add button")
    public void userClickOnAddButton() {
        click(addDepPage.addInfoButton);
    }

    @Then("the user enters {string} and {string} and {string} in data driven format")
    public void theUserEntersAndAndInDataDrivenFormat(String name, String relationship, String dob) {
        sendText(name, addDepPage.addNameTextBox);
        click(addDepPage.relationshipDropDownList);
        selectFromDropdown(addDepPage.relationshipDropDownList, relationship);
        if (relationship.equals("Other")) {
            sendText(relationship, addDepPage.dependentSpecifyTextBox);
        }
        sendText(dob, addDepPage.dependentDateOfBirth);
        click(addDepPage.dependentSaveBtn);
    }

    @When("user enters invalid information {string} and {string} and verifying the {string}")
    public void userEntersInvalidInformationAndAndVerifyingThe(String Name, String DateOfBirth, String errorMsgExpected) {
        sendText(Name, addDepPage.addNameTextBox);
        sendText(DateOfBirth, addDepPage.dependentDateOfBirth);
        click(addDepPage.dependentSaveBtn);

        //validation-error
        String errorMsgActual = addDepPage.errorMsg.getText();
        Assert.assertEquals(errorMsgExpected, errorMsgActual);
    }

    @Then("the HRMS application displays error messages")
    public void the_hrms_application_displays_error_messages() {
        System.out.println("Error message is displayed");

    }

    @When("user removes the second dependent from the list")
    public void user_removes_the_second_dependent_from_the_list() {

    }

    @Then("the HRMS application should no longer display the second dependent in the list of dependents")
    public void the_hrms_application_should_no_longer_display_the_second_dependent_in_the_list_of_dependents() throws InterruptedException {
        click(addDepPage.theSecondDependents);
        click(addDepPage.deleteBtn);
    }
}