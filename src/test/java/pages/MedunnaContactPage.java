package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaContactPage {

    public MedunnaContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "name")
    public WebElement nameBox;

    @FindBy(id = "email")
    public WebElement emailBox;


    @FindBy(id = "subject")
    public WebElement subBox;

    @FindBy(id = "message")
    public WebElement messBox;
    @FindBy(id = "register-submit")
    public WebElement send;

    @FindBy(xpath= "//*[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement positiveVerify;

    @FindBy(xpath= "//*[text()='Name is required.']")
    public WebElement nameAlert;

    @FindBy(xpath= "//*[text()='Your email is required.']")
    public WebElement emailAlert;

    @FindBy(xpath= "//*[text()='This field is required.']")
    public WebElement subAlert;

}



