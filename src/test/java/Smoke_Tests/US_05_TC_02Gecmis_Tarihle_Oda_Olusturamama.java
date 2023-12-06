package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaRoomPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_05_TC_02Gecmis_Tarihle_Oda_Olusturamama {
    MedunnaRoomPage medunnaRoomPage = new MedunnaRoomPage();

    @Test
    public void GecmisTarihleOdaOlusturulamama() {
        //Anasayfaya git ve login ol
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        ReusableMethods.Login("username", "password");

        //Items&Tıtles dan "room" seç
        ReusableMethods.NegDateCreateRoom();

        //Eski tarihle oda oluşturuldu negatif doğrulama yap
        String expected = "This is invalid date!";
        String actual = medunnaRoomPage.positiveVerify.getText();
        Assert.assertNotEquals(actual,expected);
        Driver.closeDriver();
    }
}