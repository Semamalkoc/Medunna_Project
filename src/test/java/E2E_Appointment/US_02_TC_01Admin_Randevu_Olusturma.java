package E2E_Appointment;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaAppointmentPage;
import pages.MedunnaHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_02_TC_01Admin_Randevu_Olusturma {
    @Test
    public void SistemeKayitOlamadanRandevuAlma() {
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaAppointmentPage medunnaAppointmentPage = new MedunnaAppointmentPage();

        //Anasayfaya git ve Login ol
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        ReusableMethods.Login();

        //Admin hesabıyla hasta randevusu oluştur.
        ReusableMethods.AdminRandevuOlusturma();

        //"A new appointment is created with identifier" mesajının göründüğünü doğrula
        Assert.assertTrue(medunnaAppointmentPage.positiveVerify.isDisplayed());
      //  Driver.getDriver().close();

    }
}
