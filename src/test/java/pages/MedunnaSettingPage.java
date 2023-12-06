package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaSettingPage {
    public MedunnaSettingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id= "firstName")
    public WebElement nameBox;

    @FindBy(id= "lastName")
    public WebElement lastnameBox;

    @FindBy(id= "email")
    public WebElement emailBox;

    @FindBy(xpath= "//span[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath= "//*[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement positiveVerify;

    @FindBy(xpath= "//*[text()='Your first name is required.']")
    public WebElement nameAlert;
    @FindBy(xpath= "//*[text()='Your last name is required.']")
    public WebElement lastNameAlert;

    @FindBy(xpath= "//*[text()='Your email is required.']")
    public WebElement emailAlert;
    @FindBy(xpath= "//*[text()='This field is invalid']")
    public WebElement negAlert;
}
