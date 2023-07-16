package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AdminQualificationMembershipPage extends CommonMethods {

    @FindBy(xpath="//form[@id='frmList_ohrmListComponent']//input[@id='btnAdd']")
    public WebElement addMembershipBtn;
    @FindBy(xpath="//form//input[@id='membership_name']")
    public WebElement addMembershipNameField;
    @FindBy(xpath="//form//input[@id='btnSave']")
    public WebElement addMembershipSaveBtn;

    @FindBy(xpath="//form[@id='frmList_ohrmListComponent']//table[@id='resultTable']//tr/td[2]/a")
    public List<WebElement> membershipTableNames;

    public AdminQualificationMembershipPage(){
        PageFactory.initElements(driver, this);
    }
}
