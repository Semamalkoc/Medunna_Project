package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaHomePage {

    public MedunnaHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement userIcon;

    @FindBy(id = "login-item")
    public WebElement signInOption;

    @FindBy(id = "entity-menu")
    public WebElement itemsdAndTitles;

    @FindBy(linkText = "Room")
    public WebElement roomOption;

    @FindBy(id = "account-menu")
    public WebElement profil;

    @FindBy(xpath = "//*[text()='DEPARTMENTS']")
    public WebElement departments;

    @FindBy(id = "jh-create-entity")
    public WebElement createAppoint;



    @FindBy(xpath = "//*[@class='appointment-btn scrollto']")
    public WebElement randevuAl;


    @FindBy(xpath = "(//*[@class='dropdown-item'])[11]")
    public WebElement settings;

    @FindBy(xpath = "//*[text()='CONTACT']")
    public WebElement contact;
    @FindBy(xpath = "//*[text()='Appointment']")
    public WebElement appoint;

    @FindBy(xpath = "//*[text()='Patient']")
    public WebElement patient;
}
