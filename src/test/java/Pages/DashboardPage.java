package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {

    public final String expectedPageTitle = "Human Management System";

    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement pimDashboardBtn;

    @FindBy(id = "menu_pim_viewEmployeeList")
    public WebElement empListOption;

    public WebElement pimEmployeeBtn;
    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement AdminMenuBtn;
    @FindBy(id = "menu_admin_Qualifications")
    public WebElement adminQualificationBtn;

    @FindBy(id = "menu_admin_membership")
    public WebElement adminQualificationMembershipBtn;
    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement adminDashboardBtn;


    //fekadu
    @FindBy(id = "btnAdd")
    public WebElement addBtn;
    @FindBy(id = "language_name")
    public WebElement nameBtn;
    @FindBy(id = "btnSave")
    public WebElement saveBtn;
    @FindBy(id = "menu_admin_viewLanguages")
    public WebElement languagesBtn;

    //fekadu
    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
}