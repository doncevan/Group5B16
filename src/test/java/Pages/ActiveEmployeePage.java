package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ActiveEmployeePage extends CommonMethods {
    @FindBy(xpath="//*[@id='txtUsername']")
    public WebElement usernameField;

    @FindBy(id="txtPassword")
    public WebElement passwordField;

    @FindBy(id="btnLogin")
    public WebElement loginButton;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement viewEmpList;
    @FindBy(xpath="//option[@value='17']")
    public WebElement activeDropDown;
    @FindBy(xpath="//input[@id='searchBtn']")
    public WebElement searchBtn;
    @FindBy(xpath="//tbody")
    public WebElement activeEmpList;

    @FindBy(xpath="//input[@id='ohrmList_chkSelectAll']")
    public WebElement selectBox;

    public ActiveEmployeePage() {
        PageFactory.initElements(driver, this);
    }
}
