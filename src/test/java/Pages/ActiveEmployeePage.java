package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ActiveEmployeePage extends CommonMethods {
    @FindBy(xpath = "//*[@id='txtUsername']")
    public WebElement usernameField;
    @FindBy(id = "txtPassword")
    public WebElement passwordField;
    @FindBy(id = "btnLogin")
    public WebElement loginButton;
    @FindBy(id = "menu_pim_viewEmployeeList")
    public WebElement viewEmpList;
    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement viewPIM;
    @FindBy(xpath = "//select[@id='empsearch_employee_status']")
    public WebElement empStatusDropDown;
    @FindBy(xpath = "//option[@value='17']")
    public WebElement selectActiveEmp;
    @FindBy(xpath = "//input[@id='searchBtn']")
    public WebElement searchBtn;
    @FindBy(xpath = "//tbody")
    public WebElement activeEmpList;

    public ActiveEmployeePage() {
        PageFactory.initElements(driver, this);
    }
}
