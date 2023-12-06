package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaAppointmentPage;
import pages.MedunnaHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_02_TC_03End_Date_Bos_Birakilarak_Randevu_Olusturamama {
    @Test
    public void End_Date_Bos_Birakilarak_Randevu_Olusturamama() {
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaAppointmentPage medunnaAppointmentPage = new MedunnaAppointmentPage();

        //Anasayfaya git ve Login ol
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        ReusableMethods.Login();


        //Start date ı bos bırakarak save e tıkla
        ReusableMethods.emptyEndDate();

        //Save tıkladıktan sonra aynı sayfada kaldığını doğrula
        Assert.assertTrue(medunnaAppointmentPage.save.isDisplayed());


        Driver.closeDriver();

    }
}
