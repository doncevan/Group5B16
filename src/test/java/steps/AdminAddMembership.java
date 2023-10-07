package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

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
    public void adminUserCanAddAny(String membershipName) throws InterruptedException {
        //admin adds membership name and saves
        CommonMethods.sendText(membershipName, adminMemPage.addMembershipNameField);
        CommonMethods.click(adminMemPage.addMembershipSaveBtn);
        Thread.sleep(2000);

        //validate that membership name is in web table and delete memberships
        String actualMembershipName = CommonMethods.validateStringInsideWebTableOrColumn(membershipName, adminMemPage.membershipTableNames);
        System.out.print(actualMembershipName);
        Thread.sleep(2000);
        WebElement checkBox = CommonMethods.returnCheckBoxByStringVSWebTableRowOrColumn(actualMembershipName, adminMemPage.membershipTableNames, adminMemPage.membershipTableCheckBoxs);
        if (checkBox != null) {
            waitForClickability(checkBox);
            checkBox.click();
            adminMemPage.deleteMembershipBtn.submit();
        }
        //       Log.info(actualMembershipName);
        Assert.assertEquals(membershipName, actualMembershipName);
    }
}