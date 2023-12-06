package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaAppointmentPage {
    public MedunnaAppointmentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

/*
    @FindBy(id = "firstName")
    public WebElement nameBox;

    @FindBy(id = "lastName")
    public WebElement lastNameBox;

    @FindBy(id = "ssn")
    public WebElement ssnBox;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "phone")
    public WebElement phoneBox;

    @FindBy(id = "appoDate")
    public WebElement dateBox;

    @FindBy(xpath= "//span[text()='Send an Appointment Request']")
    public WebElement Ok;

    @FindBy(xpath= "//*[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement positiveVerify;

    @FindBy(xpath= "//*[text()='Your FirstName is required.']")
    public WebElement nameAlert;

    @FindBy(xpath= "//*[text()='Your LastName is required.']")
    public WebElement lastNameAlert;

    @FindBy(xpath= "//*[text()='Your SSN is required.']")
    public WebElement ssnAlert;

    @FindBy(xpath= "//*[text()='Your email is required.']")
    public WebElement emailAlert;

    @FindBy(xpath= "//*[text()='Phone number is required.']")
    public WebElement phoneAlert;

    @FindBy(xpath= "//*[text()='Appointment date can not be past date!']")
    public WebElement dateAlert;

    @FindBy(xpath= "//*[text()='This field is invalid']")
    public WebElement negEmailAlert;

    @FindBy(xpath= "//*[text()='Your SSN is invalid']")
    public WebElement negSSNverify;
    @FindBy(id = "jh-create-entity")
    public WebElement createAppoint;
*/
    @FindBy(id = "jh-create-entity")
    public WebElement createAppoint;
    @FindBy(id = "appointment-startDate")
    public WebElement startDate;
    @FindBy(id = "appointment-endDate")
    public WebElement endDate;

    @FindBy(id = "appointment-status")
    public WebElement status;
    @FindBy(id = "appointment-physician")
    public WebElement physicians;
    @FindBy(id = "appointment-patient")
    public WebElement patient;
    @FindBy(xpath= "//*[text()='Save']")
    public WebElement save;

    @FindBy(xpath= "//*[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement positiveVerify;








}
