package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeAddsLanguageProficiencyDetailsPage extends CommonMethods {
    @FindBy(id = "menu_pim_viewMyDetails")
    public WebElement myInfoTab;

    @FindBy(xpath = "//a[text()='Qualifications']")
    public WebElement qualificationOption;

    @FindBy(id = "addLanguage")
    public WebElement addButton;

    @FindBy(id = "language_code")
    public WebElement languageDropdown;

    @FindBy(id = "language_lang_type")
    public WebElement fluencyDropdown;

    @FindBy(id = "language_competency")
    public WebElement competencyDropdown;

    @FindBy(id = "language_comments")
    public WebElement textBox;

    @FindBy(id = "btnLanguageSave")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@class='chkbox']")
    public WebElement checkBox;

    @FindBy(id = "delLanguage")
    public WebElement deleteButton;

    public EmployeeAddsLanguageProficiencyDetailsPage() {
        PageFactory.initElements(driver, this);
    }
}