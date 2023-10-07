package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

import static utils.Constants.PROFILE_PICTURE_PATH;


public class uploadProfilePicture extends CommonMethods {

    @And("ess selects a profile picture from their computer")
    public void essSelectsAProfilePictureFromTheirComputer() {
        sendText(PROFILE_PICTURE_PATH, picturePage.uploadPhoto);
    }

    @And("ess clicks on the Upload button")
    public void essClicksOnTheUploadButton() {
        click(picturePage.btnSave);
    }

    @Then("ess's profile picture is updated")
    public void essSProfilePictureIsUpdated() {
        System.out.println("profile picture has been successfully changed");
    }

    @Given("ess is on the My Info page")
    public void essIsOnTheMyInfoPage() {
        click(picturePage.myInfo);
    }

    @When("ess clicks on the Change Photo button")
    public void essClicksOnTheChangePhotoButton() {
        click(picturePage.empPhoto);
    }

    @Given("ess is navigated to HRMS application")
    public void essIsNavigatedToHRMSApplication() {
        String essUserName = ConfigReader.getPropertyValue("essusername");
        String essPassWord = ConfigReader.getPropertyValue("esspassword");
        sendText(essUserName, loginPage.usernameField);
        sendText(essPassWord, loginPage.passwordField);
        click(loginPage.loginButton);
    }
}