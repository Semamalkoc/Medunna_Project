package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaAppointmentPage;
import pages.MedunnaHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_02_TC_05Belirli_Alanlar_Bos_Bırakılarak_Randevu_Alma {
    @Test
    public void Belirli_Alanlar_Bos_Bırakılarak_Randevu_Alma() {

            MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
            MedunnaAppointmentPage medunnaAppointmentPage = new MedunnaAppointmentPage();

            //Anasayfaya git ve Login ol
            Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
            ReusableMethods.Login();

            //Anemsis,Treatment,Diagnosis,Prescription,Physician,Patient kutucuklarını bos bırakarak randevu oluştur.
            ReusableMethods.AdminRandevuOlusturma();

            //"A new appointment is created with identifier" mesajının göründüğünü doğrula
            Assert.assertTrue(medunnaAppointmentPage.positiveVerify.isDisplayed());
    }
}
