package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeContactDetailPage extends CommonMethods {
    @FindBy(id="menu_pim_viewMyDetails")
    public WebElement myInfoBtn;
    @FindBy(xpath = "//a[text()='Contact Details']")
    public WebElement contactDetailBtn;
    @FindBy(id="btnSave")
    public WebElement editBtn;
    @FindBy(id="contact_street1")
    public WebElement streetOneTextBox;
    @FindBy(id="contact_street2")
    public WebElement streetTwoTextBox;
    @FindBy(id="contact_city")
    public WebElement cityTextBox;
    @FindBy(id="contact_province")
    public WebElement provinceTextBox;
    @FindBy(id="contact_emp_zipcode")
    public WebElement zipcodeTextBox;
    @FindBy(id="contact_country")
    public WebElement countryTextBox;
    @FindBy(id="contact_emp_hm_telephone")
    public WebElement homePhoneTextBox;
    @FindBy(id="contact_emp_mobile")
    public WebElement mobileTextBox;
    @FindBy(id="contact_emp_work_telephone")
    public WebElement workPhoneTextBox;
    @FindBy(id="contact_emp_work_email")
    public WebElement emailTextBox;
    @FindBy(id="contact_emp_oth_email")
    public WebElement otherEmailTextBox;
    @FindBy(id="btnSave")
    public WebElement saveBtn;
   public EmployeeContactDetailPage(){
       PageFactory.initElements(driver,this);
   }
}