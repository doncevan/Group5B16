package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

public class EmployeeAddsLanguageProficiencyDetailsSteps extends CommonMethods {

    @When("employee  enters valid employee username and password")
    public void employee_enters_valid_employee_username_and_password() {

        sendText(ConfigReader.getPropertyValue("essusername"), loginPage.usernameField);
        Log.info("Employee entered username ");
        sendText(ConfigReader.getPropertyValue("esspassword"), loginPage.passwordField);
        Log.info("Employee entered password");
    }

    @When("employee  clicks on login button")
    public void employee_clicks_on_login_button() {
        click(loginPage.loginButton);
    }

    @Then("employee  is successfully logged in the application")
    public void employee_is_successfully_logged_in_the_application() {
        System.out.println("Employee logged in");
    }

    @When("employee clicks on My Info tab1")
    public void employee_clicks_on_my_info_tab() {
        click(employeeAddsLanguageProficiencyDetailsPage.myInfoTab);
    }

    @And("employee clicks on Qualifications option")
    public void employee_clicks_on_qualifications_option() {
        click(employeeAddsLanguageProficiencyDetailsPage.qualificationOption);
    }

    @When("employee clicks on add button")
    public void employee_clicks_on_add_button() throws InterruptedException {
        click(employeeAddsLanguageProficiencyDetailsPage.addButton);
    }

    @And("employee selects language dropdown")
    public void employee_selects_language_dropdown() {
        Select languageSel = new Select(employeeAddsLanguageProficiencyDetailsPage.languageDropdown);
        languageSel.selectByVisibleText("English");
    }

    @And("employee selects fluency dropdown")
    public void employee_selects_fluency_dropdown() {
        Select fluencySel = new Select(employeeAddsLanguageProficiencyDetailsPage.fluencyDropdown);
        fluencySel.selectByVisibleText("Speaking");
    }

    @And("employee selects competency dropdown")
    public void employee_selects_competency_dropdown() {
        Select competencySel = new Select(employeeAddsLanguageProficiencyDetailsPage.competencyDropdown);
        competencySel.selectByVisibleText("Good");
    }


    @And("employee adds text in comment text box")
    public void employee_adds_text_in_comment_text_box() {
        sendText("Arabic is my second language", employeeAddsLanguageProficiencyDetailsPage.textBox);
    }

    @Then("system should validate that mandatory fields are filled in")
    public void system_should_validate_that_mandatory_fields_are_filled_in() {
        System.out.println("All mandatory fields are filled in");
    }

    @Then("employee clicks on save button")
    public void employee_clicks_on_save_button() throws InterruptedException {
        click(employeeAddsLanguageProficiencyDetailsPage.saveButton);
    }

    @And("the system stores the language proficiency details in the employee profile")
    public void the_system_stores_the_language_proficiency_details_in_the_employee_profile() {
        System.out.println("You have successfully stored your language proficiency details");
    }

    @When("employee checks a check box")
    public void employee_checks_a_check_box() {
        click(employeeAddsLanguageProficiencyDetailsPage.checkBox);
    }

    @When("employee clicks on delete button")
    public void employee_clicks_on_delete_button() {
        click(employeeAddsLanguageProficiencyDetailsPage.deleteButton);
    }

    @Then("employee successfully deletes his language details")
    public void employee_successfully_deletes_his_language_details() {
        System.out.println("Successfully deleted");
    }
}