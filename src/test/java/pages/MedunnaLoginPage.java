package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaLoginPage {

    public MedunnaLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "rememberMe")
    public WebElement rememberMeCheckbox;

    @FindBy(xpath = " //button[@type='submit']")
    public WebElement signInSubmitButton;

    @FindBy(xpath = " //*[text()='Username cannot be empty!']")
    public WebElement usernameBosBirakilamaz;

    @FindBy(xpath = " //*[text()='Password cannot be empty!']")
    public WebElement passwordBosBirakilamaz;

    @FindBy(xpath = "(//div[@role='alert'])[1]")
    public WebElement helpBox1;

    @FindBy(xpath = "(//div[@role='alert'])[2]")
    public WebElement helpBox2;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancel;

    @FindBy(xpath = "//div[@class='alert alert-danger fade show']")
    public WebElement alertLogin;







}

