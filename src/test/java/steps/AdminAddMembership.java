package steps;

import Pages.AdminQualificationMembershipPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;
import utils.Log;

public class AdminAddMembership extends CommonMethods {

    @When("admin navigates to Qualifications Page")
    public void adminNavigatesToQualificationsPage() {
        //navigating to qualification membership page
        Actions action = new Actions(driver);
        action.moveToElement(dashboardPage.adminDashboardBtn).perform();
        action.moveToElement(dashboardPage.adminQualificationBtn).perform();
        action.moveToElement(dashboardPage.adminQualificationMembershipBtn).perform();
        action.click(dashboardPage.adminQualificationMembershipBtn).perform();
    }

    @And("selects memberships")
    public void selectsMemberships() {
        //Validate we are on membership page
        CommonMethods.waitForClickability(adminMemPage.addMembershipBtn);
        CommonMethods.click(adminMemPage.addMembershipBtn);
        String addBtnText = adminMemPage.addMembershipBtn.getCssValue("value");
        System.out.print(addBtnText);
    //    Assert.assertEquals("Add", addBtnText);
    }

    @Then("admin user can add any {string}")
    public void adminUserCanAddAny(String membershipName) {
        //admin adds membership name and saves
        CommonMethods.sendText(membershipName, adminMemPage.addMembershipNameField);
        CommonMethods.click(adminMemPage.addMembershipSaveBtn);

        //validate that membership name is in web table
        String actualMembershipName = CommonMethods.validateStringInsideWebTableOrColumn(membershipName, adminMemPage.membershipTableNames);
 //       Log.info(actualMembershipName);
        Assert.assertEquals(membershipName, actualMembershipName);
    }

}
