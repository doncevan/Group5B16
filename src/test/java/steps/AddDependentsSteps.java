package steps;

import Pages.addDependentsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

import java.util.List;
import java.util.Map;

public class AddDependentsSteps extends CommonMethods {
    @Given("employee is navigated to HRMS application")
   public void employee_is_navigated_to_hrms_application() {
      openBrowserAndNavigateToURL();

    }
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
               click(dashboardPage.pimEmployeeBtn);

    }
    @Then("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        //  WebElement searchIdTextBox = driver.findElement(By.id("empsearch_id"));
        // searchIdTextBox.sendKeys("54469A");
        sendText("86628A",addDependentsPage.idTextField);
    }
    @Then("user clicks on search button")
    public void user_clicks_on_search_button() {

        click(addDependentsPage.searchButton);
    }

    @Then("user selects the employee file")
    public void user_selects_the_employee_file() {
        WebElement selectFile=driver.findElement(By.xpath("//table/tbody/tr/td/a"));
        selectFile.click();
    }

    @Then("user navigates to the dependents section")
    public void user_navigates_to_the_dependents_section() {

      WebElement dependentsButton=driver.findElement(By.xpath("//div/div/div/div/ul/li[4]/a"));
      dependentsButton.click();


    }
    @Then("user click on Add button")
    public void userClickOnAddButton() {

        addDependentsPage addDependentspage=new addDependentsPage();
        click(addDependentsPage.addInfoButton);
    }


    @Then("the user enters Name and Relationship and DateofBirth in data driven format")
    public void the_user_enters_name_and_relationship_and_dateof_birth_in_data_driven_format
            (io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        addDependentsPage addDependentspage=new addDependentsPage();
        List<Map<String, String>> dependentsData=dataTable.asMaps();
        for(Map<String,String> dependents:dependentsData){

            String nameValue=dependents.get("Name");
            String relationshipValue=dependents.get("Relationship");
            String dataOfBirthValue=dependents.get("DateofBirth");

            sendText(nameValue, addDependentsPage.addNameTextBox);
            click(addDependentsPage.relationshipList);
            WebElement otherSelect=driver.findElement(By.xpath("//select/option[3]"));
            otherSelect.click();
            // Thread.sleep(1000);
          //  click(addDependentsPage.dependentSpecifyTextBox);
            Thread.sleep(1000);
            sendText(relationshipValue, addDependentsPage.dependentSpecifyTextBox);
            Thread.sleep(1000);
            sendText(dataOfBirthValue, addDependentsPage.dependentDateOfBirth);
            click(addDependentsPage.dependentSaveBtn);
            click(addDependentsPage.addInfoButton);
           /// WebElement childSelect=driver.findElement(By.xpath("//select/option[2]"));
            //childSelect.click();

        }
    }
    @Then("the HRMS application displays error messages")
    public void the_hrms_application_displays_error_messages() {
        System.out.println("Error message is displayed");

    }

    @When("user enters invalid information {string} and {string} and {string} and verifying the {string}")
    public void userEntersInvalidInformationAndAndAndVerifyingThe(String Name, String Relationship, String DateofBirth, String errorMsgExpected)
            throws InterruptedException {
        addDependentsPage addDependentspage=new addDependentsPage();
        sendText(Name, addDependentsPage.addNameTextBox);
        Thread.sleep(1000);
        click(addDependentsPage.relationshipList);
        WebElement otherSelect=driver.findElement(By.xpath("//select/option[3]"));
        otherSelect.click();
        sendText(Relationship, addDependentsPage.dependentSpecifyTextBox);
        Thread.sleep(1000);
        sendText(DateofBirth, addDependentsPage.dependentDateOfBirth);

        click(addDependentsPage.dependentSaveBtn);
        Thread.sleep(2000);
        //validation-error

        Thread.sleep(2000);
        String errorMsgActual= addDependentsPage.errorMsg.getText();
        Thread.sleep(2000);
        Assert.assertEquals("value does not match",errorMsgActual,errorMsgExpected);


    }


    @When("user removes the second dependent from the list")
    public void user_removes_the_second_dependent_from_the_list() {

    }

    @Then("the HRMS application should no longer display the second dependent in the list of dependents")
    public void the_hrms_application_should_no_longer_display_the_second_dependent_in_the_list_of_dependents() throws InterruptedException {
       // addDependentsPage addDependentsPage1=new addDependentsPage();


        click(addDependentsPage.theSecondDependents);
        Thread.sleep(1000);
       click(addDependentsPage.checkBoxDependents);
        Thread.sleep(1000);
        click(addDependentsPage.deleteBtn);

    }



}


