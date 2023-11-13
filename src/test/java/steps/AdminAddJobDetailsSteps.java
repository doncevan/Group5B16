package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.io.IOException;
import java.time.Duration;

import static utils.Constants.CONTRACT_DETAILS_PATH;

public class AdminAddJobDetailsSteps extends CommonMethods {
    @When("admin clicks on PIM and employee list option")
    public void adminClicksOnPIMAndEmployeeListOption() {
        click(dashboardPage.pimDashboardBtn);
        click(dashboardPage.empListOption);
    }

    @And("admin enter valid employee id")
    public void adminEnterValidEmployeeId() {
        sendText("88096A", adminAddJobDetailsPage.idTextField);
    }

    @And("admin clicks on search button")
    public void adminClicksOnSearchButton() {
        click(adminUMPage.searchButton);
    }

    @And("admin clicks on employee's profile")
    public void adminClicksOnEmployeeSProfile() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(adminAddJobDetailsPage.idMemberEmp));
        click(adminAddJobDetailsPage.idMemberEmp);
    }

    @Then("admin is able to see employee information")
    public void adminIsAbleToSeeEmployeeInformation() {
        System.out.println("Admin is able to see employee information");
    }

    @When("admin clicks on Job")
    public void adminClicksOnJob() {
        waitForClickability(adminAddJobDetailsPage.jobFieldBtn);
        click(adminAddJobDetailsPage.jobFieldBtn);
    }

    @And("admin clicks on edit button")
    public void adminClicksOnEditButton() {
        click(adminAddJobDetailsPage.editSaveJobBtn);
    }

    @Then("admin is able to edit Job information")
    public void adminIsAbleToEditJobInformation() throws IOException {
        System.out.println("Admin user is able to edit the employee information");
    }

    @When("admin clicks on Job Title dropdown")
    public void adminClicksOnJobTitleDropdown() throws IOException {
        waitForClickability(adminAddJobDetailsPage.jobTitleDrpDwn);
        click(adminAddJobDetailsPage.jobTitleDrpDwn);
    }

    @And("admin can select job title of the employee")
    public void adminCanSelectJobTitleOfTheEmployee() throws IOException {
        waitForClickability(adminAddJobDetailsPage.jobTitleDrpDwn);
        selectFromDropdown(adminAddJobDetailsPage.jobTitleDrpDwn, "Sleeping");
    }

    @Then("admin is able to save the changes")
    public void adminIsAbleToSaveTheChanges() {
        System.out.println("Admin is able to save the changes if completed");
    }

    @When("admin clicks on Employment status dropdown")
    public void adminClicksOnEmploymentStatusDropdown() throws IOException {
        click(adminAddJobDetailsPage.empStatusDrpDwn);
    }

    @And("admin can select employment status of the employee")
    public void adminCanSelectEmploymentStatusOfTheEmployee() throws IOException {
        selectFromDropdown(adminAddJobDetailsPage.empStatusDrpDwn, "Crazy");
    }

    @When("admin clicks on Job Category dropdown")
    public void adminClicksOnJobCategoryDropdown() throws IOException {
        click(adminAddJobDetailsPage.jobCategoryDwn);
    }

    @And("admin can select job category of the employee")
    public void adminCanSelectJobCategoryOfTheEmployee() throws IOException {
        selectFromDropdown(adminAddJobDetailsPage.jobCategoryDwn, "sales");
    }

    @When("admin clicks on Joined Date calendar")
    public void adminClicksOnJoinedDateCalendar() throws IOException {
        sendText("2023-06-22", adminAddJobDetailsPage.joinedDateField);
    }

    @And("admin can select the date when the employee joined the organization")
    public void adminCanSelectTheDateWhenTheEmployeeJoinedTheOrganization() throws IOException {
        //       selectFromDropdown(adminAddJobDetaisPage.joinDayDwn, 5);
    }

    @And("admin can select the month when employee joined the organization")
    public void adminCanSelectTheMonthWhenEmployeeJoinedTheOrganization() throws IOException {
        //              selectFromDropdown(adminAddJobDetaisPage.joinMonthDwn, "Jul");
    }

    @And("admin can select the year when employee joined the organization")
    public void adminCanSelectTheYearWhenEmployeeJoinedTheOrganization() throws IOException {
        //       selectFromDropdown(adminAddJobDetaisPage.joinYearDwn, 2023);
    }

    @When("admin clicks on Sub Unit dropdown")
    public void adminClicksOnSubUnitDropdown() throws IOException {
        click(adminAddJobDetailsPage.jobSubUnitDwn);
    }

    @And("admin can select the sub unit where the employee is currently working")
    public void adminCanSelectTheSubUnitWhereTheEmployeeIsCurrentlyWorking() throws IOException {
        selectFromDropdown(adminAddJobDetailsPage.jobSubUnitDwn, 3);
    }

    @When("admin clicks on Location dropdown")
    public void adminClicksOnLocationDropdown() throws IOException {
        click(adminAddJobDetailsPage.jobLocationDwn);
    }

    @And("admin can select the location where employee is currently working")
    public void adminCanSelectTheLocationWhereEmployeeIsCurrentlyWorking() throws IOException {
        selectFromDropdown(adminAddJobDetailsPage.jobLocationDwn, "Chicago");
    }

    @When("admin clicks on Start date calender")
    public void adminClicksOnStartDateCalender() throws IOException {
        click(adminAddJobDetailsPage.jobStartDate);
    }

    @And("admin can select the starting date of employee's current job")
    public void adminCanSelectTheStartingDateOfEmployeeSCurrentJob() throws IOException {
        sendText("2023-02-22", adminAddJobDetailsPage.jobStartDate);
    }

    @When("admin clicks on End date calender")
    public void adminClicksOnEndDateCalender() throws IOException {
        click(adminAddJobDetailsPage.jobEndDate);
    }

    @And("admin can select the end date of employee's current job")
    public void adminCanSelectTheEndDateOfEmployeeSCurrentJob() throws IOException {
        sendText("2023-12-22", adminAddJobDetailsPage.jobEndDate);
    }

    @When("admin clicks on Choose file button and uploads information")
    public void adminClicksOnChooseFileButton() throws IOException, InterruptedException {
        adminAddJobDetailsPage.jobContractBtn.sendKeys(CONTRACT_DETAILS_PATH);
    }

    @And("admin clicks on Save button")
    public void adminClicksOnSaveButton() throws IOException {
        click(adminAddJobDetailsPage.adminEmpSaveBtn);
    }
}