package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends CommonMethods{

    @FindBy(xpath="//*[@id='txtUsername']")
    public WebElement usernameField;

    @FindBy(id="txtPassword")
    public WebElement passwordField;

    @FindBy(id="btnLogin")
    public WebElement loginButton;

    @FindBy(id="spanMessage")
    public WebElement invalidCredentialsSpan;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
}
