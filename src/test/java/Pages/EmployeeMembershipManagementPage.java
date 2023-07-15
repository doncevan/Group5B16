package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class EmployeeMembershipManagementPage extends CommonMethods {
    @FindBy(id = "menu_pim_viewMyDetails")
    public WebElement myInfoTab;

    @FindBy(xpath = "//a[normalize-space()='Memberships']")
    public WebElement membershipsOption;

    @FindBy(id = "btnAddMembershipDetail")
    public WebElement addButton;

    @FindBy(id = "membership_membership")
    public WebElement membershipDropdown;

    @FindBy(id = "membership_subscriptionPaidBy")
    public WebElement subscriptionPaidByDropdown;

    @FindBy(id = "membership_subscriptionAmount")
    public WebElement subscriptionAmountField;

    @FindBy(id = "membership_currency")
    public WebElement currencyDropdown;

    @FindBy(id = "membership_subscriptionCommenceDate")
    public WebElement commenceDateField;

    @FindBy(id = "membership_subscriptionRenewalDate")
    public WebElement renewalDateField;

    @FindBy(id = "btnSaveMembership")
    public WebElement saveButton;

    @FindBy(xpath = "//a[normalize-space()='Amazon']")
    public WebElement pickAccount;

    @FindBy(xpath = "//*[@id='frmEmpDelMemberships']/table/tbody/tr[2]/td[1]/input")
    public WebElement checkBox;

    @FindBy(id = "delMemsBtn")
    public WebElement deleteButton;

    public EmployeeMembershipManagementPage() {
        PageFactory.initElements(driver, this);
    }
}


