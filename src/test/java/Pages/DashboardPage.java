package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {

    public final String expectedPageTitle = "Human Management System";

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimDashboardBtn;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement pimEmployeeBtn;

    @FindBy(id="menu_admin_viewAdminModule")
    public WebElement adminDashboardBtn;

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
}
