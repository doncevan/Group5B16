package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends CommonMethods{

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimDashboardBtn;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement pimEmployeeBtn;

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
}
