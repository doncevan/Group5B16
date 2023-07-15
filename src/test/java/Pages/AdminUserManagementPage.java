package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AdminUserManagementPage extends CommonMethods {

    @FindBy(id="searchSystemUser_userName")
    public WebElement searchUserNameField;

    @FindBy(id="searchBtn")
    public WebElement searchButton;

    @FindBy(xpath = "//table[@id='resultTable']//tr[1]/td[2]/a")
    public WebElement firstUserNameUserTable;

    @FindBy(xpath = "//table[@id='resultTable']//tr[1]/td[1]/input")
    public WebElement firstCheckBoxUserTable;

    @FindBy(id="btnDelete")
    public WebElement deleteButton;

    @FindBy(id="dialogDeleteBtn")
    public WebElement deleteRecordsOkButton;

    @FindBy(xpath = "//table[@id='resultTable']//tr[1]/td[1]")
    public WebElement NoRecordsFoundUserTable;

    public final String expectedNoRecordsFound = "No Records Found";

    public AdminUserManagementPage(){
        PageFactory.initElements(driver, this);
    }
}
