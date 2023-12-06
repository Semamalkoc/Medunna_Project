package utilities;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReusableMethods {
    //HARD WAIT METHOD
    public static void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    //settings e git
    public static void Settings(){

        MedunnaSettingPage medunnaSettingPage=new MedunnaSettingPage();
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        ReusableMethods.Login();
        medunnaHomePage.profil.click();
        medunnaHomePage.settings.click();


    }
    //Mesaj gönder

    public static void sendMessage(String name, String eMail,
             String subject, String message){

        MedunnaContactPage medunnaContactPage=new MedunnaContactPage();
        medunnaContactPage.nameBox.sendKeys(ConfigReader.getProperty("name"));
        medunnaContactPage.emailBox.sendKeys(ConfigReader.getProperty("eMail"));
        medunnaContactPage.subBox.sendKeys(ConfigReader.getProperty("subject"));
        medunnaContactPage.messBox.sendKeys(ConfigReader.getProperty("message"));
        medunnaContactPage.send.click();
    }
    //Eksik email mesaj
    public static void negEmail(String name, String eMail,
                                String subject, String message){

        MedunnaContactPage medunnaContactPage=new MedunnaContactPage();
        medunnaContactPage.nameBox.sendKeys(ConfigReader.getProperty("name"));
        medunnaContactPage.emailBox.sendKeys(ConfigReader.getProperty("negEmail"));
        medunnaContactPage.subBox.sendKeys(ConfigReader.getProperty("subject"));
        medunnaContactPage.messBox.sendKeys(ConfigReader.getProperty("message"));
        medunnaContactPage.send.click();
    }
    //Eksik email mesaj
    public static void EmptyName(String name, String eMail,
                                String subject, String message){

        MedunnaContactPage medunnaContactPage=new MedunnaContactPage();
       // medunnaContactPage.nameBox.sendKeys(ConfigReader.getProperty("name"));
        medunnaContactPage.emailBox.sendKeys(ConfigReader.getProperty("negEmail"));
        medunnaContactPage.subBox.sendKeys(ConfigReader.getProperty("subject"));
        medunnaContactPage.messBox.sendKeys(ConfigReader.getProperty("message"));
        medunnaContactPage.send.click();
    }


    //Eksik email mesaj
    public static void EmptySubject(String name, String eMail,
                                 String subject, String message){

        MedunnaContactPage medunnaContactPage=new MedunnaContactPage();
        medunnaContactPage.nameBox.sendKeys(ConfigReader.getProperty("name"));
        medunnaContactPage.emailBox.sendKeys(ConfigReader.getProperty("negEmail"));
        //medunnaContactPage.subBox.sendKeys(ConfigReader.getProperty("subject"));
        medunnaContactPage.messBox.sendKeys(ConfigReader.getProperty("message"));
        medunnaContactPage.send.click();
    }


    //Eksik email mesaj
    public static void EmptyEmail(String name, String eMail,
                                 String subject, String message){

        MedunnaContactPage medunnaContactPage=new MedunnaContactPage();
        medunnaContactPage.nameBox.sendKeys(ConfigReader.getProperty("name"));
        //medunnaContactPage.emailBox.sendKeys(ConfigReader.getProperty("negEmail"));
        medunnaContactPage.subBox.sendKeys(ConfigReader.getProperty("subject"));
        medunnaContactPage.messBox.sendKeys(ConfigReader.getProperty("message"));
        medunnaContactPage.send.click();
    }

    //Login  Olmak
    public static void Login(String usernamename, String password){
        MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        medunnaHomePage.userIcon.click();
        medunnaHomePage.signInOption.click();
        medunnaLoginPage.usernameInput.sendKeys(ConfigReader.getProperty("medunna_username"));
        medunnaLoginPage.passwordInput.sendKeys(ConfigReader.getProperty("medunna_password"));
        medunnaLoginPage.signInSubmitButton.click();
    }
    //Login  Ol remember me
    public static void rememberLogin(String usernamename, String password){
        MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        medunnaHomePage.userIcon.click();
        medunnaHomePage.signInOption.click();
        medunnaLoginPage.usernameInput.sendKeys(ConfigReader.getProperty("medunna_username"));
        medunnaLoginPage.passwordInput.sendKeys(ConfigReader.getProperty("medunna_password"));
        medunnaLoginPage.rememberMeCheckbox.click();
        medunnaLoginPage.signInSubmitButton.click();
    }


    //Login  Olamama
    public static void failLogin(String usernamename, String password){
        MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        medunnaHomePage.userIcon.click();
        medunnaHomePage.signInOption.click();
        medunnaLoginPage.usernameInput.sendKeys(ConfigReader.getProperty("name1"));
        medunnaLoginPage.passwordInput.sendKeys(ConfigReader.getProperty("medunna_password"));
        medunnaLoginPage.signInSubmitButton.click();
    }
    //Login  Olamama
    public static void failLogin2(String usernamename, String password){
        MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        medunnaHomePage.userIcon.click();
        medunnaHomePage.signInOption.click();
        medunnaLoginPage.usernameInput.sendKeys(ConfigReader.getProperty("medunna_username"));
        medunnaLoginPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));
        medunnaLoginPage.signInSubmitButton.click();
    }
    //Contact ekranı
    public static void Contact(){
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaContactPage medunnaContactPage=new MedunnaContactPage();

        //Anasayfaya git "Contact ikonuna tıkla
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        medunnaHomePage.contact.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 600);
        actions.perform();

    }
    //Admin randevu olusturma
    public static void AdminRandevuOlusturma(){
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaAppointmentPage medunnaAppointmentPage = new MedunnaAppointmentPage();

        medunnaHomePage.itemsdAndTitles.click();
        medunnaHomePage.appoint.click();
        medunnaAppointmentPage.createAppoint.click();

        medunnaAppointmentPage.startDate.sendKeys("15.12.2023 00.00");
        medunnaAppointmentPage.endDate.sendKeys("30.12.2023 00.00");

        WebElement status = medunnaAppointmentPage.status;
        Select select = new Select(status);
        select.selectByIndex(1);

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 650);
        actions.perform();

        WebElement physicians = medunnaAppointmentPage.physicians;
        Select select2 = new Select(physicians);
        select2.selectByIndex(0);

        WebElement patient = medunnaAppointmentPage.patient;
        Select select3 = new Select(patient);
        select3.selectByValue("5978");
        medunnaAppointmentPage.save.click();


    }
    //Admin randevu olusturma
    public static void PastDateAppointment(){
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaAppointmentPage medunnaAppointmentPage = new MedunnaAppointmentPage();

        medunnaHomePage.itemsdAndTitles.click();
        medunnaHomePage.appoint.click();
        medunnaAppointmentPage.createAppoint.click();

        medunnaAppointmentPage.startDate.sendKeys("03.12.2023 00.00");
        medunnaAppointmentPage.endDate.sendKeys("30.12.2023 00.00");

        WebElement status = medunnaAppointmentPage.status;
        Select select = new Select(status);
        select.selectByIndex(1);

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 650);
        actions.perform();

        WebElement physicians = medunnaAppointmentPage.physicians;
        Select select2 = new Select(physicians);
        select2.selectByValue("5223");

        WebElement patient = medunnaAppointmentPage.patient;
        Select select3 = new Select(patient);
        select3.selectByValue("5978");
        medunnaAppointmentPage.save.click();


    }
    //Admin randevu olusturma
    public static void emptyStartDate(){
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaAppointmentPage medunnaAppointmentPage = new MedunnaAppointmentPage();

        medunnaHomePage.itemsdAndTitles.click();
        medunnaHomePage.appoint.click();
        medunnaAppointmentPage.createAppoint.click();

        medunnaAppointmentPage.startDate.clear();
        medunnaAppointmentPage.endDate.sendKeys("30.12.2023 00.00");

        WebElement status = medunnaAppointmentPage.status;
        Select select = new Select(status);
        select.selectByIndex(1);

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 650);
        actions.perform();

        WebElement physicians = medunnaAppointmentPage.physicians;
        Select select2 = new Select(physicians);
        select2.selectByValue("5223");

        WebElement patient = medunnaAppointmentPage.patient;
        Select select3 = new Select(patient);
        select3.selectByValue("5978");
        medunnaAppointmentPage.save.click();


    }
    //Admin randevu olusturma
    public static void emptyEndDate(){
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaAppointmentPage medunnaAppointmentPage = new MedunnaAppointmentPage();

        medunnaHomePage.itemsdAndTitles.click();
        medunnaHomePage.appoint.click();
        medunnaAppointmentPage.createAppoint.click();

        medunnaAppointmentPage.startDate.sendKeys("15.12.2023 00.00");
        medunnaAppointmentPage.endDate.clear();

        WebElement status = medunnaAppointmentPage.status;
        Select select = new Select(status);
        select.selectByIndex(1);

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 650);
        actions.perform();

        WebElement physicians = medunnaAppointmentPage.physicians;
        Select select2 = new Select(physicians);
        select2.selectByValue("5223");

        WebElement patient = medunnaAppointmentPage.patient;
        Select select3 = new Select(patient);
        select3.selectByValue("5978");
        medunnaAppointmentPage.save.click();

    }

    public static void createRoom(){
        MedunnaRoomPage medunnaRoomPage=new MedunnaRoomPage();
        medunnaRoomPage.titles.click();
        medunnaRoomPage.room.click();
        medunnaRoomPage.createANewRoomButton.click();
        Faker faker=new Faker();
        String roomNumber=faker.number().digits(5);
        medunnaRoomPage.roomNumberInput.sendKeys(roomNumber);
        WebElement roomType=medunnaRoomPage.roomTypeDropDown;
        Select select=new Select(roomType);
        select.selectByIndex(0);
        medunnaRoomPage.statusCheckbox.click();
        medunnaRoomPage.priceInput.sendKeys("100");
        medunnaRoomPage.descriptionInput.sendKeys("Twin Room");
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 500);
        actions.perform();
        medunnaRoomPage.createdDate.sendKeys("05.05.2024 00:00");
        medunnaRoomPage.saveSubmitButton.click();
    }
    public static void EmptyRoomNumber(){
        MedunnaRoomPage medunnaRoomPage=new MedunnaRoomPage();
        medunnaRoomPage.titles.click();
        medunnaRoomPage.room.click();
        medunnaRoomPage.createANewRoomButton.click();

        WebElement roomType=medunnaRoomPage.roomTypeDropDown;
        Select select=new Select(roomType);
        select.selectByIndex(0);
        medunnaRoomPage.statusCheckbox.click();
        medunnaRoomPage.priceInput.sendKeys("100");
        medunnaRoomPage.descriptionInput.sendKeys("Twin Room");
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 500);
        actions.perform();
        medunnaRoomPage.createdDate.sendKeys("05.05.2024 00:00");
        medunnaRoomPage.saveSubmitButton.click();
    }

    public static void EmptyPrice(){
        MedunnaRoomPage medunnaRoomPage=new MedunnaRoomPage();
        medunnaRoomPage.titles.click();
        medunnaRoomPage.room.click();
        medunnaRoomPage.createANewRoomButton.click();
        Faker faker=new Faker();
        String roomNumber=faker.number().digits(5);
        medunnaRoomPage.roomNumberInput.sendKeys(roomNumber);
        WebElement roomType=medunnaRoomPage.roomTypeDropDown;
        Select select=new Select(roomType);
        select.selectByIndex(0);
        medunnaRoomPage.statusCheckbox.click();
        //medunnaRoomPage.priceInput.sendKeys("100");
        medunnaRoomPage.descriptionInput.sendKeys("Twin Room");
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 500);
        actions.perform();
        medunnaRoomPage.createdDate.sendKeys("05.05.2024 00:00");
        medunnaRoomPage.saveSubmitButton.click();
    }
    //geçersiz tarihle oda ekleme
    public static void NegDateCreateRoom(){
        MedunnaRoomPage medunnaRoomPage=new MedunnaRoomPage();
        medunnaRoomPage.titles.click();
        medunnaRoomPage.room.click();
        medunnaRoomPage.createANewRoomButton.click();
        Faker faker=new Faker();
        String roomNumber=faker.number().digits(5);
        medunnaRoomPage.roomNumberInput.sendKeys(roomNumber);
        WebElement roomType=medunnaRoomPage.roomTypeDropDown;
        Select select=new Select(roomType);
        select.selectByIndex(0);
        medunnaRoomPage.statusCheckbox.click();
        medunnaRoomPage.priceInput.sendKeys("100");
        medunnaRoomPage.descriptionInput.sendKeys("Twin Room");
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 500);
        actions.perform();
        medunnaRoomPage.createdDate.sendKeys("05.05.2023 00:00");
        medunnaRoomPage.saveSubmitButton.click();
    }
    public static void emptyDescrption(){
        MedunnaRoomPage medunnaRoomPage=new MedunnaRoomPage();
        medunnaRoomPage.titles.click();
        medunnaRoomPage.room.click();
        medunnaRoomPage.createANewRoomButton.click();
        Faker faker=new Faker();
        String roomNumber=faker.number().digits(5);
        medunnaRoomPage.roomNumberInput.sendKeys(roomNumber);
        WebElement roomType=medunnaRoomPage.roomTypeDropDown;
        Select select=new Select(roomType);
        select.selectByIndex(0);
        medunnaRoomPage.statusCheckbox.click();
        medunnaRoomPage.priceInput.sendKeys("100");
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 500);
        actions.perform();
        medunnaRoomPage.createdDate.sendKeys("05.05.2024 00:00");
        medunnaRoomPage.saveSubmitButton.click();
    }


    // Güncelle (Settings)
    public static void LastNameGuncelleme(){
        MedunnaSettingPage medunnaSettingPage=new MedunnaSettingPage();
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        medunnaHomePage.profil.click();
        medunnaHomePage.settings.click();
        medunnaSettingPage.lastnameBox.clear();
        Faker faker=new Faker();
        String lastName=faker.name().lastName();
        // String email=faker.internet().emailAddress();
        medunnaSettingPage.lastnameBox.sendKeys(lastName);
        medunnaSettingPage.saveButton.click();
    }

    // Güncelle (Settings)
    public static void EmptyLastName(){
        MedunnaSettingPage medunnaSettingPage=new MedunnaSettingPage();
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        medunnaHomePage.profil.click();
        medunnaHomePage.settings.click();
        medunnaSettingPage.lastnameBox.clear();
        medunnaSettingPage.saveButton.click();
    }
    // Güncelle (Settings)
    public static void EmptyEmail(){
        MedunnaSettingPage medunnaSettingPage=new MedunnaSettingPage();
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        medunnaHomePage.profil.click();
        medunnaHomePage.settings.click();
        medunnaSettingPage.emailBox.clear();
        medunnaSettingPage.saveButton.click();
    }


    // Güncelle (Settings)
    public static void FirstNameGuncelleme(){
        MedunnaSettingPage medunnaSettingPage=new MedunnaSettingPage();
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        medunnaHomePage.profil.click();
        medunnaHomePage.settings.click();
        medunnaSettingPage.nameBox.clear();
        Faker faker=new Faker();
        String name=faker.name().username();
        // String email=faker.internet().emailAddress();
        medunnaSettingPage.nameBox.sendKeys(name);
        medunnaSettingPage.saveButton.click();
    }


    // Güncelle (Settings)
    public static void EmptyFirstName(){
        MedunnaSettingPage medunnaSettingPage=new MedunnaSettingPage();
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        medunnaHomePage.profil.click();
        medunnaHomePage.settings.click();
        medunnaSettingPage.nameBox.clear();
        medunnaSettingPage.saveButton.click();
    }
    // Güncelle (Settings)
    public static void EmailGuncelleme(){
        MedunnaSettingPage medunnaSettingPage=new MedunnaSettingPage();
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        medunnaHomePage.profil.click();
        medunnaHomePage.settings.click();
        medunnaSettingPage.emailBox.clear();
        Faker faker=new Faker();
        String email=faker.internet().emailAddress();
        medunnaSettingPage.emailBox.sendKeys(email);
        medunnaSettingPage.saveButton.click();
    }
    //Medunna giriş
    public static void Login(){
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        medunnaHomePage.userIcon.click();
        medunnaHomePage.signInOption.click();
        medunnaLoginPage.usernameInput.sendKeys(ConfigReader.getProperty("medunna_username"));
        medunnaLoginPage.passwordInput.sendKeys(ConfigReader.getProperty("medunna_password"));
        medunnaLoginPage.signInSubmitButton.click();
    }

    //Alert ACCEPT
    public static void alertAccept() {
        Driver.getDriver().switchTo().alert().accept();
    }

    //Alert DISMISS
    public static void alertDismiss() {
        Driver.getDriver().switchTo().alert().dismiss();
    }

    //Alert getText()
    public static void alertText() {
        Driver.getDriver().switchTo().alert().getText();
    }

    //Alert promptBox
    public static void alertprompt(String text) {
        Driver.getDriver().switchTo().alert().sendKeys(text);
    }

    //DropDown VisibleText
    /*
        Select select2 = new Select(gun);
        select2.selectByVisibleText("7");

        //ddmVisibleText(gun,"7"); --> Yukarıdaki kullanım yerine sadece method ile handle edebilirim
     */
    public static void ddmVisibleText(WebElement ddm, String secenek) {
        Select select = new Select(ddm);
        select.selectByVisibleText(secenek);
    }

    //DropDown Index
    public static void ddmIndex(WebElement ddm, int index) {
        Select select = new Select(ddm);
        select.selectByIndex(index);
    }

    //DropDown Value
    public static void ddmValue(WebElement ddm, String secenek) {
        Select select = new Select(ddm);
        select.selectByValue(secenek);
    }

    //SwitchToWindow1
    public static void switchToWindow(int sayi) {
        List<String> tumWindowHandles = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tumWindowHandles.get(sayi));
    }

    //SwitchToWindow2
    public static void window(int sayi) {
        Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().toArray()[sayi].toString());
    }
    //EXPLICIT WAIT METHODS

    //Visible Wait
    public static void visibleWait(WebElement element, int sayi) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    //VisibleElementLocator Wait
    public static WebElement visibleWait(By locator, int sayi) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    //Alert Wait
    public static void alertWait(int sayi) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
        wait.until(ExpectedConditions.alertIsPresent());

    }

    //Tüm Sayfa ScreenShot
    public static String tumSayfaResmi(String name) {
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        String dosyaYolu = System.getProperty("user.dir") + "/target/Screenshots/" + name + tarih + ".png";
        try {
            FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dosyaYolu;
    }

    //WebElement ScreenShot
    public static void webElementResmi(WebElement element) {
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "TestOutput/screenshot/webElementScreenshot" + tarih + ".png";

        try {
            FileUtils.copyFile(element.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //WebTable
    public static void printData(int satir, int sutun) {
        WebElement satirSutun = Driver.getDriver().findElement(By.xpath("(//tbody)[1]//tr[" + satir + "]//td[" + sutun + "]"));
        System.out.println(satirSutun.getText());
    }

    //Click Method
    public static void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();", element);
        }
    }

    //JS Scroll
    public static void scroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //JS Sayfa Sonu Scroll
    public static void scrollEnd() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    //JS Sayfa Başı Scroll
    public static void scrollHome() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }

    //JS SendKeys
    public static void sendKeysJS(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].value='" + text + "'", element);
    }

    //JS SendAttributeValue
    public static void sendAttributeJS(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
    }

    //JS GetAttributeValue
    public static void getValueByJS(String id, String attributeName) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String attribute_Value = (String) js.executeScript("return document.getElementById('" + id + "')." + attributeName);
        System.out.println("Attribute Value: = " + attribute_Value);
    }
}