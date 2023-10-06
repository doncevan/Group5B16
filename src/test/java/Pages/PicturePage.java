package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class PicturePage extends CommonMethods {
    /*@FindBy(xpath = "//*[@id='txtUsername']")
    public WebElement usernameField;
    @FindBy(id = "txtPassword")
    public WebElement passwordField;
    @FindBy(id = "btnLogin")
    public WebElement loginButton;*/
    @FindBy(id = "menu_pim_viewMyDetails")
    public WebElement myInfo;
    @FindBy(xpath = "//img[@alt='Employee Photo']")
    public WebElement empPhoto;
    @FindBy(id = "photofile")
    public WebElement uploadPhoto;
    @FindBy(xpath = "//input[@id='btnSave']")
    public WebElement btnSave;
    @FindBy(id = "welcome")
    public WebElement welcome;

    public PicturePage() {
        PageFactory.initElements(driver, this);
    }


}