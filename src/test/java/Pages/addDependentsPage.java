package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class addDependentsPage extends CommonMethods {

    @FindBy(xpath = "//form[@id='search_form']//input[@id='empsearch_id']")
    public WebElement idTextField;

    @FindBy(id = "//form[@id='search_form']//input[@id='empsearch_employee_name_empName']")
    public WebElement nameTextFiled;

    @FindBy(xpath = "//form[@id='search_form']//input[@id='empsearch_id']")
    public WebElement searchButton;


    @FindBy(id = "addPaneDependent")
    public WebElement dependentsBtn;

    @FindBy(id = "btnAddDependent")
    public WebElement addInfoButton;

    @FindBy(xpath = "//form[@id='frmEmpDependent']//input[@id='dependent_name']")
    public WebElement addNameTextBox;

    @FindBy(xpath = "//form[@id='frmEmpDependent']//select[@id='dependent_relationshipType']")
    public WebElement relationshipDropDownList;

    //dependent_relationship
    @FindBy(xpath = "//form[@id='frmEmpDependent']//input[@id='dependent_relationship']")
    public WebElement dependentSpecifyTextBox;


    //dependent_dateOfBirth
    @FindBy(xpath = "//form[@id='frmEmpDependent']//input[@id='dependent_dateOfBirth']")
    public WebElement dependentDateOfBirth;

    @FindBy(xpath = "//form[@id='frmEmpDependent']//input[@id='btnSaveDependent']")
    public WebElement dependentSaveBtn;

    @FindBy(xpath = "//form[@id='frmEmpDelDependents']//input[@id='delDependentBtn']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//form[@id='frmEmpDelDependents']//table[@id='dependent_list']//tr[2]/td[1]/input")
    public WebElement checkBoxDependents;

    @FindBy(xpath = "//form[@id='frmEmpDelDependents']//table[@id='dependent_list']//tr[2]/td[1]/input")
    public WebElement theSecondDependents;

    @FindBy(xpath = "//form[@id='frmEmpDependent']//span")
    public WebElement errorMsg;

    public addDependentsPage() {
        PageFactory.initElements(driver, this);

    }

}