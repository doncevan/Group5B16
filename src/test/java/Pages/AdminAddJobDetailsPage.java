package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AdminAddJobDetailsPage extends CommonMethods {

    @FindBy(id="empsearch_id")
    public WebElement idTextField;

    @FindBy(xpath = "//form//table[@id='resultTable']/tbody/tr/td[2]/a")
    public WebElement idMemberEmp;
    @FindBy(xpath ="//*[@id='sidenav']/li[6]/a" )
    public WebElement jobFieldBtn;
    @FindBy(id="btnSave")
    public WebElement editSaveJobBtn;
    @FindBy(xpath="//select[@id='job_job_title']")
    public WebElement jobTitleDrpDwn;
    @FindBy(xpath = "//select[@id='job_emp_status']")
    public WebElement empStatusDrpDwn;
    @FindBy(xpath = "//select[@id='job_eeo_category']")
    public WebElement jobCategoryDwn;
    @FindBy(xpath = "//select[@id='job_sub_unit']")
    public WebElement jobSubUnitDwn;
    @FindBy(xpath = "//select[@id='job_location']")
    public WebElement jobLocationDwn;
    @FindBy(id="btnSave")
    public WebElement adminEmpSaveBtn;
    @FindBy(xpath="//input[@id='job_joined_date']")
    public WebElement joinedDateField;
    @FindBy(xpath="//*[@id='ui-datepicker-div']")
    public WebElement joinDayDwn;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']/div/div/select[1]")
    public WebElement joinMonthDwn;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']/div/div/select[2]")
    public WebElement joinYearDwn;
    @FindBy(xpath="//form[@id='frmEmpJobDetails']//input[@name='job[contract_file]']")
    public WebElement jobContractBtn;
    @FindBy(xpath="//input[@id='job_contract_start_date']")
    public WebElement jobStartDate;

    @FindBy(xpath="//input[@id='job_contract_end_date']")
    public  WebElement jobEndDate;



    public AdminAddJobDetailsPage() {
        PageFactory.initElements(driver, this);
    }
}
