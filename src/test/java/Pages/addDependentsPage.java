package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class addDependentsPage extends CommonMethods {

    @FindBy(id = "empsearch_id")
    public WebElement idTextField;

    @FindBy(id = "empsearch_employee_name_empName")
    public WebElement nameTextFiled;

    @FindBy(id = "searchBtn")
    public WebElement searchButton;


    @FindBy(id="addPaneDependent")
    public  WebElement dependentsBtn;

    @FindBy (id="btnAddDependent")
    public WebElement addInfoButton;

    @FindBy(id="dependent_name")
    public WebElement addNameTextBox;

    @FindBy(id="dependent_relationshipType")
    public WebElement relationshipList;

    //dependent_relationship
    @FindBy(id="dependent_relationship")
    public  WebElement dependentSpecifyTextBox;


    //dependent_dateOfBirth
    @FindBy(id="dependent_dateOfBirth")
    public  WebElement dependentDateOfBirth;

    @FindBy(id="btnSaveDependent")
    public WebElement dependentSaveBtn;

    @FindBy(id="delDependentBtn")
    public WebElement deleteBtn;
    @FindBy(xpath = "//table/tbody/tr[2]/td/input[@class=\"checkbox\"]")
    public WebElement checkBoxDependents;

    @FindBy(xpath = "//table//tbody//tr[2]")
    public WebElement theSecondDependents;

    @FindBy(xpath = "//fieldset/ol/li[5][@class=\"required\"]")
    public WebElement errorMsg;

    public addDependentsPage() {
        PageFactory.initElements(driver, this);

    }

}
