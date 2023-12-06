package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import pages.MedunnaAppointmentPage;
import pages.MedunnaHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_02_TC_04Gecmis_Tarihli_Randevu_Alamama {
    @Test
    public void Gecmis_Tarihli_Randevu_Alamama() {
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaAppointmentPage medunnaAppointmentPage = new MedunnaAppointmentPage();

        //Anasayfaya git ve Login ol
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        ReusableMethods.Login();


        //Geçmis tarih girerek randevu al
        ReusableMethods.PastDateAppointment();

        //Hata mesajının gelmediğini doğrula
        String expected="This is date invalid'";
        WebElement actual=medunnaAppointmentPage.positiveVerify;
        Assert.assertFalse(actual.getText().contains(expected));

        Driver.closeDriver();






    }
}
